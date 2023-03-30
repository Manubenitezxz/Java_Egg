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
public class Ej_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Ej6 = new Scanner(System.in);
        
        String palabra;
        
        palabra = "";
        
        int num1, num2, op;
        
        System.out.println("Ingrese un numero:");
        
        num1 = Ej6.nextInt();
        
        System.out.println("Ingrese un numero:");
        
        num2 = Ej6.nextInt();
        
        do {
            
            System.out.println("Menú\n" + "1. Sumar\n" + "2. Restar\n" + "3. Multiplicar\n" + "4. Dividir\n" + "5. Salir\n" + "Elija una opción");
            
            System.out.println("Ingrese una opcion:");
            
            op = Ej6.nextInt();
            
            switch (op) {
                
                case 1:
                    
                    int suma = num1 + num2;
                    
                    System.out.println("La suma de los numeros es: " + suma);
                    
                    break;
                
                case 2:
                    
                    int resta = num1 - num2;
                    
                    System.out.println("La resta de los numeros es: " + resta);
                    
                    continue;
                
                case 3:
                    
                    int multi = num1 * num2;
                    
                    System.out.println("La multiplicación de los numeros es: " + multi);
                    
                    continue;
                
                case 4:
                    
                    int div = num1 / num2;
                    
                    System.out.println("La división de los numeros es: " + div);
                    
                    continue;
                
                case 5:
                    
                    System.out.println("Desea salir del programa? s/n: ");
                    
                    palabra = Ej6.next();
                    
                    if (palabra.equalsIgnoreCase("s")) {
                        
                        op = 6;
                        break;
                    }                    
                    
                    continue;
                
                default:
                    System.out.println("El numero ingresado no es una opción valida");
                
            }
            
        } while (op < 6 || op > 0 && palabra.equalsIgnoreCase("n"));
        
        System.out.println("Bye, Bye");
        
        Ej6.close();
     }
}    