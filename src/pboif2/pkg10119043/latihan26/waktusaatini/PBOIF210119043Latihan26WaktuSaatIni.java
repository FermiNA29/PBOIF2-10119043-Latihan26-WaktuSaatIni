/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan26.waktusaatini;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author 
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program waktu saat ini
 */
public class PBOIF210119043Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date tanggal = new Date();

        SimpleDateFormat format = new SimpleDateFormat("E dd MMMM yyyy HH:mm:ss");
        System.out.println("Hari ini : " + format.format(tanggal));
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Developed by : Fermi Naufal Akbar");
    }
    
}
