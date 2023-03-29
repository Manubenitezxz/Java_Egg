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
public class Ej_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Ej9 = new Scanner(System.in);
        int num, suma, i;

        suma = 0;
        i = 0;
        
        do {
            System.out.println("Ingrese un numero:");
            num = Ej9.nextInt();

            i = i + 1;

            if (num > 0) {

                suma = suma + num;
            }

        } while (num != 0 && i < 20);

        System.out.println("Se capturo el numero 0");
        System.out.println("La suma de los nuemros ingresados es de " + suma);

        Ej9.close();
    }
    
}