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
    
    private String name;
    private String cpf;
    private double salary;
    private Date date;
    private String email;
    
    public UserBean(){
        
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
}
