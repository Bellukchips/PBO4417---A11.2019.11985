/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nothing
 */
public class TableModelMahasiswa extends AbstractTableModel {

    List<Mahasiswa> listMhs;
     public TableModelMahasiswa(List<Mahasiswa> listMhs) {
        this.listMhs = listMhs;
    }
    @Override
    public int getRowCount() {
        return listMhs.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
            case 0:
                return listMhs.get(row).getId();
            case 1:
                return listMhs.get(row).getNim();
            case 2:
                return listMhs.get(row).getNama();
            case 3:
                return listMhs.get(row).getJk();
            case 4:
                return listMhs.get(row).getAlamat();
            case 5:
                return listMhs.get(row).getAngkatan();
            case 6:
                return listMhs.get(row).getFakultas();
            case 7:
                return listMhs.get(row).getProdi();
            default:
                return null;

        }
    }

    @Override
    public String getColumnName(int col) {
        switch (col) {
            case 0:
                return "ID";
            case 1:
                return "Nim";
            case 2:
                return "Nama";
            case 3:
                return "Jenis Kelamin";
            case 4:
                return "Alamat";
            case 5:
                return "Angkatan";
            case 6:
                return "Fakultas";
            case 7:
                return "Prodi";
            default:
                return null;
        }
    }

}
