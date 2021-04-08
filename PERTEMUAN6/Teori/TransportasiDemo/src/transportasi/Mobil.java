package transportasi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.concurrent.TimeUnit;

/**
 *
 * @author nothing
 */
public class Mobil {
    private String color = "Putih";
    private int productionYear = 0;
    private boolean power = false;
    private int transmision = 0;
  
    public boolean startCar(){
       return this.power = true;
    }
    public void turnOffCar() throws InterruptedException{
        this.power = false;
        for (int j = this.transmision; j>= 1; j--) {
            //add delay
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Transmision : "+j+" Ngung...");
        }
        System.out.println("Status  : "+this.power);
        
    }
    public void setTransmision(){
        this.transmision +=1;
    }
    public void getTransmision() throws InterruptedException{
        for (int i = 1; i <= this.transmision; i++) {
            //add delay
            TimeUnit.SECONDS.sleep(1);
            if(i == 1){
                System.out.println("Transmision : "+i);
            }else{
               System.out.println("Transmision : "+i+" Ngung...");  
            }
           
        }
    }
    public boolean getStatusCar(){
        return this.power;
    }
    public String setColor(String color){
        return this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public int setProduction(int production){
        return this.productionYear = production;
    }
    public int getProduction(){
        return this.productionYear;
    }
}
