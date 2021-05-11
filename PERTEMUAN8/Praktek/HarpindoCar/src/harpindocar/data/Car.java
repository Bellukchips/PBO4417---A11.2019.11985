/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harpindocar.data;

/**
 *
 * @author nothing
 */
public class Car {
     private int price,id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     private String merk;
     private String color;
    
    public Car(int id,int price,String merk,String color){
        this.merk = merk;
        this.price = price;
        this.color = color;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}