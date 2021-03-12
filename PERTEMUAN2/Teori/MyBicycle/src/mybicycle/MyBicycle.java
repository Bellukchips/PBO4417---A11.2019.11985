/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybicycle;

/**
 *
 * @author nothing
 */
public class MyBicycle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       
        Bicycle bike = new Bicycle();
        
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
        Bicycle bike1 = new Bicycle();
        bike1.setColor("Black");
        bike1.setMerk("ONTHEL");
        bike1.setWithGear(false);
        bike1.setForward(false);
        System.out.println("Bike Color      : "+bike1.getColor());
        System.out.println("Bike Merk       : "+bike1.getMerk());
        System.out.println("With Gear?      : "+bike1.isWithGear());
        System.out.println("Move Forward    : "+bike1.isForward());
    }
    
}
