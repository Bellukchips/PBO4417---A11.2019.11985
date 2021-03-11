/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycar;

/**
 *
 * @author nothing
 */
public class Car {
    private String color;
    private int productionYear;
    private boolean power;
    private int transmision;
    Car(){
        //set warna default
        this.color = "Putih";
        this.power = false;
        this.transmision = 0;
    }
    
    public boolean startCar(){
       return this.power = true;
    }
    public void turnOffCar(){
        for (int j = this.transmision; j>= this.transmision; j--) {
            System.out.println("Transmision : "+j);
        }
        this.power = false;
    }
    public void setTransmision(){
        this.transmision +=1;
    }
    public void getTransmision(){
        for (int i = 1; i <= this.transmision; i++) {
            System.out.println("Transmision : "+i);
        }
    }
    public boolean getStatusCar(){
        return this.power;
    }
    public String setColor(String color){
        return this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public int setProduction(int production){
        return this.productionYear = production;
    }
    public int getProduction(){
        return this.productionYear;
    }
}
