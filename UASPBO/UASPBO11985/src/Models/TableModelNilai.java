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
public class TableModelNilai extends AbstractTableModel{
    List<NilaiModel> listNilai;
    
    public TableModelNilai(List<NilaiModel> listNilai){
        this.listNilai = listNilai;
    }
    @Override
    public int getRowCount() {
        return this.listNilai.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }
    

    @Override
    public Object getValueAt(int row, int col) {
        switch(col){
            case 0:
                return listNilai.get(row).getId_mhs();
            case 1:
                return listNilai.get(row).getNama_mhs();
            case 2:
                return listNilai.get(row).getNama_matkul();
            case 3:
                return listNilai.get(row).getSks();
            case 4:
                return listNilai.get(row).getSemester();
            case 5:
                return listNilai.get(row).getUts();
            case 6:
                return listNilai.get(row).getUas();
            case 7:
                return listNilai.get(row).getRata_rata();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int col) {
        switch (col){
            case 0:
                return "ID Mahasiswa";
            case 1:
                return "Nama Mahasiswa";
            case 2:
                return "Mata Kuliah";
            case 3:
                return "Sks";
            case 4:
                return "Semester";
            case 5:
                return "Nilai UTS";
            case 6:
                return "Nilai UAS";
            case 7:
                return "Rata-rata";
            default:
                return null;
        }
    }
    
    
}
