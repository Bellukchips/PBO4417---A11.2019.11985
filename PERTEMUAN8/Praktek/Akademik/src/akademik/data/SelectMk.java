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
public class SelectMk extends Akademik {

    private int id;

    private String nama, namaMk;

    @Override
    public void setData() {
        System.out.println("");
        System.out.println("");
        System.out.println("Pilih Mata Kuliah");
        System.out.print("Masukan Nama           : ");
        this.nama = str.nextLine();
        System.out.print("Masukkan Nama MK       : ");
        this.namaMk = str.nextLine();

    }

    @Override
    public void tampil() {
        System.out.println("ID                : " + this.id);
        System.out.println("Nama Mahasiswa    : " + this.nama);
        System.out.println("Nama Mata Kuliah  : " + this.namaMk);


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
