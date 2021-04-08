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
    public static void main(String[] args) throws InterruptedException {

        //instansiasi
        Bicycle bike = new Bicycle();
        MotorVehicle motor = new MotorVehicle(4, "G 123 HDK");

        bike.ringBell();

        System.out.println("Plat motor : " + motor.getLicensesPlate());
        System.out.println("Engine     : " + motor.getSizeOfEngine());

        MotorCycle motorCycle = new MotorCycle();
        motorCycle.setPower(true);
        System.out.println("Mesin On ?  : "+motorCycle.getPower());
        if(motorCycle.getPower() == false){
            System.out.println("Mesin Off");
        }else{
            motorCycle.goStraight();
        }
        motorCycle.setSpeed(50);
        motorCycle.getSpeedMotor();
        System.out.println("");
        System.out.println("");
        System.out.println("=== Car===");
        
        Car myCar = new Car();
        myCar.setPower(true);
        System.out.println("Mesin On?    : "+myCar.getPower());
        myCar.setSeatBelt(true);
        System.out.println("SeatBelt Ok? : "+myCar.getSeatbelt());
        if(myCar.getSeatbelt() == false){
            System.out.println("");
        }else{
            myCar.goStraight();
        }
        myCar.setSpeed(70);
        myCar.getSpeedCar();
    }

}
