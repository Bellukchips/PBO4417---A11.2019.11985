/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConfig;

import Interface.IMahasiswa;
import Models.Mahasiswa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nothing
 */
public class DatabaseHelper implements IMahasiswa {

    //Connection
    Connection connection;

    public DatabaseHelper() {
        connection = ConnectDB.connect();
    }

    @Override
    public void insert(Mahasiswa mhs) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DatabaseConstants.insert);
            statement.setString(1, mhs.getNim());
            statement.setString(2, mhs.getNama());
            statement.setString(3, mhs.getJk());
            statement.setString(4, mhs.getAlamat());
            statement.setString(5, mhs.getAngkatan());
            statement.setString(6, mhs.getFakultas());
            statement.setString(7, mhs.getProdi());
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
    public void update(Mahasiswa mhs) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DatabaseConstants.update);
            statement.setString(1, mhs.getNim());
            statement.setString(2, mhs.getNama());
            statement.setString(3, mhs.getJk());
            statement.setString(4, mhs.getAlamat());
            statement.setString(5, mhs.getAngkatan());
            statement.setString(6, mhs.getFakultas());
            statement.setString(7, mhs.getProdi());
            statement.setInt(8, mhs.getId());
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
    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DatabaseConstants.delete);
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
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = null;
        try {
            listMhs = new ArrayList<Mahasiswa>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(DatabaseConstants.select);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setJk(rs.getString("jk"));
                mhs.setAlamat(rs.getString("alamat"));
                mhs.setAngkatan(rs.getString("angkatan"));
                mhs.setFakultas(rs.getString("fakultas"));
                mhs.setProdi(rs.getString("prodi"));
                listMhs.add(mhs);

            }
        } catch (SQLException e) {
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, e);

        }
        return listMhs;
    }

    @Override
    public List<Mahasiswa> getCariNama(String nama) {
        List<Mahasiswa> listMhs = null;
        try {
            listMhs = new ArrayList<Mahasiswa>();
            PreparedStatement st = connection.prepareStatement(DatabaseConstants.carinama);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setJk(rs.getString("jk"));
                mhs.setAlamat(rs.getString("alamat"));
                mhs.setAngkatan(rs.getString("angkatan"));
                mhs.setFakultas(rs.getString("fakultas"));
                mhs.setProdi(rs.getString("prodi"));
                listMhs.add(mhs);
            }
        } catch (SQLException e) {
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, e);

        }
        return listMhs;
    }

}
