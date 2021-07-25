/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

import java.util.ArrayList;

/**
 *
 * @author nothing
 */
public class Gamer {
    
    public String nama;
    public int umur;
    public ArrayList<String> jenisGame = new ArrayList<String>();
    
    //kontruktor
    Gamer() {
        this.nama = "Muh Lukman Akbar P";
        this.umur = 19;
        this.jenisGame.add("Mobile Legends");
        this.jenisGame.add("PUBG Mobile");
        this.jenisGame.add("Dota 2");
        this.jenisGame.add("Clash Of Clans");
        this.jenisGame.add("FIFA 2019");
    }

    public void showGames() {
        System.out.println("Daftar game : ");
         for (int i = 0; i < jenisGame.size(); i++) {
            System.out.println(jenisGame.get(i));
        }
    }
    public void play(){
        System.out.println(this.nama+" is playing..");
    }
}
