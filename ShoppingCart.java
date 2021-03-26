//Pedro Antonio Nava Hernández Programación Avanzada
//Ejercicio 1 Leccion 5-1 Seccion 5
package com.example;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

	// numeric fields
        double price = 21.99;
        int quantity = 0;
        double tax = 1.04;
	double total;
	String message = custName+" wants to purchase "+quantity+" "+itemDesc;

	// Calculating total cost
        total = (price*quantity)*tax;

        
        // Declare outOfStock variable and initialize it
        Boolean outOfStock= new Boolean(true);
        if(quantity>1){
            System.out.println("Producto en existencia");
        }
        
        else{
            System.out.println("Producto agotado");
        }
        // Test quantity and modify message if quantity > 1.  
         
        
        // Test outOfStock and notify user in either case.  
        
        
        
    }
    
}


