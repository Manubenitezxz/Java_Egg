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
public class Ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Ej2 = new Scanner(System.in);
       
        String frase;
        
       do  {
           
           System.out.println("Ingrese una frase:");
           
           frase = Ej2.nextLine();
            
           if (frase.equalsIgnoreCase("eureka")) {
            
            System.out.println("Felicitaciónes tu frase es correcta");

        } else {
            System.out.println("Segui participando");
            
        }
       } while (!frase.equalsIgnoreCase("eureka"));
       
       
        Ej2.close();
    }
    
}