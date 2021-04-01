/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancevehicle;

/**
 *
 * @author nothing
 */
public class InheritanceVehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        
        
        //instansiasi
        Bicycle bike = new Bicycle();
        MotorCycle motor = new MotorCycle(4,"G 123 HDK");
        
        bike.ringBell();
        
        System.out.println("Plat motor : "+ motor.getLicensesPlate());
        System.out.println("Engine     : "+motor.getSizeOfEngine());
    }
    
}
