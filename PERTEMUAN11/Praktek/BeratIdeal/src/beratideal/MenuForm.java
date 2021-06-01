/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beratideal;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author nothing
 */
public class MenuForm {

    private Frame frame;
    private Panel panel;
    private Button btnCalc;
    private Button btnExit;

    public MenuForm() {
        initialComponent();
    }

    private void initialComponent() {
        frame = new Frame("Menu Form");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }

        });
        btnCalc = new Button();
        btnCalc.setBounds(30, 200, 150, 50);
        btnExit = new Button();
        btnExit.setBounds(200, 200, 150, 50);
    }

    public void showForm() {
        btnCalc.setLabel("Calculator BMI");
        btnCalc.setActionCommand("showForm");
        btnCalc.addActionListener(new ButtonActionListener());
        btnExit.setLabel("Exit");
        btnExit.setActionCommand("exit");
        btnExit.addActionListener(new ButtonActionListener());
        frame.add(btnCalc);
        frame.add(btnExit);
        frame.setVisible(true);
    }

    private class ButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String cmd = ae.getActionCommand();
            if (cmd.equals("showForm")) {
                FormData form = new FormData();
                form.showForm();
                frame.setVisible(false);

            } else if (cmd.equals("exit")) {
                System.exit(0);
            }
        }
    }

}
