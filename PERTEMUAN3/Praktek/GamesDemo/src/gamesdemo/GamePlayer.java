/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesdemo;

/**
 *
 * @author nothing
 */
public class GamePlayer {
    
    //inisialisasi variable
    private double width;
    private double height;
    private int positionX;
    private int positionY;
    
    //constructor
    GamePlayer(){}
    GamePlayer(double width,double height,int positionX,int positionY){
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    GamePlayer(double width,double height){
        this.height = height;
        this.width = width;
    }
    
    //setter dimension & position
    
    public void setDimension(double width,double height){
        this.height = height;
        this.width = width;
    }
    public void setPosition(int x, int y){
        this.positionX = x;
        this.positionY = y;
    }
    
    //getter dimension & position
    
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    
    public int getX(){
        return this.positionX;
    }
    public int getY(){
        return this.positionY;
    }
    
    //method for running player
    public void Run(){
        System.out.println("Player is running ...");
    }
    public void Run(int incrementX){
        this.positionX = this.positionX +  incrementX;
        System.out.println("Player still running ..current X position :"+this.positionX);
    }
    
}
