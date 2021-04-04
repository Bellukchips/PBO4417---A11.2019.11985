/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listdata;

import java.util.Stack;


/**
 *
 * @author nothing
 */
public class ListData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instansiasi
        System.out.println("===ArrayList===");
        ArrayData array = new ArrayData();
        VehicleMerk vehicle = new VehicleMerk();
        VehicleMerk vehicle1 = new VehicleMerk();
        VehicleMerk vehicle2 = new VehicleMerk();
        VehicleMerk vehicle3 = new VehicleMerk();
        
        // set data
        vehicle.setMerk("HONDA");
        vehicle1.setMerk("YAMAHA");
        vehicle2.setMerk("SUZUKI");
        vehicle3.setMerk("FERRARI");
        
        //add array list
        array.addNewData(vehicle);
        array.addNewData(vehicle1);
        array.addNewData(vehicle2);
        array.addNewData(vehicle3);
        array.fetchData();
        
        //remove array list
        System.out.println("====After remove list===");
        array.removeData(vehicle);
        array.removeData(vehicle3);
        array.fetchData();
        
        
        // stack data
        System.out.println("");
        System.out.println("");
        System.out.println("===Stack Data===");
        StackData stack = new StackData();
        Stack<VehicleMerk> stack1 = new Stack<VehicleMerk>();
        stack.pushData(vehicle);
        stack.pushData(vehicle1);
        stack.pushData(vehicle2);
        stack.pushData(vehicle3);
        stack.fetchData();
        
        //pop data
        stack.popData();
        System.out.println("===After Pop Data===");
        stack.fetchData();
        //peek data
        stack.peekData();
//        stack.searchData(stack1,2);
        
        // queue data
        System.out.println("");
        System.out.println("");
        System.out.println("===Queue Data===");
        QueueData queue = new QueueData();
        
        queue.addData(vehicle);
        queue.addData(vehicle1);
        queue.addData(vehicle2);
        queue.addData(vehicle3);
        queue.fetchData();
        
//        //remove queue
        queue.removeData(vehicle1);
        System.out.println("===After Remove queue");
        queue.fetchData();
    
        //poll queue
        queue.pollData();
        System.out.println("===After Poll queue");
        queue.fetchData();
        
        queue.size();
    }   
}
