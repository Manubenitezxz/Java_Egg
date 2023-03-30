/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Ej5 = new Scanner(System.in);

        System.out.println("Ingrese un numero limite: ");
        
        int limite = Ej5.nextInt();
        int num;
        
        for (int i= 0; i < limite;) {
            
            System.out.println("Ingrese un numero: ");
            
            num = Ej5.nextInt();
            
            i += num;
            
        }
        
        System.out.println("Supero el limite establecido");
        
        
        Ej5.close();
    }
    
}
