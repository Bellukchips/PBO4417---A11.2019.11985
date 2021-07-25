/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

import java.util.Random;

/**
 *
 * @author nothing
 */
public class ProGamer extends Gamer{
       
     @Override
     public void play(){
      int randomIndex = (int) (Math.random() * jenisGame.size());
       System.out.println(nama+" is winning on game  " +  jenisGame.get( randomIndex ) );
     }
}
