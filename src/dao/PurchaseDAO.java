/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.PurchaseBean;

/**
 *
 * @author Pedro
 */
public class PurchaseDAO {
    
    Connection conexao;
    
    public PurchaseDAO(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/loja_esportes", "root", "");
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean insertIntoPurchase(int productId, int userId, int qnt) throws Exception {
        Statement sql = conexao.createStatement();
        int resp = sql.executeUpdate("insert into purchases (product_id, user_id, qnt) values (" + productId + "," + userId + "," + qnt +")");
        int resp2 = sql.executeUpdate("update products set qnt = (qnt+" + qnt + ") where id = " + productId);
        if(resp == 0 || resp2 == 0) {
            return false;
        }
        return true;
    }
    
    public ArrayList<PurchaseBean> selectAllPurchases() throws Exception {
        Statement sql = conexao.createStatement();
        ArrayList<PurchaseBean> purchases = new ArrayList<PurchaseBean>();
        ResultSet result = sql.executeQuery("select * from purchases order by id desc");
        //Usados para pegar nome de produto e usuário.
        ProductDAO p = new ProductDAO();
        UserDAO u = new UserDAO();
        
        if(result.first()) {
            do {
                int productId = result.getInt("product_id");
                int userId = result.getInt("user_id");
                int qnt = result.getInt("qnt");
                String productName = p.getProductName(productId);
                String userName = u.getUserName(userId);

                purchases.add(new PurchaseBean(productId, productName, userId, userName, qnt));

            } while(result.next());

            return purchases;
        } else {
            return null;
        }
    }
    
}
