/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukudemo;

/**
 *
 * @author nothing
 */
public class Buku {
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahun;


    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public int getTahun() {
        return tahun;
    }
    
    Buku(String judul,String pengarang,String penerbit,int tahun){
        this.judul= judul;
        this.penerbit = penerbit;
        this.pengarang = pengarang;
        this.tahun = tahun;
    }
    
    public void cetakBuku(){
        System.out.println("Judul       : "+getJudul());
        System.out.println("Pengarang   : "+getPengarang());
        System.out.println("Penerbit    : "+getPenerbit());
        System.out.println("Tahun terbit: "+getTahun());
    }
}
