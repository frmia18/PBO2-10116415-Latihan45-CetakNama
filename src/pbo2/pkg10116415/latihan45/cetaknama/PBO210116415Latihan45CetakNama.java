/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116415.latihan45.cetaknama;

import java.util.Scanner;

/**
 * Nama : MIA AISYAH F
 * Kelas: PBO-2
 * NIM  : 10116415
 *Deskripsi Program : program ini berisi aplikasi pencetakan nama sesuai inputan
 * nama yang dimasukkan
 */
public class PBO210116415Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           System.out.println("===Aplikasi Pencetakkan Nama===");
        
        Scanner scn = new Scanner(System.in);
        Printer printer = new Printer();
        
        System.out.print("Masukkan nama anda : ");
        printer.setNama(scn.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        printer.setJmlCetak(scn.nextInt());
        
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
    
}
