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
        Scanner  Ej7 = new Scanner(System.in);

        System.out.println("Ingrese el tipo de motor: ");
        int TipoDeoMotor = Ej7.nextInt();
        
        switch(TipoDeoMotor) {
        case 1:
        System.out.println("La bomba es de agua");
        break;
        case 2:
        System.out.println("La bomba es de gasolina");
        break;
        case 3:
        System.out.println("La bomba es de hormigon");
        break;
        case 4:
        System.out.println("La bomba es de pasta alimenticia");
        break;
        default:
        System.out.println("No existe un valor valido para el tipo de bomba");
        }
                

        

    }
    
}
