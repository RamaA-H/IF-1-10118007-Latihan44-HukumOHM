/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hukumohm;

/**
 *
 * @author 
 * NAMA  : Rama Al Halik
 * KELAS : IF 1
 * NIM   : 10118007
 * Deskripsi Program : Program ini untuk menampilkan output Hukum Ohm.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Baterai baterai = new Baterai();
        Baterai ohm = new Baterai(3,12);
        System.out.println("Kuat Arus : " + ohm.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + ohm.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + ohm.hitungTegangan()+ " volt");
    }
    
}
