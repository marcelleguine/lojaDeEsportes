package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ProductBean;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelleguine
 */
public class ProductDAO {
    
    Connection conexao;
    
    public ProductDAO(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/loja_esportes", "root", "");
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConexao() {
        return conexao;
    }
    
    public boolean insertIntoProducts(String name, double price, int qnt) throws Exception {
        Statement sql = conexao.createStatement();
        int resp = sql.executeUpdate("insert into products (name, price, qnt) values ('" + name + "'," + price + "," + qnt + ")");
        if(resp == 0) {
            return false;
        }
        return true;
    }
    
    public ProductBean selectFromProducts() throws Exception {
        Statement sql = conexao.createStatement();
        ResultSet resultado = sql.executeQuery("select * from products");
        
        resultado.first();
        
        int id = resultado.getInt("id");
        String name = resultado.getString("name");
        double price = resultado.getDouble("price");
        int qnt = resultado.getInt("qnt");
        
        ProductBean bean = new ProductBean(id, name, price, qnt);
        
        return bean;
    }
    
    public ArrayList<ProductBean> selectAllProducts() throws Exception {
        Statement sql = conexao.createStatement();
        ArrayList<ProductBean> products = new ArrayList<ProductBean>();
        ResultSet result = sql.executeQuery("select * from products");
        
        result.first();
        
        do {
            int id = result.getInt("id");
            String name = result.getString("name");
            double price = result.getDouble("price");
            int qnt = result.getInt("qnt");

            products.add(new ProductBean(id, name, price, qnt));
            
        } while(result.next());
        
        return products;
    }
    
    public boolean deleteProduct(int id) throws Exception {
        Statement sql = conexao.createStatement();
        int resp = sql.executeUpdate("delete from products where id = " + id);
        if(resp == 0) {
            return false;
        }
        return true;
    }
    
    public ProductBean selectProduct(int id) throws Exception {
        Statement sql = conexao.createStatement();
        ResultSet result = sql.executeQuery("select * from products where id = " + id);
        
        result.first();
        int p_id = result.getInt("id");
        String name = result.getString("name");
        double price = result.getDouble("price");
        int qnt = result.getInt("qnt");
        
        return new ProductBean(p_id, name, price, qnt);
    }
    
    public boolean editProduct(int id, String newName, double newPrice, int newQnt) throws Exception {
        Statement sql = conexao.createStatement();
        int resp = sql.executeUpdate("update products set name='" + newName + "', price=" + newPrice + ", qnt=" + newQnt+ " where id=" + id);
        if(resp == 0) {
            return false;
        }
        return true;
    }
    
}
