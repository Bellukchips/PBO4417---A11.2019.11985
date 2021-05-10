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
public class MatKul extends Akademik {

    private int id, semester;

    private String nama;

    @Override
    public void setData() {
        System.out.println("");
        System.out.println("");
        System.out.println("Input Mata Kuliah");
        System.out.print("Masukkan Nama MK       : ");
        this.nama = str.nextLine();
        System.out.print("Masukkan Semester MK   : ");
        this.semester = str.nextInt();

    }

    @Override
    public void tampil() {
        System.out.println("ID                : " + this.id);
        System.out.println("Nim Mahasiswa     : " + this.nama);
        System.out.println("Nama              : " + this.semester);
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
