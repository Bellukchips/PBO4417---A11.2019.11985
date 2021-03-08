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
public class TestSimpleCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //call class simple cirle
        SimpleCirlce circle1 = new SimpleCirlce();
        
        System.out.println("The area of circle1 of radius :"+circle1.radius + " is "+ circle1.getArea());
        System.out.println("Perimeter circle1 : "+circle1.getParimeter());
        SimpleCirlce circle2 = new SimpleCirlce(25);
        System.out.println("The area of circle2 of radius :"+circle2.radius + " is "+ circle2.getArea());
        System.out.println("Perimeter circle2 : "+circle2.getParimeter());
        SimpleCirlce circle3 = new SimpleCirlce(125);
        System.out.println("The area of circle3 of radius :"+circle3.radius + " is "+ circle3.getArea());
        System.out.println("Perimeter circle3 : "+circle3.getParimeter());
        //modify
        System.out.println("=======================");
        System.out.println("Modify radius circle 2");
        circle2.radius = 200;
        System.out.println("The area of circle of radius :"+circle2.radius + " is "+ circle2.getArea());
    }
    
}
