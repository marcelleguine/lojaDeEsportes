package model;

import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelleguine
 */
public class UserBean {
    
    private int id;
    private String login;
    private String password;
    private String name;
    private String cpf;
    private double salary;
    private Date date;
    private String email;
    
    public UserBean(int i, String n, String c, double s, Date d, String e){
        id = i;
        name = n;
        cpf = c;
        salary = s;
        date = d;
        email = e;
    }
    
    public UserBean(int i, String l, String p, String n, String c, double s, Date d, String e){
        id = i;
        login = l;
        password = p;
        name = n;
        cpf = c;
        salary = s;
        date = d;
        email = e;
    }
    
    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalary() {
        return salary;
    }

    public Date getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
