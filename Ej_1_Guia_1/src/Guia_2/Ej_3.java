package Guia_2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manue
 */
public class Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Ej3;
        Ej3 = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String frase = Ej3.nextLine();
        
        System.out.println(frase.toLowerCase());
       
        System.out.println(frase.toUpperCase());
         Ej3.close();
    }
}
