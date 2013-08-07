/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SaleBean;

/**
 *
 * @author Pedro
 */
public class SaleDAO {
    
    Connection conexao;
    
    public SaleDAO(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/loja_esportes", "root", "");
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String insertIntoSales(int productId, int userId, double unitPrice,int qnt) throws Exception {
        Statement sql = conexao.createStatement();
        PreparedStatement ps0 = conexao.prepareStatement("insert into sales (product_id, user_id, unit_price, qnt, total_price) values (" + productId + "," + userId + "," + unitPrice + "," + qnt + "," + (unitPrice*qnt) +")");
        PreparedStatement ps1 = conexao.prepareStatement("update products set qnt = (qnt-" + qnt + ") where id = " + productId);
        String resp = "";
        try{
            conexao.setAutoCommit(false);
            ps0.executeUpdate();
            ps1.executeUpdate();
            conexao.commit();
            resp = "sucesso;Sua venda foi cadastrada com sucesso.";
        } catch(Exception e) {
            resp = "erro;Não foi possível fazer esta venda.";
            conexao.rollback();
        } finally {
            ps0.close();
            ps1.close();
        }
        
        return resp;
    }
    
    public ArrayList<SaleBean> selectAllSales() throws Exception {
        Statement sql = conexao.createStatement();
        ArrayList<SaleBean> sales = new ArrayList<SaleBean>();
        ResultSet result = sql.executeQuery("select * from sales order by id desc");
        //Usados para pegar nome de produto e usuário.
        ProductDAO p = new ProductDAO();
        UserDAO u = new UserDAO();
        
        if(result.first()) {
        
            do {
                int productId = result.getInt("product_id");
                int userId = result.getInt("user_id");
                double unitPrice = result.getDouble("unit_price");
                double totalPrice = result.getDouble("total_price");
                int qnt = result.getInt("qnt");
                String productName = p.getProductName(productId);
                String userName = u.getUserName(userId);

                sales.add(new SaleBean(productId, productName, userId, userName, unitPrice, qnt, totalPrice));

            } while(result.next());

            return sales;
        } else {
            return null;
        }
    }
    
}
