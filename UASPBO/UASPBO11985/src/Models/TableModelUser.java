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
public class TableModelUser extends AbstractTableModel {
    
    List<UserModel> listUser;
    public TableModelUser(List<UserModel>listUser){
        this.listUser = listUser;
    }
    @Override
    public int getRowCount() {
        return this.listUser.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch (col){
            case 0:
                return listUser.get(row).getId_users();
            case 1:
                return listUser.get(row).getNama();
            case 2:
                return listUser.get(row).getJk();
            case 3:
                return listUser.get(row).getIpk();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int col) {
        switch (col){
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "Jenis Kelamin";
            case 3:
                return "IPK";
            default:
                return null;
        }
    }
    
    
}
