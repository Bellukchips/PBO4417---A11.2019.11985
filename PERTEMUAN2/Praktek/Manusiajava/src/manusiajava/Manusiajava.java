/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manusiajava;

/**
 *
 * @author nothing
 */
public class Manusiajava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //test no name
        Manusia manusia = new Manusia("Lukman");
        Tv tv = new Tv();
        tv.setMerk("LG");
        tv.setOwner(manusia.getName());
        manusia.buyTv(tv);
        System.out.println("Nama    : "+manusia.getName());
        System.out.println("Merk tv : "+tv.getMerk());
        System.out.println("Owner   : "+tv.getOwner());
        System.out.println("Total Tv: "+manusia.getTotal());
        System.out.println("Status  : "+manusia.checkTv());
        
        System.out.println("===============================");
        
        Manusia manusia1 = new Manusia("Undertaker");
        Tv tv1 = new Tv();
        tv1.setMerk("SHARP");
        tv1.setOwner(manusia1.getName());
        manusia1.buyTv(tv1);
        System.out.println("Nama    : "+manusia1.getName());
        System.out.println("Merk tv : "+tv1.getMerk());
        System.out.println("Owner   : "+tv1.getOwner());
        System.out.println("Total Tv: "+manusia1.getTotal());
        System.out.println("Status  : "+manusia1.checkTv());
    }
    
}
