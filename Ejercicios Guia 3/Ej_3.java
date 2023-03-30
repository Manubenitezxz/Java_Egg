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
public class Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Ej3 = new Scanner(System.in);

        String palabra;

        do {

            System.out.println("Ingrese una palabra:");

            palabra = Ej3.nextLine();

            if (palabra.length() == 8) {

                System.out.println("Tu palabra es correcta");

            } else {
                System.out.println("Segui participando");

            }
        } while (palabra.length() != 8);

        Ej3.close();
    }
    
}
