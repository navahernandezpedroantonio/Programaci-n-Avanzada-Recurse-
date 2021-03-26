//Pedro Antonio Nava Hernández Programación Avanzada 
//Ejercicio 1 Leccion 5-1 Seccion 5
package com.example;

/**
 *
 * @author anshenoy
 */

import java.util.Scanner;
public class StringEquality {
  public static void main(String args []){
      
      Scanner entrada = new Scanner(System.in);
      String nombre= "Baphy", nombredos= "Baphy";
      System.out.println("Cual es tu nombre");
      nombre=entrada.nextLine();
     if(nombre.equals(nombre)){
         System.out.println("Rey del ska");
         
     }
     else{
         System.out.println("No eres bienvenido");
     }
  }

  

      
  
 

   
    }

