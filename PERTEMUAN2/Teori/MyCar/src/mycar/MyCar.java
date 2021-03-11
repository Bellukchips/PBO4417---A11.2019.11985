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
public class MyCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car mCar = new Car();
        mCar.setColor("Blue");
        mCar.setProduction(1985);
        mCar.startCar();
        mCar.setTransmision();
        mCar.setTransmision();
        mCar.setTransmision();
        System.out.println("Color Car   : "+mCar.getColor());
        System.out.println("Production  : "+mCar.getProduction());
        System.out.println("Status Car  : "+mCar.getStatusCar());
        mCar.getTransmision();
        mCar.turnOffCar();
        System.out.println("Status Car  : "+mCar.getStatusCar());
        mCar.getTransmision();
    
    }
    
}
