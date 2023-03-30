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
public class Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Ej1 = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        
        double num = Ej1.nextDouble();

        if (num % 2 == 0) {
            
            System.out.println("El numero es par");

        } else {
            System.out.println("El numero es impar");
        }

        Ej1.close();
    }
    
}
