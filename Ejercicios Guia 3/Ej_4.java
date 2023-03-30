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
public class Ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner Ej4 = new Scanner(System.in);

        String palabra;

        do {

            System.out.println("Ingrese una palabra:");

            palabra = Ej4.nextLine();

            if (palabra.substring(0,1).equalsIgnoreCase("A")) {

                System.out.println("Tu palabra es correcta");

            } else {
                System.out.println("Segui participando");

            }
        } while (!palabra.substring(0,1).equalsIgnoreCase("A"));

        Ej4.close();
    }
    
}
