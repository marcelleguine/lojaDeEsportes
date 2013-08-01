package model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelleguine
 */

public class ProductBean {
    
    private int id;
    private String name;
    private double price;
    private int qnt;
    
    public ProductBean(int i, String n, double p, int q){
        id = i;
        name = n;
        price = p;
        qnt = q;
    }
    
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQnt() {
        return qnt;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
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
}
