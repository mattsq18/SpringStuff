package com.genspark.RESTfulAPITest1.Entity;

import javax.persistence.*;


@Entity
@Table(name = "Beverages")
public class Beverages {

    @Id
    @Column(name = "BeverageName")
    private String name; //name of drink
    private String dieted; //diet, non diet, sugar-free etc;
    private String brand; // brand name
    private String cost; //how much it costs

    public Beverages() {

    }

    public Beverages(String dieted, String brand, String cost) {
        this.dieted = dieted;
        this.brand = brand;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDieted() {
        return dieted;
    }

    public void setDieted(String dieted) {
        this.dieted = dieted;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
