/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listdata;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author nothing
 */
public class QueueData extends VehicleMerk {
    private final Queue<VehicleMerk> merk = new LinkedList<>();
    
    QueueData(){
        
    }
    
    public void addData(VehicleMerk merk){
        this.merk.add(merk);
    }
    
    public void removeData(VehicleMerk merk){
        this.merk.remove(merk);
    }
    
    public void fetchData(){
          
         for (int i = 0; i < merk.size(); i++) {;
             System.out.println(merk.element().getMerk());
        };
    }
    public void pollData(){
        VehicleMerk peekmerk = this.merk.poll();
        System.out.println("Poll Queue : "+peekmerk.getMerk());
    }
}
