/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancevehicle;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author nothing
 */
public class MotorCycle extends Vehicle {
    private int numGear;
    private Boolean power;

    public void setPower(Boolean power) {
        this.power = power;
    }

    public Boolean getPower() {
        return power;
    }
    
    
    // constructor
    MotorCycle(){
        this.numGear = 0;
        this.power = false;
    }
    
    public void setGear(int gear){
        this.numGear = gear;
    }
    public int getGear(){
        return this.numGear;
    }
    
    public void getSpeedMotor() throws InterruptedException{
        if(this.power == false){
            System.out.println("turn on your vehicle");
        }else{
            for (int i = 1; i <= getSpeed(); i++) {
            TimeUnit.SECONDS.sleep((long) 0.9); //ubah ini
            System.out.println("Speed : "+i);
            if(i == 10){
                setGear(1);
                System.out.println("Gear : "+getGear());
            }else if (i == 25){
                setGear(2);
                System.out.println("Gear : "+getGear());
            }else if (i == 35){
                setGear(3);
                System.out.println("Gear : "+getGear());
            }else if (i == 40){
                setGear(4);
                System.out.println("Gear : "+getGear());
            }else if(i > 45){
                System.out.println("Warning ! you is very fast");
            }
        }
        }
    }
    
}
