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
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import model.UserBean;

/**
 *
 * @author Pedro
 */
public class UserDAO {
    
    Connection conexao;
    
    public UserDAO() {
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
    
    public boolean insertIntoUser(String login, String password, String name, String cpf, double salary, String birthDate, String email) throws Exception {
        Statement sql = conexao.createStatement();
        if(!birthDate.isEmpty()) {
            //Fazer tratamento de data: botar no formato yyyy-mm-dd, por causa do banco.
            birthDate = "'" + birthDate + "'";
        } else {
            birthDate = "NULL";
        }
        int resp = sql.executeUpdate("insert into users (login, password, name, cpf, salary, birth_date, email) values"
                + " ('" + login + "','" + password + "','" + name + "','" + cpf + "'," + salary + "," + birthDate + ",'" + email + "')");
        if(resp == 0) {
            return false;
        }
        return true;
    }
    
    public ArrayList<UserBean> selectAllUsers() throws Exception {
        Statement sql = conexao.createStatement();
        ArrayList<UserBean> user = new ArrayList<UserBean>();
        ResultSet result = sql.executeQuery("select * from users");
        
        result.first();
        
        do {
            int id = result.getInt("id");
            String name = result.getString("name");
            String cpf = result.getString("cpf");
            double salary = result.getDouble("salary");
            Date birthDate = result.getDate("birth_date");
            String email = result.getString("email");

            user.add(new UserBean(id, name, cpf, salary, birthDate, email));
            
        } while(result.next());
        
        return user;
    }
    
    public boolean deleteUser(int id) throws Exception {
        Statement sql = conexao.createStatement();
        int resp = sql.executeUpdate("delete from users where id = " + id);
        if(resp == 0) {
            return false;
        }
        return true;
    }
    
    public UserBean selectUser(int id) throws Exception {
        Statement sql = conexao.createStatement();
        ResultSet result = sql.executeQuery("select * from users where id = " + id);
        
        result.first();
        int user_id = result.getInt("id");
        String login = result.getString("login");
        String password = result.getString("password");
        String name = result.getString("name");
        String cpf = result.getString("cpf");
        double salary = result.getDouble("salary");
        Date birthDate = result.getDate("birth_date");
        String email = result.getString("email");
        
        return new UserBean(user_id, login, password, name, cpf, salary, birthDate, email);
    }
    
    public boolean editUser(int id, String newLogin, String newPassword, String newName, String newCpf, double newSalary, String newBirthDate, String newEmail) throws Exception {
        Statement sql = conexao.createStatement();
        if(!newBirthDate.isEmpty()) {
            //Fazer tratamento de data: botar no formato yyyy-mm-dd, por causa do banco.
            newBirthDate = "'" + newBirthDate + "'";
        } else {
            newBirthDate = "NULL";
        }
        int resp = sql.executeUpdate("update users set login='" + newLogin + "', password=" + newPassword + ", name='" + newName+ 
                "', cpf='" + newCpf +"', salary=" + newSalary + ", birth_date=" + newBirthDate + ", email='" + newEmail + "' where id=" + id);
        if(resp == 0) {
            return false;
        }
        return true;
    }
    
}
