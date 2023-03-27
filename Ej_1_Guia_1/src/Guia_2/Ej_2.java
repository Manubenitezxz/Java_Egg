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
public class Ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer; 
        leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.next();
        
        System.out.println("Bienvenida de vuelta " + nombre);
        leer.close();
    }
    
}
