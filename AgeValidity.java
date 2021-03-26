//Pedro Antonio Nava Hernández Programación Avanzada 
//Ejercicio 1 Leccion 5-1 Seccion 5
package com.example;
import java.util.*;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class AgeValidity {

    public static void main(String[] args) {
    System.out.println("Eres mayor de 18");
       Scanner sc = new Scanner(System.in);  
           boolean bn = sc.nextBoolean();  
           if (bn == true) {  
               System.out.println("You are over 18");  
           } else if (bn == false) {  
               System.out.println("You are under 18");  
           }  
           sc.close();                 
     


}

       
    }

