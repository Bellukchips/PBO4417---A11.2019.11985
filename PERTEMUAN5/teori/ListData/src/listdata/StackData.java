/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listdata;
import java.util.*;
/**
 *
 * @author nothing
 */
public class StackData extends VehicleMerk {
    
    private final Stack<VehicleMerk> merk = new Stack<VehicleMerk>();
    StackData(){}
    
    //push data 
    public VehicleMerk pushData(VehicleMerk merk){
        return this.merk.push(merk);
    }
    
    //show data
    public void fetchData(){
      
        for (int i = 0; i < merk.size(); i++) {
             System.out.println(merk.get(i).getMerk());
        }
    }
    
    public void popData(){
        VehicleMerk popmerk = this.merk.pop();
        System.out.println("Pop Stack : "+popmerk.getMerk());
    }
    
    public void peekData(){
        VehicleMerk peekmerk = this.merk.peek();
        System.out.println("Peek Stack : "+peekmerk.getMerk());
    }
//    public void searchData(Stack<VehicleMerk> merkD,int element){
//        int searchmerk = merkD.search(element);
//        if(searchmerk == -1){
//            System.out.println("Element not found ");
//        }else{
//           System.out.println("Element is found at position: " + searchmerk); 
//        }
//    }

}

