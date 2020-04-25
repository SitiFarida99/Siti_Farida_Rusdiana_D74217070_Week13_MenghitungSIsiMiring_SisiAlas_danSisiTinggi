/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class RumusTeoremaPytagorasnya {
    int c=0;
    void Miring (int a, int b) {  
        c=((a*a)+(b*b));
        System.out.println("    Sisi Miringnya adalah " + (Math.sqrt(c)));      
    }
    int a=0;
    void Alas (int c, int b) {  
        a=((c*c)-(b*b));
        System.out.println("    Sisi alasnya adalah " + (Math.sqrt(a)));
    }
    int b=0;
    void Tinggi (int c, int a) {  
        b=((c*c)-(a*a));
        System.out.println("     Sisi tingginya adalah " + (Math.sqrt(b)));
    }
}