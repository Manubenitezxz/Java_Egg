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
public class Ej_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Ej8 = new Scanner(System.in);

        System.out.println("Ingrese su nota: ");
        int Nota = Ej8.nextInt();

                
        while (Nota <= 0 || Nota >= 10) {

            System.out.println("Segui participando, ingresa tu nota: ");
            Ej8.nextInt();
        }
        
        System.out.println("Su nota es correcta");
        
        Ej8.close();
        
        /* <  >*/
    }

}
