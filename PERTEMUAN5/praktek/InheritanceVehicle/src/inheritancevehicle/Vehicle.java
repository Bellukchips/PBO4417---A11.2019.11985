/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancevehicle;

/**
 *
 * @author nothing
 */
public class Vehicle {
       
    //deklarasi
    private double speed;
    private String color;
    
    //contructor
    Vehicle(){
        this.speed = 0;
        this.color = "Orange";
    }
    public void goStaight(){
        System.out.println("Maju");
    }
    public void turnLeft(){
        System.out.println("Belok kiri");
    }
    public void turnRight(){
        System.out.println("Belok kanan");
    }
    
}
