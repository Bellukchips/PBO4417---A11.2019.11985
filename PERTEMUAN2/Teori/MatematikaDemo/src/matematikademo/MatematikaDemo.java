/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematikademo;

/**
 *
 * @author nothing
 */
public class MatematikaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matematika mtk = new Matematika();
        mtk.add(2, 2);
        System.out.println("Hasil Penjumlahan   : "+mtk.getTotal());
        mtk.subtraction(10, 2);
        System.out.println("Hasil Pengurangan   : "+mtk.getTotal());
        mtk.devision(10, 2);
        System.out.println("Hasil Pembagian     : "+mtk.getTotal());
        mtk.multiplication(10, 2);
        System.out.println("Hasil Perkalian     : "+mtk.getTotal());
    }
    
}
