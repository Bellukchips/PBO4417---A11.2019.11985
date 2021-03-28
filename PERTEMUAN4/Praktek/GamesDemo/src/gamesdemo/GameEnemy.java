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
public class GameEnemy {
        //inisialisasi variable
    private double width;
    private double height;
    private int positionX;
    private int positionY;
    
    
    //consturctor
    GameEnemy(){}
    GameEnemy(double width,double height){
        this.width = width;
        this.height = height;
    }
    GameEnemy(double width,double height,int positionX,int positionY){
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    
    //setter dimension & position
    public void setDimension(double width,double height){
        this.width = width;
        this.height = height;
    }
    public void setPosition(int positionX,int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }
    // getter position & dimension
    
        
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
    
    //method enemy running
    public void Run(){
        System.out.println("Enemy is running....");
    }
}
