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
public class Ej_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Ej10 = new Scanner(System.in);
        int f = 0;
        System.out.println("Ingrese un numero:");
        do {
            int m = Ej10.nextInt();
            f++;

            System.out.print(m + " ");

            for (int i = 0; i < m; i++) {

                System.out.print(" * ");

            }
            System.out.println(" ");
        } while (f != 4);

    }

}
