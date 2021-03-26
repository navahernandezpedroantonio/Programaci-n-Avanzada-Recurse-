//Pedro Antonio Nava Hernández Programación Avanzada 
//Ejercicio 1 Leccion 5-2 Seccion 5
package conditionalex;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class ComputeFare {

    public static void main(String args[]) {
        System.out.print("Enter the age \n");
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        int fare=5;
if(fare ==5){
    if(age < 11){
        System.out.println("La tarifa es de 3 pesos");
    }
   if(age >11 && age<65){
       System.out.println("La tarifa es de 5 pesos");
       
   } 
   else{
         System.out.println("La tarifa es de 3 pesos");  
   }
}}}

    

