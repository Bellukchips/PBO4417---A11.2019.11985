/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Models.*;
import java.util.List;

/**
 *
 * @author nothing
 */
public interface IData {
    public boolean getIsLogin();
    public void insertMhs(UserModel user);
    public void updateMhs(UserModel user);
    public void deleteMhs(int id);
    public void login(String nik,String password);
    public void insertNilai(NilaiModel nilai);
    public void updateNilai(NilaiModel nilai);
    public void deleteNilai(int id);
    public List<NilaiModel>getAllNilai();
    public List<UserModel>getUser();
}
