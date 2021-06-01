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
public class FormData {

    private Frame frame;
    private Panel panel;
    private Label nimLabel;
    private Label namaLabel;
    private Label beratLabel;
    private Label tinggiLabel;
    private Label resultLabel;
    private TextField txt_nim;
    private TextField txt_nama;
    private TextField txt_berat;
    private TextField txt_tinggi;
    private Button btn_hitung;
    final double METER      = 0.01;
    public FormData() {
        initialComponent();
    }

    private void initialComponent() {
        frame = new Frame("Hitung Berat Ideal");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                frame.setVisible(false);
                MenuForm menu = new MenuForm();
                menu.showForm();
            }

        });

        // label
        nimLabel = new Label();
        nimLabel.setBounds(30, 50, 50, 50);
        namaLabel = new Label();
        namaLabel.setBounds(30, 80, 50, 50);
        beratLabel = new Label();
        beratLabel.setBounds(30, 110, 50, 50);
        tinggiLabel = new Label();
        tinggiLabel.setBounds(30, 140, 50, 50);
        resultLabel = new Label();
        resultLabel.setBounds(30, 240, 350, 50);
        //textfield
        txt_nim = new TextField();
        txt_nim.setBounds(80, 65, 150, 20);
        txt_nama = new TextField();
        txt_nama.setBounds(80, 95, 150, 20);
        txt_berat = new TextField();
        txt_berat.setBounds(80, 125, 150, 20);
        txt_tinggi = new TextField();
        txt_tinggi.setBounds(80, 155, 150, 20);

        //button
        btn_hitung = new Button();
        btn_hitung.setBounds(30, 200, 80, 50);

    }

    public void showForm() {
        nimLabel.setText("Nim");
        namaLabel.setText("Nama");
        beratLabel.setText("Berat");
        tinggiLabel.setText("Tinggi");
        btn_hitung.setLabel("Hitung");
        btn_hitung.setActionCommand("hitung");
        btn_hitung.addActionListener(new ButtonClickListener());
        frame.add(nimLabel);
        frame.add(namaLabel);
        frame.add(beratLabel);
        frame.add(tinggiLabel);
        frame.add(resultLabel);
        frame.add(txt_nim);
        frame.add(txt_nama);
        frame.add(txt_berat);
        frame.add(txt_tinggi);
        frame.add(btn_hitung);
        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String cmd = ae.getActionCommand();
            String berat = txt_berat.getText();
            String tinggi = txt_tinggi.getText();
            String nim = txt_nim.getText();
            String nama = txt_nama.getText();
            //convert to int
            double b = Integer.parseInt(berat);
            double t = Double.parseDouble(tinggi) * METER;
            float result;
            if (cmd.equals("hitung")) {
                if ("".equals(txt_nim.getText()) || "".equals(txt_nama.getText()) || "".equals(txt_berat.getText()) || "".equals(txt_tinggi.getText())) {
                    resultLabel.setText("Semua Textfield harus diisi");
                } else {
                    result = (float) ((float) b / (t * t));
                 
                    if (result < 18.5 || result >= 25) {
                        resultLabel.setText(nim + "," + nama + ", Berat Anda Belum ideal : "+result);
                    } else {
                        resultLabel.setText(nim + "," + nama + ", Berat Anda Sudah ideal : "+result);

                    }
                }
            }
        }
    }
}
