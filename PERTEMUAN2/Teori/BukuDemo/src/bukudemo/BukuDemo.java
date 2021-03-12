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
public class BukuDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Buku book = new Buku("PBO JAVA","Indrajani","ElexMedia Komputindo",2007);
        book.cetakBuku();
        Buku book1 = new Buku("Dasar Pemrograman Java","Abdul Kadir","Andi Offset",2004);
        book1.cetakBuku();
    }
    
}
