/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Models.UserModel;
import java.util.List;

/**
 *
 * @author nothing
 */
public interface IUser {
    public void insert(UserModel user);
    public void update(UserModel user);
    public void delete(int id);
    public List<UserModel> getAll();
    public List<UserModel> searchByName(String nama);
    public void login(String nik,String password);
}
