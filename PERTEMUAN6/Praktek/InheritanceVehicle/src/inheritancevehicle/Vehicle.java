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
    private int speed;
    private String color;
    
    //contructor
    Vehicle(){
        this.speed = 0;
        this.color = "Orange";
    }
    public void goStraight(){
        System.out.println("Kendaraan Maju");
    }
    public void turnLeft(){
        System.out.println("Kendaraan Belok kiri");
    }
    public void turnRight(){
        System.out.println("Kendaraan Belok kanan");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public double getSpeed(){
        return this.speed;
    }
    
}
