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
public class Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer; 
        leer = new Scanner(System.in);
        System.out.println("Ingrese un numeros: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un numeros: ");
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma es de: " + suma);
       
        leer.close();
    }
    
}
