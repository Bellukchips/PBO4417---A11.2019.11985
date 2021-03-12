/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybicycle;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author nothing
 */
public class Bicycle {
    private String merk;
    private int gear;
    private boolean withGear;
    private String color;
    private boolean forward;
    //constuctor
    Bicycle(){
        this.gear = 1;
        this.merk = "No Merk";
        this.withGear = false;
        this.forward = true;
    }
    
    //method getter and setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public boolean isForward() {
        return forward;
    }

    public void setForward(boolean forward) {
        this.forward = forward;
    }

    public void getGear() throws InterruptedException {
         for (int i = 1; i <= this.gear; i++) {
            //add delay
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Gear            : "+i);
            if(i == 5){
                System.out.println("Max Gear is 5");
                break;
            }
        }
    }

    public void setGear() {
        this.gear+=1;
    }

    public boolean isWithGear() {
        return withGear;
    }

    public void setWithGear(boolean withGear) {
        this.withGear = withGear;
    }
   
}
