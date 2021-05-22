/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanawt1;

import java.awt.*;

/**
 *
 * @author nothing
 */
public class LatihanAWT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame frame = new Frame("TextField Example");
        TextField t1, t2;
        t1 = new TextField("Welcome to Javatpoint");
        t1.setBounds(50, 100, 200, 30);
        t2 = new TextField("AWT Tutorial");
        t2.setBounds(50, 150, 200, 30);
        frame.add(t1);
        frame.add(t2);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
