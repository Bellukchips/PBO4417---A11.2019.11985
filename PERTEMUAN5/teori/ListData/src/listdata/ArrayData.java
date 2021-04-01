/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listdata;
import java.util.ArrayList;

/**
 *
 * @author nothing
 */
public class ArrayData extends VehicleMerk {
    
    private final ArrayList<VehicleMerk> merkKendaraan = new ArrayList<>();
    
    public void addNewData(VehicleMerk merk){
        merkKendaraan.add(merk);
    }
    public void fetchData(){
         for (int i = 0; i < merkKendaraan.size(); i++) {
            System.out.println("Merk : "+merkKendaraan.get(i).getMerk());
        }
    }
    public void removeData(VehicleMerk merk){
        merkKendaraan.remove(merk);
    }
}
