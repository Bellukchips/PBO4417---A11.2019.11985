/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConfig;

/**
 *
 * @author nothing
 */
public class DatabaseConstants {
    //query

    public static final String insert = "INSERT INTO mhs (id,nim,nama,jk,alamat,angkatan,fakultas,prodi) VALUES (null,?,?,?,?,?,?,?);";
    public static final String update = "UPDATE mhs SET nim=?, nama=?, jk=?, alamat=?, angkatan=?, fakultas=?, prodi=? WHERE id=?;";
    public static final String delete = "DELETE FROM mhs WHERE id=?;";
    public static final String select = "SELECT * FROM mhs;";
    public static final String carinama = "SELECT * FROM mhs WHERE nama like ?;";
}
