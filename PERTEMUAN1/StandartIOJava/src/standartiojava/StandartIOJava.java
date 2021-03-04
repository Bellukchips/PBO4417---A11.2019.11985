/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standartiojava;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author nothing
 */
public class StandartIOJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
       
        InputStreamReader cmd = null;
        
        try {
            cmd = new InputStreamReader(System.in);
            System.out.println("Enter character's , press (q) to quit : ");
            char loop;
            /*
            if cmd != character q
            return true
            */
            do{
                loop = (char) cmd.read();
                System.out.print(loop);
                
            }while(loop != 'q');
            
        } finally {
            if(cmd != null){
                cmd.close();
            }
        }
    }
    
}
