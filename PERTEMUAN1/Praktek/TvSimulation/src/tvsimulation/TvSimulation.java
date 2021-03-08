/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvsimulation;

/**
 *
 * @author nothing
 */
public class TvSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TvClass tv1 = new  TvClass();
        tv1.turnOn("TV 1");
        tv1.setChannel(30);
        tv1.setVolume(3);    
        System.out.println("tv1 channel is "+tv1.channel+ " and volume is "+ tv1.volumeLevel);
        tv1.turnOf("Tv 1");
        
        
        System.out.println("Switch tv");
        
        
        TvClass tv2 = new TvClass();
        tv2.turnOn("TV 2");
        tv2.UpChannel();
        tv2.UpChannel();
        tv2.volumeUp();
        System.out.println("tv2 channel is "+tv2.channel+ " and volume is "+ tv2.volumeLevel);
        tv2.turnOf("TV 2");
        
    }
    
}
