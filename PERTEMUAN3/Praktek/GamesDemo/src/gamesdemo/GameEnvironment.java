/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gamesdemo;

import java.util.ArrayList;

/**
 *
 * @author nothing
 */
public class GameEnvironment {
    

    //deklarasi
    private double width;
    private double height;
    private ArrayList<GamePlayer> arrPlayer = new ArrayList<GamePlayer>();
    private ArrayList<GameEnemy> arrEnemy = new ArrayList<GameEnemy>();
    

    //contructor
    GameEnvironment(){}
    GameEnvironment(double width, double height){}
    
    //function
    public void addPlayer(GamePlayer player){
        arrPlayer.add(player);
    }
    public void removePlayer(GamePlayer player){
        arrPlayer.remove(player);
    }
    public void getAllPlayer(){
        for (int i = 0; i < arrPlayer.size(); i++) {
              System.out.println("Player : "+arrPlayer.get(i));
        }
    }
    public void addEnemy(GameEnemy enemy){
        arrEnemy.add(enemy);
    }
    public void removeEnemy(GameEnemy enemy){
        arrEnemy.remove(enemy);
    }
    public void getAllEnemy(){
        for (int i = 0; i < arrEnemy.size(); i++) {
            System.out.println("Enemy : "+arrEnemy.get(i));
        }
    }
    public void interaction(){
        if(arrPlayer == null || arrEnemy == null){
            System.out.println("Player or enemy not exist");
        }
        
        for(int i= 0; i < arrPlayer.size(); i++){
            for (int j=0; j < arrEnemy.size(); j++){
                if(arrPlayer.get(i).getY() != arrEnemy.get(j).getY()){
                    System.out.println("Player : "+arrPlayer.get(i) + " and Enemy : "+arrEnemy.get(j)+ " not is the same Y position");        
                }
                if(EuclideanDistance(arrPlayer.get(i).getX(),
                   arrPlayer.get(i).getY(),
                   arrEnemy.get(j).getX(),
                   arrEnemy.get(j).getY()) < 2){
                    System.out.println("Player : "+ arrPlayer.get(i)+ " Attacked");
                    System.out.println("Enemy  : "+ arrEnemy.get(j)+ " Loses");
                    removeEnemy(arrEnemy.get(j));
                }else{
                    System.out.println("=> Player "+ arrPlayer.get(i));
                    arrPlayer.get(i).Run((int)Math.ceil(Math.random()*10));
                    System.out.println("Current x position = "+ arrPlayer.get(i).getX() + "<==");
                }
            }
        }
    }
    public static int EuclideanDistance (int x1,int y1,int x2,int y2){
           int result = (int) Math.sqrt((y1 - x1) * 2 + (y2 - x2) * 2);
           return result;
    }
}
