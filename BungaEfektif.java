/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import java.util.Scanner;
/**
 *
 * @author 2015730038- Muhamad Rifqi Mulyadi
 */
public class BungaEfektif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Scanner reader = new Scanner(System.in);  
       System.out.println("Masukkan pinjaman: ");
       double p = reader.nextDouble(); 
       System.out.println("Masukkan Suku bunga tahunan: (%/bulan)");
       double sb=reader.nextDouble();
       sb=sb/100;
       System.out.println("Masukkan tenor: ");
       double t=reader.nextDouble();
       System.out.println("Masukkan biaya administrasi bulanan: ");
       double admin=reader.nextDouble();
       
        System.out.println("=============Output=========");
       double pokok= p/t;
       
       double totalPokok=0;
       double totalBunga=0;
       double totalAdmin=0;
       double totalAngsuran=0;
       
        for (int i = 0; i < t; i++) {
            double bunga= ((p-(i*pokok))*(sb))/12;
            
            System.out.println("periode ke "+i);
            
            System.out.printf("Angsuran pokok = Rp. %.2f",pokok);
            System.out.println("");
            totalPokok+=pokok;
            
            System.out.printf("Bunga bulan ke-"+(i+1)+" = Rp. %.2f", bunga);
            System.out.println("");
            totalBunga+=bunga;
            
            System.out.printf("Biaya admin = Rp. %.2f",admin);
            totalAdmin+=admin;
            System.out.println("");
            double angsuran=bunga+pokok+admin;
            System.out.printf("Total angsuran bulan ke-"+(i+1)+" = Rp. %.2f", angsuran);
            totalAdmin+=admin;
            totalAngsuran+=angsuran;
            System.out.println("");
            System.out.println("");
            
            
        }
        System.out.printf("Total Angsuran Pokok = Rp.%.2f",totalPokok);
        System.out.println("");
        
        System.out.printf("Total Bunga = Rp.%.2f",totalBunga);
        System.out.println("");
        
        System.out.printf("Total Biaya Admin = Rp.%.2f",totalAdmin);
        System.out.println("");
        
        System.out.printf("Total Angsuran = Rp.%.2f",totalAngsuran);
        System.out.println("");
        

    }
    
}
