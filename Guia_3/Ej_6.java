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
public class Ej_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int num1 = lectura.nextInt();

        System.out.println("Ingrese un numero:");
        int num2 = lectura.nextInt();

        if (num1 <= 25 && num2 <= 25) {
        System.out.println("el numero es menor");
        } else {
        System.out.println("El numero es mayor"); }

        lectura.close();
                
    }
    
}
