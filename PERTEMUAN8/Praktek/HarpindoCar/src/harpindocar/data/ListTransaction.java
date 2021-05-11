/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harpindocar.data;

import java.util.ArrayList;

/**
 *
 * @author nothing
 */
public class ListTransaction {

    private final ArrayList<Transaction> lst = new ArrayList<>();

    public void addNewData(Transaction tr) {
        lst.add(tr);
    }

    public void fetchData() {
        if (lst.size() == 0) {
            System.out.println("");
            System.out.println("----------LIST TRANSAKSI KOSONG--------");
        } else {
            for (int i = 0; i < lst.size(); i++) {
                System.out.println("");
                System.out.println("----------LIST TRANSAKSI--------");
                System.out.println("ID Pembeli      : " + lst.get(i).getId());
                System.out.println("Nama Pembeli    : " + lst.get(i).getName());
                System.out.println("Merk            : " + lst.get(i).getMerk());
                System.out.println("Tipe Pembelian  : " + lst.get(i).getTipe());
                System.out.println("Warna Mobil     : " + lst.get(i).getColor());
                System.out.println("Jumlah Item     : " + lst.get(i).getJumlah());

                System.out.println("--------------------------------");

            }
        }
    }
}
