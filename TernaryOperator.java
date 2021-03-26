//Pedro Antonio Nava Hernández Programación Avanzada 
//Ejercicio 1 Leccion 5-2 Seccion 5
package conditionalex;

/**
 *
 * @author anshenoy
 */
public class TernaryOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     


        int x = 4, y = 9;
        if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }
        System.out.println("After if stmt, x = " + x);
        
         // Use a ternary operator to perform the same logic as above.
    }
}

      
    

