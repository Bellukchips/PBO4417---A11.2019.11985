/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harpindocar.data;

/**
 *
 * @author nothing
 */
public class Transaction extends Customer {

    private String merk;
    private int total;
    private String warnaMobil;
    private String item;

    public Transaction() {

    }

    public void buy(String name, String idKtp, String merk, String tipeCustomer, String warnaMobil, String item) {
        this.setName(name);
        this.setTipe(tipeCustomer);
        this.setId(idKtp);
        this.merk = merk;
        this.warnaMobil = warnaMobil;
        this.item = item;

    }

    public void invoice() {
        System.out.println("");
        System.out.println("-----------------INVOICE PEMBELIAN------------------");

        System.out.println("ID Pembeli          : " + this.getId());
        System.out.println("Nama Pembeli        : " + this.getName());
        System.out.println("Tipe Pembelian      : " + this.getTipe());
        System.out.println("Merk Mobil          : " + this.merk);
        System.out.println("Warna Mobil         : " + this.warnaMobil);
        System.out.println("Item Mobil          : " + this.item);

        System.out.println("------------------------------------------------------");

    }

    public String getMerk() {
        return this.merk;
    }

    public String getColor() {
        return this.warnaMobil;
    }

    public String getJumlah() {
        return this.item;
    }
}
