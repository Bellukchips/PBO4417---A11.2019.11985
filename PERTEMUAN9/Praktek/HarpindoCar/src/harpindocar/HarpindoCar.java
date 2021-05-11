/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harpindocar;

import harpindocar.data.Employee;
import harpindocar.data.Transaction;
import harpindocar.data.ListCar;
import harpindocar.data.ListTransaction;

import java.util.Scanner;

/**
 *
 * @author nothing
 */
public class HarpindoCar {

    private static Scanner scanner = new Scanner(System.in);
    private static ListTransaction lstTransaction = new ListTransaction();

    public static void main(String[] args) {

//        Scanner e
        System.out.println("-------Sistem Penjualan Mobil-------");
        System.out.println("");
        System.out.println("-----------Absen Karyawan-----------");
        absensi();

        menu();
    }

    private static void absensi() {
        String name, noKtp;
        System.out.print("Masukan Nama   => ");
        name = scanner.nextLine();
        System.out.print("Masukan No Ktp => ");
        noKtp = scanner.nextLine();
        //employee
        Employee employee = new Employee(noKtp, name);
        employee.absen();

    }

    private static void menu() {
        while (true) {
            String aksi;
            System.out.println("");
            System.out.println("");
            System.out.println("--- SISTEM SIAP MELAYANI ---");
            System.out.println("[1] Pembeli Individu");
            System.out.println("[2] Pembeli Borongan");
            System.out.println("[3] View Transaksi");

            System.out.println("[0] Exit");

            System.out.print("Masukan Perintah => ");
            aksi = scanner.nextLine();
            if (aksi.equalsIgnoreCase("1")) {
                showCar();
                inputDataCustomer(1);

            } else if (aksi.equalsIgnoreCase("2")) {
                showCar();
                inputDataCustomer(2);
            } else if (aksi.equalsIgnoreCase("3")) {
                showTransaction();

            } else if (aksi.equalsIgnoreCase("0")) {
                System.exit(0);
            } else {
                System.out.println("Perintah tidak diketahui");
            }
        }

    }

    private static void inputDataCustomer(int tipe) {
        String name, noKtp, merkMobil, warnaMobil, jumlah;
        int tipeC = tipe;

        if (tipeC == 1) {
            System.out.print("Masukan No Ktp Pembeli  => ");
            noKtp = scanner.nextLine();
            System.out.print("Masukan Nama Pembeli    => ");
            name = scanner.nextLine();
            System.out.print("Masukan Merk Mobil      => ");
            merkMobil = scanner.nextLine();
            System.out.print("Masukan Warna Mobil     => ");
            warnaMobil = scanner.nextLine();
            Transaction transaksi = new Transaction();
            transaksi.buy(name, noKtp, merkMobil, "INDIVIDU", warnaMobil,"1");
            lstTransaction.addNewData(transaksi);
            transaksi.invoice();
        } else {
            System.out.print("Masukan No Ktp Pembeli  => ");
            noKtp = scanner.nextLine();
            System.out.print("Masukan Nama Pembeli    => ");
            name = scanner.nextLine();
            System.out.print("Masukan Merk Mobil      => ");
            merkMobil = scanner.nextLine();
            System.out.print("Masukan Warna Mobil     => ");
            warnaMobil = scanner.nextLine();
            System.out.print("Masukan Jumlah Item     => ");
            jumlah = scanner.nextLine();
            Transaction transaksi = new Transaction();
            transaksi.buy(name, noKtp, merkMobil, "BORONGAN", warnaMobil, jumlah);
            lstTransaction.addNewData(transaksi);
            transaksi.invoice();
        }

    }

    private static void showTransaction() {
        lstTransaction.fetchData();
    }

    private static void showCar() {
        ListCar listCar = new ListCar();
        listCar.fetchData();
    }
}
