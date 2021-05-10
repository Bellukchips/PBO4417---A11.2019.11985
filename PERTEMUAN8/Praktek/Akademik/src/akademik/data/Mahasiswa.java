/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akademik.data;

import akademik.Akademik;

/**
 *
 * @author nothing
 */
public class Mahasiswa extends Akademik {
    private int id;
    private String nama, jk, nim, role;

    @Override
    public void setData() {
        System.out.println("");
        System.out.println("");
        System.out.println("Input Mahasiswa");
        System.out.print("Masukkan NIM          : ");
        this.nim = str.nextLine();
        System.out.print("Masukkan Nama         : ");
        this.nama = str.nextLine();
        System.out.print("Masukkan Jenis Kelamin: ");
        this.jk = str.nextLine();
        this.role = "Mahasiswa";

    }

    @Override
    public void tampil() {
        System.out.println("ID                : " + this.id);
        System.out.println("Nim Mahasiswa     : " + this.nim);
        System.out.println("Nama              : " + this.nama);
        System.out.println("Jenis Kelamin     : " + this.jk);
        System.out.println("Role              : " + this.role);

    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId() {
        this.id = 153400;
    }

    @Override
    public void setId(int id) {
        this.id = id + 1;
    }
}
