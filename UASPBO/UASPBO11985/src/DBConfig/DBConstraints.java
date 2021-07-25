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
public class DBConstraints {

    public static String login = "SELECT * FROM users WHERE id_users=? and password=?;";
    public static String insertNilai = "INSERT INTO `nilai`(`id_mhs`, `nama_mhs`, `nama_matkul`, `sks`, `semester`, `uts`, `uas`) VALUES (?,?,?,?,?,?,?);";
    public static String selectNilai = "SELECT id_mhs,nama_mhs,nama_matkul,sks,semester,uts,uas,((uts*0.4) + (uas * 0.6)) as rata_rata FROM nilai;";
    public static String selectUsers = "SELECT users.id_users,users.nama,users.jk,((SELECT SUM(sks) FROM nilai where nilai.id_mhs=users.id_users) * ((uts*0.4) + (uas * 0.6))) as ipk FROM users,nilai WHERE role='MHS' GROUP BY users.id_users;";
    public static String insertMhs = "INSERT INTO `users`(`id_users`, `nama`,`jk`, `role`) VALUES (?,?,?,'MHS')";
    public static String updateMhs = "UPDATE users SET nama=?,jk=? WHERE id_users=?;";
    public static String updateNilai = "UPDATE nilai SET nama_matkul=?,sks=?,semester=?,uts=?,uas=? WHERE id_mhs=?;";
    public static String deleteNilai = "DELETE FROM nilai WHERE id_mhs=?;";
    public static String deleteMhs = "DELETE FROM users WHERE id_users=?;";
}
