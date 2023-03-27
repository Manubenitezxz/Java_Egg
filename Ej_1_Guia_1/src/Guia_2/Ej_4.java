/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_2;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Ej4;
        Ej4 = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura: ");
        int temp = Ej4.nextInt();
        
        int far = 32 + (9 * temp / 5);
        
        System.out.println("Fahrenheit: " + far);
        
        Ej4.close();
    }
    
}
