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
public class Car extends Vehicle {

    private int numGear;
    private Boolean seatbelt;
    private Boolean power;

    //contructor
    Car() {
        this.seatbelt = false;
        this.power = false;
    }

    public void setPower(Boolean power) {
        this.power = power;
    }

    public Boolean getPower() {
        return power;
    }

    public void setSeatBelt(Boolean seatBelt) {
        this.seatbelt = seatBelt;
    }

    public Boolean getSeatbelt() {
        return seatbelt;
    }

    public void setGear(int gear) {
        this.numGear = gear;
    }

    public int getGear() {
        return this.numGear;
    }

    public void getSpeedCar() throws InterruptedException {
        if(this.seatbelt == false || this.power == false){
            System.out.println("Use seatbelt please! or turn on your car");
        }else{
            for (int i = 1; i <= getSpeed(); i++) {
            TimeUnit.SECONDS.sleep((long) 0.9);  //ubah ini
            System.out.println("Speed : " + i);
            if (i == 10) {
                setGear(1);
                System.out.println("Gear : " + getGear());
            } else if (i == 25) {
                setGear(2);
                System.out.println("Gear : " + getGear());
            } else if (i == 35) {
                setGear(3);
                System.out.println("Gear : " + getGear());
            } else if (i == 40) {
                setGear(4);
                System.out.println("Gear : " + getGear());
            } else if (i == 50) {
                setGear(5);
                System.out.println("Gear : " + getGear());
            } else if (i == 60) {
                setGear(6);
                System.out.println("Gear : " + getGear());
            } else if (i > 65) {
                System.out.println("Warning ! you is very fast");
            }
        }
        }
    }
}
