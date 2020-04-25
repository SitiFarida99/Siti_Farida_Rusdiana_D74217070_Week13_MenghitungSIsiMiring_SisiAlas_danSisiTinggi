
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ProsesTeoremaPytagorasnya {
        public static void main (String[] args) {
   RumusTeoremaPytagorasnya RTP = new RumusTeoremaPytagorasnya();
     Scanner in = new Scanner (System.in);
      for(int y = 1;;y++){
        System.out.println(" ");
        System.out.println("==================================");
        System.out.println("Rumus Teorema Pytagoras");
        System.out.println("1. Mencari sisi miring");
        System.out.println("2. Mencari sisi alas");
        System.out.println("3. Mencari sisi tinggi");
        System.out.println("==================================");
        System.out.print("     Masukkan pilihan anda:");
        System.out.println(" ");
        y=in.nextInt();
        switch(y){
            case 1 :
                System.out.println("==================================");
                System.out.println("      MENCARI SISI MIRINGNYA :");
                System.out.println("==================================");
                System.out.print(" Masukkan sisi alas segitiga :");
                int a = in.nextInt();
                System.out.print(" Masukkan sisi tinggi segitiga :");
                int b = in.nextInt();
        
                RTP.Miring(a, b);
                break;
            case 2 :
                System.out.println("==================================");
                System.out.println("      MENCARI SISI ALASNYA :");
                System.out.println("==================================");
                System.out.print(" Masukkan sisi miring segitiga :");
                int c = in.nextInt();
                System.out.print(" Masukkan sisi tinggi segitiga :");
                b = in.nextInt();
        
                RTP.Alas(c, b);
                break;
            case 3 :
                System.out.println("==================================");
                System.out.println("      MENCARI SISI TINGGINYA :");
                System.out.println("==================================");
                System.out.print(" Masukkan sisi miring segitiga :");
                c = in.nextInt();
                System.out.print(" Masukkan sisi alas segitiga :");
                a = in.nextInt();
        
                RTP.Tinggi (c, a);
                break;      
        }}}}