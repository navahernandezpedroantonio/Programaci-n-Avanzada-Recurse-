//Pedro Antonio Nava Hernández Programación Avanzada 
//Ejercicio 4 Leccion 3-5 Seccion 3
package input04;

import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));      
        
        //Edit these lines to advance the scanner
        sc.nextLine();
        System.out.println(sc.nextLine());
int xPosition , yPosition;
        
        
        //Does this line contain "BlueBumper"?
        System.out.println(sc.findInLine("BlueBumper"));
        //Store the next two numbers as xPosition and yPosition
        //Print these positions
        
        
        System.out.println("X: "        +", Y: "        );
        sc.close();
    }    
}
