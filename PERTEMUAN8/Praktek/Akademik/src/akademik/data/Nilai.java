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
public class Nilai extends Akademik {

    private int id, nUts, nTugas, nUas, nAkhir;
    private String name;

    @Override
    public void setData() {
        System.out.println("");
        System.out.println("");
        System.out.println("Input Nilai");
        System.out.print("Masukan Nama          :");
        this.name = str.nextLine();
        System.out.print("Masukan Nilai UTS     : ");
        this.nUts = str.nextInt();
        System.out.print("Masukan Nilai Tugas   : ");
        this.nTugas = str.nextInt();
        System.out.print("Masukan Nilai Uas     : ");
        this.nUas = str.nextInt();
        this.nAkhir = (this.nUas * 30 / 100) + (this.nUts * 30 / 100) + (this.nTugas * 40 / 100);
    }

    @Override
    public void tampil() {
        System.out.println("Nama       : " + this.name);
        System.out.println("Nilai UTS  : " + this.nUts);
        System.out.println("Nilai Tugas: " + this.nTugas);
        System.out.println("Nilai UAS  : " + this.nUas);
        System.out.println("Nilai Akhir: " + this.nAkhir);
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
