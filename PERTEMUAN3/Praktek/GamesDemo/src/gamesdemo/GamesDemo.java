/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesdemo;

/**
 *
 * @author nothing
 */
public class GamesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GamePlayer player = new GamePlayer();
        player.setDimension(20, 20);
        player.setPosition(3, 4);
        player.Run();
        player.Run(30);
        System.out.println("Player width "+player.getWidth());
        System.out.println("Player height "+player.getHeight());
        System.out.println("Player Position X: "+player.getX()+" Position Y: "+player.getY());
        
        GameEnemy enemy = new GameEnemy();
        enemy.setDimension(20, 20);
        enemy.setPosition(3, 4);
        enemy.Run();
        System.out.println("Enemy width "+enemy.getWidth());
        System.out.println("Enemy height "+enemy.getHeight());
        System.out.println("Enemy Position X: "+enemy.getX()+" Position Y: "+enemy.getY());
        
    }
    
}
