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
public class Youtuber extends Gamer {

    public double subsriber;
    public double views;
    //kontruktor

    Youtuber() {
        this.views = 1000000;
        this.subsriber = 20000;
    }

    public void showSubandView() {
        System.out.println("Subscriber : " + this.subsriber);
        System.out.println("Viewer : " + this.views);

    }

}
