/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DBConfig.DatabaseQuery;
import Interface.IUser;
import Views.FormPermission;
import javax.swing.JOptionPane;

/**
 *
 * @author nothing
 */
public class LoginController {

    IUser iuser;
    FormPermission form;

    public LoginController(FormPermission form) {
        this.form = form;
        iuser = new DatabaseQuery();

    }

    public void login() {
        if (!form.getTxtNik().getText().trim().isEmpty() || !form.getTxtPass().getText().trim().isEmpty()) {
            iuser.login(form.getTxtNik().getText(), form.getTxtPass().getText());
            resetForm();
        } else {
            JOptionPane.showMessageDialog(form, "Can not empty");

        }
    }
    public void resetForm(){
        form.getTxtNik().setText("");
        form.getTxtPass().setText("");
    }

}
