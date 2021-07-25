/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DBConfig.DBQuery;
import Interface.IData;
import Models.NilaiModel;
import Models.TableModelNilai;
import Models.TableModelUser;
import Models.UserModel;
import Views.FormInputNilai;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author nothing
 */
public class NilaiController {

    IData data;
    FormInputNilai formNilai;
    List<UserModel> listUser;
    List<NilaiModel> listNilai;

    public NilaiController(FormInputNilai formNilai) {
        this.formNilai = formNilai;
        data = new DBQuery();
        listUser = data.getUser();
        listNilai = data.getAllNilai();
    }

    public void resetForm() {
        formNilai.getTxt_idMhs().setText("");
        formNilai.getTxt_namaMhs().setText("");
        formNilai.getTxt_idMhs().setEnabled(true);
        formNilai.getTxt_Nuas().setText("");
        formNilai.getTxt_Nuts().setText("");
        formNilai.getTxt_mk().setText("");
        formNilai.getTxt_semester().setText("");
        formNilai.getTxt_sks().setText("");
        formNilai.getTxt_namaMhs().setEnabled(true);

    }
    public void showDataMhs() {
        listUser = data.getUser();
        TableModelUser tmUser = new TableModelUser(listUser);
        formNilai.getTblMhs().setModel(tmUser);
    }

    public void showDataNilai() {
        listNilai = data.getAllNilai();
        TableModelNilai tmNilai = new TableModelNilai(listNilai);
        formNilai.getTblNilai().setModel(tmNilai);
    }

    public void insertMhs() {
        if (formNilai.getTxt_idMhs().getText().trim().isEmpty() || formNilai.getTxt_namaMhs().getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(formNilai, "Data Can not empty");

        } else {
            UserModel user = new UserModel();
            user.setId_users(Integer.parseInt(formNilai.getTxt_idMhs().getText()));
            user.setNama(formNilai.getTxt_namaMhs().getText());
            user.setJk(formNilai.getCmb_jk().getSelectedItem().toString());
            data.insertMhs(user);
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
            resetForm();
        }
    }

    public void updateMhs() {
        if (formNilai.getTxt_idMhs().getText().trim().isEmpty() || formNilai.getTxt_namaMhs().getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(formNilai, "Data Can not empty");

        } else {
            UserModel user = new UserModel();
            user.setNama(formNilai.getTxt_namaMhs().getText());
            user.setJk(formNilai.getCmb_jk().getSelectedItem().toString());
            user.setId_users(Integer.parseInt(formNilai.getTxt_idMhs().getText()));
            data.updateMhs(user);
            JOptionPane.showMessageDialog(null, "Data berhasil di ubah");
            resetForm();
        }
    }

    public void deleteMhs() {
        if (!formNilai.getTxt_idMhs().getText().trim().isEmpty()) {
            int id = Integer.parseInt(formNilai.getTxt_idMhs().getText());
            data.deleteMhs(id);
            JOptionPane.showMessageDialog(null, "Delete Data Mahasiswa Success");
            resetForm();
        }
    }

    public void clickDataTableMhs(int row) {
        formNilai.getTxt_idMhs().setEnabled(false);
        formNilai.getTxt_idMhs().setText(listUser.get(row).getId_users().toString());
        formNilai.getTxt_namaMhs().setText(listUser.get(row).getNama());
        formNilai.getCmb_jk().setSelectedItem(listUser.get(row).getJk());

    }

    public void clickDataTableNilai(int row) {
        formNilai.getTxt_idMhs().setEnabled(false);
        formNilai.getTxt_namaMhs().setEnabled(false);
        formNilai.getTxt_idMhs().setText(listNilai.get(row).getId_mhs().toString());
        formNilai.getTxt_namaMhs().setText(listNilai.get(row).getNama_mhs());
        formNilai.getTxt_mk().setText(listNilai.get(row).getNama_matkul());
        formNilai.getTxt_sks().setText(listNilai.get(row).getSks().toString());
        formNilai.getTxt_semester().setText(listNilai.get(row).getSemester().toString());
        formNilai.getTxt_Nuts().setText(listNilai.get(row).getUts().toString());
        formNilai.getTxt_Nuas().setText(listNilai.get(row).getUas().toString());
    }

    public void insertNilai() {
        if (formNilai.getTxt_idMhs().getText().trim().isEmpty() || formNilai.getTxt_namaMhs().getText().trim().isEmpty() || formNilai.getTxt_mk().getText().trim().isEmpty() || formNilai.getTxt_sks().getText().trim().isEmpty() || formNilai.getTxt_semester().getText().trim().isEmpty() || formNilai.getTxt_Nuts().getText().trim().isEmpty() || formNilai.getTxt_Nuas().getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(formNilai, "Data Can not empty");

        } else {
            NilaiModel nilai = new NilaiModel();
            nilai.setId_mhs(Integer.parseInt(formNilai.getTxt_idMhs().getText()));
            nilai.setNama_mhs(formNilai.getTxt_namaMhs().getText());
            nilai.setNama_matkul(formNilai.getTxt_mk().getText());
            nilai.setSks(Integer.parseInt(formNilai.getTxt_sks().getText()));
            nilai.setSemester(Integer.parseInt(formNilai.getTxt_semester().getText()));
            nilai.setUts(Integer.parseInt(formNilai.getTxt_Nuts().getText()));
            nilai.setUas(Integer.parseInt(formNilai.getTxt_Nuas().getText()));
            data.insertNilai(nilai);
            resetForm();
            JOptionPane.showMessageDialog(null, "Data nilai berhasil ditambahkan");
        }
    }

    public void updateNilai() {
        if (formNilai.getTxt_idMhs().getText().trim().isEmpty() || formNilai.getTxt_namaMhs().getText().trim().isEmpty() || formNilai.getTxt_mk().getText().trim().isEmpty() || formNilai.getTxt_sks().getText().trim().isEmpty() || formNilai.getTxt_semester().getText().trim().isEmpty() || formNilai.getTxt_Nuts().getText().trim().isEmpty() || formNilai.getTxt_Nuas().getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(formNilai, "Data Can not empty");

        } else {
            NilaiModel nilai = new NilaiModel();
            nilai.setNama_matkul(formNilai.getTxt_mk().getText());
            nilai.setSks(Integer.parseInt(formNilai.getTxt_sks().getText()));
            nilai.setSemester(Integer.parseInt(formNilai.getTxt_semester().getText()));
            nilai.setUts(Integer.parseInt(formNilai.getTxt_Nuts().getText()));
            nilai.setUas(Integer.parseInt(formNilai.getTxt_Nuas().getText()));
            nilai.setId_mhs(Integer.parseInt(formNilai.getTxt_idMhs().getText()));
            data.updateNilai(nilai);
            resetForm();
            JOptionPane.showMessageDialog(null, "Data nilai berhasil ditambahkan");
        }
    }

    public void deleteNilai() {
        if (!formNilai.getTxt_idMhs().getText().trim().isEmpty()) {
            int id = Integer.parseInt(formNilai.getTxt_idMhs().getText());
            data.deleteNilai(id);
            JOptionPane.showMessageDialog(null, "Delete Data Nilai Success");
            resetForm();
        }
    }
}
