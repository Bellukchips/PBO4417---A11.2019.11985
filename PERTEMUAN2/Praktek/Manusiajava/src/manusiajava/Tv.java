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
public class Tv {
    private String merk;
    private int harga;
     //variable
    private int channel = 1;
    private int volumeLevel = 1;
    private boolean power = false;
    Tv(){
        
    }
    public String getMerk() {
     
        return this.merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getharga() {
        return harga;
    }

    public void setharga(int harga) {
        this.harga = harga;
    }
     //method turn on tv
    public  boolean turnOn(String tvName){
        power = true;
        System.out.println("== "+tvName+" On==");
        return power;
    }
    
    //method turn of tv
    public boolean turnOf(String tvName){
        power = false;
        System.out.println("== "+tvName+" OFF==");
        return power;
    }
    
    //method set channel
    public int setChannel(int newChannel){
     channel = newChannel;
     return newChannel;
    }
    
    //method set level volume
    
    public int setVolume(int newVolume){
        volumeLevel = newVolume;
        return newVolume;
    }
    
    //method set channel up
    public int UpChannel(){
       return channel +=1;
       
    }
    
    //method set channel down
    public int downChannel(){
        channel -=1;
       if(channel <1){
           System.out.println("set channel 1");
       }
       return channel;
    }
    
      //method set volume up
    public int volumeUp(){
       return volumeLevel +=1;
       
    }
     //method set volume up
    public int volumeDown(){
      volumeLevel -=1;
      if(volumeLevel <1){
          System.out.println("set volume 1");
      }
      return volumeLevel;
    }
    
    
}
