/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportasidemo;

import transportasi.Sepeda;
import transportasi.Mobil;

/**
 *
 * @author nothing
 */
public class TransportasiDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        Sepeda bike = new Sepeda();
        
        //set property
        bike.setColor("Black");
        bike.setMerk("POLYGON");
        bike.setWithGear(true);
        bike.setGear();
        bike.setGear();
        bike.setGear();
        bike.setGear();
        bike.setGear();
        System.out.println("Bike Color      : "+bike.getColor());
        System.out.println("Bike Merk       : "+bike.getMerk());
        System.out.println("With Gear?      : "+bike.isWithGear());
        System.out.println("Move Forward    : "+bike.isForward());
        bike.getGear();
        System.out.println("=====================================");
        
        
        
        Mobil mCar = new Mobil();
        mCar.setColor("Blue");
        mCar.setProduction(1985);
        mCar.startCar();
        mCar.setTransmision();
        mCar.setTransmision();
        mCar.setTransmision();
        mCar.setTransmision();
        mCar.setTransmision();

        System.out.println("Color Car   : "+mCar.getColor());
        System.out.println("Production  : "+mCar.getProduction());
        System.out.println("Status Car  : "+mCar.getStatusCar());
        mCar.getTransmision();
        System.out.println("===========Mulai Mematikan Mesin==========");
        mCar.turnOffCar();
    }
    
}
