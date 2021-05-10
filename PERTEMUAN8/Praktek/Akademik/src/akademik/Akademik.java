/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akademik;

import akademik.data.Dosen;
import akademik.data.Mahasiswa;
import akademik.data.MatKul;
import akademik.data.Nilai;
import akademik.data.SelectMk;
import java.util.Scanner;

/**
 *
 * @author nothing
 */
public abstract class Akademik implements SystemAkademik {

    @Override
    public abstract void setData();

    @Override
    public abstract void tampil();
    public static Scanner in = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);

    public static void main(String[] args) {
        int menu = 0, z = 0, x = 0, y = 0, s = 0, n = 0, dsn, mhss, nilaiMhs,matkul, cari, cariMhs;
        //Dosen
        Dosen[] data = new Dosen[1024];
        data[z] = new Dosen();
        data[z].setId();
        //Mhs
        Mahasiswa[] mhs = new Mahasiswa[1024];
        mhs[x] = new Mahasiswa();
        mhs[x].setId();
        //MK
        MatKul[] mk = new MatKul[1024];
        mk[y] = new MatKul();
        mk[y].setId();
        //select mk
        SelectMk[] sk = new SelectMk[1024];
        sk[s] = new SelectMk();
        sk[s].setId();
        //input nilai
        Nilai[] nilai = new Nilai[1024];
        nilai[n] = new Nilai();
        nilai[n].setId();
        while (menu != 10) {
            System.out.println("========================================");
            System.out.print("Menu...\n1.Input Dosen\t\t2.Input Mahasiswa\n3.View Dosen\t\t4.View Mahasiswa\n5.Input Nilai\t\t6.Input Mata Kuliah\n7.View Mata Kuliah\t8.Search Mahasiswa\n9.Pilih Mata Kuliah\t10.Exit\nMasukan Perintah:");
            menu = data[0].in.nextInt();
            if (menu == 1) {
                //input dosen
                z++;
                data[z] = new Dosen();
                data[z].setId(data[z - 1].getId());
                data[z].setData();
            } else if (menu == 2) {
                //input mhs
                x++;
                mhs[x] = new Mahasiswa();
                mhs[x].setId(mhs[x - 1].getId());
                mhs[x].setData();
            } else if (menu == 3) {
                //view dosen
                if (z < 1) {
                    System.out.println("Data kosong");
                } else {
                    dsn = 0;
                    System.out.println("");
                    System.out.println("Data Dosen");
                    while (dsn < z) {
                        dsn++;
                        System.out.println("---------" + dsn + "---------");
                        data[dsn].tampil();
                    }
                }
            } else if (menu == 4) {
                if (x < 1) {
                    System.out.println("Data Kosong");
                } else {
                    mhss = 0;
                    System.out.println("");
                    System.out.println("Data Mahasiswa");
                    while (mhss < x) {
                        mhss++;
                        System.out.println("---------" + mhss + "---------");
                        mhs[mhss].tampil();
                    }
                }
            } else if (menu == 5) {
                n++;
                nilai[n] = new Nilai();
                nilai[n].setId(nilai[n - 1].getId());
                nilai[n].setData();
                 if (n < 1) {
                    System.out.println("Data Kosong");
                } else {
                    nilaiMhs = 0;
                    System.out.println("");
                    System.out.println("Data Nilai");
                    while (nilaiMhs < n) {
                        nilaiMhs++;
                        System.out.println("---------" + nilaiMhs + "---------");
                        nilai[nilaiMhs].tampil();
                    }
                }
            } else if (menu == 6) {
                y++;
                mk[y] = new MatKul();
                mk[y].setId(mk[y - 1].getId());
                mk[y].setData();
            } else if (menu == 7) {
                if (y < 1) {
                    System.out.println("Data Kosong");
                } else {
                    matkul = 0;
                    System.out.println("");
                    System.out.println("Data Mata Kuliah");
                    while (matkul < y) {
                        matkul++;
                        System.out.println("---------" + matkul + "---------");
                        mk[matkul].tampil();
                    }
                }

            } else if (menu == 8) {
                System.out.print("Masukkan nim : ");
                cari = mhs[0].in.nextInt();
                cariMhs = 1;
                while (cariMhs <= x) {
                    if (mhs[cariMhs].getId() == cari) {
                        break;
                    }
                    cariMhs++;
                }
                if (cariMhs <= x) {
                    if (menu == 8) {
                        mhs[cariMhs].tampil();
                    }
                } else {
                    System.out.println("data tidak ditemukan");
                }

            } else if (menu == 9) {
                s++;
                sk[s] = new SelectMk();
                sk[s].setId(sk[s - 1].getId());
                sk[s].setData();
                if (s < 1) {
                    System.out.println("Data Kosong");
                } else {
                    matkul = 0;
                    System.out.println("");
                    System.out.println("Data Mata Kuliah");
                    while (matkul < s) {
                        matkul++;
                        System.out.println("---------" + matkul + "---------");
                        sk[matkul].tampil();
                    }
                }
            } else if (menu == 10) {
                System.out.println("Sistem Telah Berhenti");
            } else {
                System.out.println("Perinah Tidak Dikenal");
            }
        }
    }

}
