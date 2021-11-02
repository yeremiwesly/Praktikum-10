/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject1;

import java.util.Scanner;

/**
 *
 * @author NITRO 5
 */
public class Miring {
        int a;
    int b;
    double c = 0;
    
    void input(){
        
        System.out.println("");
        System.out.println("Menentukan Sisi Miring Segitiga");
        
        
        Scanner data = new Scanner(System.in);
        
        while(true){
            System.out.println("Masukan sisi [a] : ");
            a = data.nextInt();
           
            
            System.out.println("Masukan sisi [b] : ");
            b = data.nextInt();
            break;
            
        }
    }
    
    void sisiMiring(){
        this.c = Math.sqrt(Math.pow(a, 2) + (Math.pow(b, 2)));
        System.out.println("Sisi Miringnya [c] adalah : " + c);
    }
}
