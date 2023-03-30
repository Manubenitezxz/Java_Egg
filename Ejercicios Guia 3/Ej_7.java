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
public class Ej_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      Scanner Ej7 = new Scanner(System.in);
      String cadena, letra;
      int correcto, incorrecto;
      correcto = 0;
      incorrecto = 0;
        do {
            System.out.print("ingrese un codigo valido\n");
            
            cadena = Ej7.nextLine();
           
            
            if (cadena.substring(0,1).equalsIgnoreCase("x") && cadena.substring(4,5).equalsIgnoreCase("o") && cadena.length()==5 ) {
                System.out.print("ingreso valido\n");
                correcto += 1;
            } else if (cadena.equalsIgnoreCase("&&&&&"))
                System.out.print("Salida exitosa\n");
            else {
                System.out.print("ingreso NO valido\n");  
                incorrecto += 1;
             }
        } while (!cadena.equalsIgnoreCase("&&&&&"));
        System.out.print("Cantidad de correctos: "+ correcto + "\n"); 
        System.out.print("Cantidad de incorrectos: "+ incorrecto + "\n");
        
        Ej7.close();
    }
    
}
