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
public class Ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner Ej5;
        Ej5 = new Scanner(System.in);
        
        System.out.println("Ingrese un nuemro entero: ");
        int num1 = Ej5.nextInt();
        
        int doble = num1 + num1;
        int triple = doble + num1;
        double num2;
        num2 = num1;
        double raiz = Math.sqrt(num2);
        
        System.out.println("su doble: " + doble);
        System.out.println("su triple: " + triple);
        System.out.println("su raíz: " + raiz);
        
        Ej5.close();
    }
    
}
