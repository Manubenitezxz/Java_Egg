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
        
        System.out.println("Ingrese el tamaño del cuadrado:");
        
        int N = Ej8.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
            
            Ej8.close();
        }
    }    
}