//Pedro Antonio Nava Hernández Programación Avanzada 
//Ejercicio 1 Leccion 5-3 Seccion 5
package com.example;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class SwitchEx2 {

    public static void main(String args[]) {
         char option = 'A';
        int aCount = 0, bCount = 0, cCount = 0;
        switch (option) {
            case 'A':
                aCount++;
                System.out.println("Count of A  " + aCount);
                
            case 'B':
                bCount++;
                System.out.println("Count of B  " + bCount);
                ;
            case 'C':
                cCount++;
                System.out.println("Count of B  " + cCount);
                break;
       
        }

    }
}


