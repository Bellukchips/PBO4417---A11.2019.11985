/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DBConfig.DBQuery;
import Interface.IData;
import Views.FormLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author nothing
 */
public class LoginController {
    
    IData data;
    FormLogin formLogin;
    
    public LoginController(FormLogin formLogin){
        this.formLogin = formLogin;
        data = new DBQuery();
    }
    public void login(){
        if(!formLogin.getTxt_idUser().getText().trim().isEmpty() || !formLogin.getTxt_password().getText().trim().isEmpty()){
            data.login(formLogin.getTxt_idUser().getText(), formLogin.getTxt_password().getText());
            resetForm();
        }else{
            JOptionPane.showMessageDialog(formLogin, "Can not empty");
        }
    }
    
    public boolean getIsLogin(){
        return data.getIsLogin();
    }
    
    public void resetForm(){
        formLogin.getTxt_idUser().setText("");
        formLogin.getTxt_password().setText("");
    }

}
