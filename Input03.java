//Pedro Antonio Nava Hernández Programación Avanzada
//Ejercicio 3 Leccion 3-5 Seccion 3
package input03;
import java.util.Scanner;
class Input03 {

    public static void main(String[] args) {
      int n,n2,n3,respuesta;  //Create a Scanner
      System.out.println("Suma de 3 números");
    Scanner numero=new Scanner(System.in);
    System.out.println("Primer numero");
    n=numero.nextInt();
   System.out.println("Segundo numero");
    n2=numero.nextInt(); 
     System.out.println("Tercer numero");
    n3=numero.nextInt();//Find and print the sum of three integers entered by the user
        
      respuesta=n+n2+n3;
      System.out.println(respuesta);
        
        
        //Remember to close the Scanner
        
    }
}
