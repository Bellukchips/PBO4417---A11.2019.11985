/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobildemo;

/**
 *
 * @author nothing
 */
public class Mobil2BMW extends Mobil2{
    private Boolean powerTv;
    private int gear;
    private int channel;
    
    Mobil2BMW(){
        this.powerTv = false;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    public void setPowerTv(Boolean powerTv) {
        this.powerTv = powerTv;
    }

    public Boolean getPowerTv() {
        return powerTv;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }
    
    
    public void show(){
        System.out.println("Tv Menampilkan gambar");
    }
    
    
    
    
}
