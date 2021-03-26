//Pedro Antonio Nava Hernández Programación Avanzada
//Ejercicio 1 Leccion 5-2 Seccion 5
package conditionalex;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

    public static void main(String args[]) {
            Scanner in= new Scanner(System.in);
        int precio=12;
        int rango=5;
        System.out.print("Introduce el precio de la película\n");
       precio=in.nextInt();
       System.out.print("Introduce el rango de la película");
       rango=in.nextInt();
       if(precio>=12 && rango ==5){
           System.out.println("Estoy interesado en ver la pelicula");
       }else{
           System.out.println("No estoy interesado en ver la pelicula");
       }
        
        

    }
}
