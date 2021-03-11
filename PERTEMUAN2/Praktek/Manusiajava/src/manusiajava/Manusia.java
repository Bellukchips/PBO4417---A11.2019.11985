/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manusiajava;

import java.util.ArrayList;

/**
 *
 * @author nothing
 */
public class Manusia {
    //inisialisasi variable

    private String name;
    private boolean haveTv;
    private int totalTv = 0;    
   
    
    //constructor
    Manusia(){
        this.name = "No name";
        this.haveTv  = false;
    }
    Manusia(String name){
        this.name = name;
    }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Tv buyTv(Tv tv){
       
        this.haveTv = true;
        this.totalTv +=1;
        return tv;
    }
    public void sellTv(){
        
    }
    public boolean checkTv(){
        return this.haveTv;
    }
    public int getTotal(){
        return this.totalTv;
    }

}
