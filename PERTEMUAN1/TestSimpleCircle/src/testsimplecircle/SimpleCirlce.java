/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsimplecircle;

/**
 *
 * @author nothing
 */
public class SimpleCirlce {
    double radius = 1;
    //constructor
    SimpleCirlce(double currentRadius){
        radius = currentRadius;
    }

    SimpleCirlce() {
        
    }
    
    //method
    public  double getArea(){
        return radius * radius * Math.PI;
    }
    public double getParimeter(){
        return 2 * radius * Math.PI;
    }
    public double setRadius(double currentRadius){
        return radius = currentRadius;
    }
}
