/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConfig;

import Models.UserModel;
import java.util.List;
import Interface.IData;
import Models.NilaiModel;
import Views.FormInputNilai;
import Views.FormLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nothing
 */
public class DBQuery implements IData {

    Connection connection;
    boolean isLogin = false;

    public DBQuery() {
        connection = DBConnect.connect();
    }

    @Override
    public void login(String id, String password) {
        try {
            PreparedStatement st = connection.prepareStatement(DBConstraints.login);
            st.setString(1, id);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                this.isLogin = true;
            } else {
                JOptionPane.showMessageDialog(null, "ID dan Password tidak dikenali");
                this.isLogin = false;
            }
        } catch (SQLException e) {
            Logger.getLogger(DBQuery.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Data isn't match");

        }
    }

    @Override
    public boolean getIsLogin() {
        return this.isLogin;
    }

    @Override
    public void insertNilai(NilaiModel nilai) {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(DBConstraints.insertNilai);
            stmt.setInt(1, nilai.getId_mhs());
            stmt.setString(2, nilai.getNama_mhs());
            stmt.setString(3, nilai.getNama_matkul());
            stmt.setInt(4, nilai.getSks());
            stmt.setInt(5, nilai.getSemester());
            stmt.setInt(6, nilai.getUts());
            stmt.setInt(7, nilai.getUas());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void updateNilai(NilaiModel nilai) {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(DBConstraints.updateNilai);
            stmt.setString(1, nilai.getNama_matkul());
            stmt.setInt(2, nilai.getSks());
            stmt.setInt(3, nilai.getSemester());
            stmt.setInt(4, nilai.getUts());
            stmt.setInt(5, nilai.getUas());
            stmt.setInt(6, nilai.getId_mhs());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteNilai(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DBConstraints.deleteNilai);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<NilaiModel> getAllNilai() {
        List<NilaiModel> lisNilai = null;
        try {
            lisNilai = new ArrayList<NilaiModel>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(DBConstraints.selectNilai);
            while (rs.next()) {
                NilaiModel nilai = new NilaiModel();
                nilai.setId_mhs(rs.getInt("id_mhs"));
                nilai.setNama_mhs(rs.getString("nama_mhs"));
                nilai.setNama_matkul(rs.getString("nama_matkul"));
                nilai.setSks(rs.getInt("sks"));
                nilai.setSemester(rs.getInt("semester"));
                nilai.setUts(rs.getInt("uts"));
                nilai.setUas(rs.getInt("uas"));
                nilai.setRata_rata(rs.getInt("rata_rata"));
                lisNilai.add(nilai);
            }
        } catch (SQLException e) {
            Logger.getLogger(DBQuery.class.getName()).log(Level.SEVERE, null, e);
        }
        return lisNilai;
    }

    @Override
    public List<UserModel> getUser() {
        List<UserModel> listUser = null;
        try {
            listUser = new ArrayList<UserModel>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(DBConstraints.selectUsers);
            while (rs.next()) {
                UserModel user = new UserModel();
                user.setId_users(rs.getInt("id_users"));
                user.setNama(rs.getString("nama"));
                user.setJk(rs.getString("jk"));
                user.setIpk(rs.getDouble("ipk"));
                listUser.add(user);
            }
        } catch (SQLException e) {
            Logger.getLogger(DBQuery.class.getName()).log(Level.SEVERE, null, e);
        }
        return listUser;
    }

    @Override
    public void insertMhs(UserModel user) {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(DBConstraints.insertMhs);
            stmt.setInt(1, user.getId_users());
            stmt.setString(2, user.getNama());
            stmt.setString(3, user.getJk());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void updateMhs(UserModel user) {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(DBConstraints.updateMhs);
            stmt.setString(1, user.getNama());
            stmt.setString(2, user.getJk());
            stmt.setInt(3, user.getId_users());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteMhs(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DBConstraints.deleteMhs);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
