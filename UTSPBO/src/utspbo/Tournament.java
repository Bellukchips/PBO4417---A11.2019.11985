/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

/**
 *
 * @author nothing
 */
public class Tournament {
    
    
    Youtuber yt1 = new Youtuber();
    ProGamer proGamer = new ProGamer();
    Gamer gamer = new Gamer();
    public void getData(){
        System.out.println("Nama      : "+gamer.nama);
        System.out.println("Umur      : "+gamer.umur);
        gamer.showGames();
        gamer.play();
        
        yt1.showSubandView();
        proGamer.play();
        
        
    }
}
