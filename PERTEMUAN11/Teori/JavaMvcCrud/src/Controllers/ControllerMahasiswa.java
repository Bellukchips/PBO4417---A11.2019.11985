/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DBConfig.DatabaseHelper;
import Interface.IMahasiswa;
import Models.*;
import Views.FormMahasiswa;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author nothing
 */
public final class ControllerMahasiswa {

    FormMahasiswa frame;
    IMahasiswa implMahasiswa;
    List<Mahasiswa> listMhs;

    public ControllerMahasiswa(FormMahasiswa frame) {
        this.frame = frame;
        implMahasiswa = new DatabaseHelper();
        listMhs = implMahasiswa.getAll();

    }

    //mengosongkan field
    public void reset() {
        frame.getTxtID().setText("");
        frame.getTxtNim().setText("");
        frame.getTxtNama().setText("");
        frame.getTxtJk().setSelectedItem("");
        frame.getTxtAlamat().setText("");
        frame.getTxtAngkatan().setText("");
        frame.getTxtFakultas().setText("");
        frame.getTxtProdi().setText("");

    }

    //menampilkan data ke dalam tabel
    public void isiTable() {
        listMhs = implMahasiswa.getAll();
        TableModelMahasiswa tmb = new TableModelMahasiswa(listMhs);
        frame.getTabelDataMhs().setModel(tmb);
    }

    //merupakan fungsi untuk menampilkan data yang dipilih dari tabel
    public void isiField(int row) {
        frame.getTxtID().setText(listMhs.get(row).getId().toString());
        frame.getTxtNim().setText(listMhs.get(row).getNim());
        frame.getTxtNama().setText(listMhs.get(row).getNama());
        frame.getTxtJk().setSelectedItem(listMhs.get(row).getJk());
        frame.getTxtAlamat().setText(listMhs.get(row).getAlamat());
        frame.getTxtAngkatan().setText(listMhs.get(row).getAngkatan());
        frame.getTxtFakultas().setText(listMhs.get(row).getFakultas());
        frame.getTxtProdi().setText(listMhs.get(row).getProdi());
    }

    //merupakan fungsi untuk insert data berdasarkan inputan user dari textfield di frame
    public void insert() {

        if (!frame.getTxtNim().getText().trim().isEmpty() & !frame.getTxtNama().getText().trim().isEmpty() & !frame.getTxtAlamat().getText().trim().isEmpty() & !frame.getTxtAngkatan().getText().trim().isEmpty() & !frame.getTxtFakultas().getText().trim().isEmpty() & !frame.getTxtProdi().getText().trim().isEmpty()) {

            if (!frame.getTxtID().getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Failed To Insert Data");
            } else {
                Mahasiswa b = new Mahasiswa();
                b.setNim(frame.getTxtNim().getText());
                b.setNama(frame.getTxtNama().getText());
                b.setJk(frame.getTxtJk().getSelectedItem().toString());
                b.setAlamat(frame.getTxtAlamat().getText());
                b.setAngkatan(frame.getTxtAngkatan().getText());
                b.setFakultas(frame.getTxtFakultas().getText());
                b.setProdi(frame.getTxtProdi().getText());

                implMahasiswa.insert(b);
                JOptionPane.showMessageDialog(null, "Insert Data Success");
                reset();
            }

        } else {
            JOptionPane.showMessageDialog(frame, "Data Can not empty");
        }
    }

    //berfungsi untuk update data berdasarkan inputan user dari textfield di frame
    public void update() {
        if (!frame.getTxtID().getText().trim().isEmpty()) {

            Mahasiswa b = new Mahasiswa();
            b.setNim(frame.getTxtNim().getText());
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getTxtJk().getSelectedItem().toString());
            b.setAlamat(frame.getTxtAlamat().getText());
            b.setAngkatan(frame.getTxtAngkatan().getText());
            b.setFakultas(frame.getTxtFakultas().getText());
            b.setProdi(frame.getTxtProdi().getText());

            b.setId(Integer.parseInt(frame.getTxtID().getText()));
            implMahasiswa.update(b);

            JOptionPane.showMessageDialog(null, "Update Data  Success");
            reset();
        } else {
            JOptionPane.showMessageDialog(frame, "Please Select Data To Update");
        }
    }

    //berfungsi menghapus data yang dipilih
    public void delete() {
        if (!frame.getTxtID().getText().trim().isEmpty()) {
            int id = Integer.parseInt(frame.getTxtID().getText());
            implMahasiswa.delete(id);

            JOptionPane.showMessageDialog(null, "Delete Data  Success");
            reset();
        } else {
            JOptionPane.showMessageDialog(frame, "Please Select Data To Update");
        }
    }

    public void isiTableCariNama() {
        listMhs = implMahasiswa.getCariNama(frame.getTxtCariNama().getText());
        TableModelMahasiswa tmb = new TableModelMahasiswa(listMhs);
        frame.getTabelDataMhs().setModel(tmb);
    }

    public void carinama() {
        if (!frame.getTxtCariNama().getText().trim().isEmpty()) {
            implMahasiswa.getCariNama(frame.getTxtCariNama().getText());
            isiTableCariNama();
        } else {
            JOptionPane.showMessageDialog(frame, "Can not empty");
            isiTable();
        }
    }
}
