//Pedro Antonio Nava Hernández Programación Avanzada 
//Ejercicio 2 Leccion 3-5 Seccion 3
package input02;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Aquí no hay nada, así que shao!",
                "Aviso",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Que pregunta harás? ",
                "Opciones",
                2,
                null,
                null,
                "Escribe ");
        
        
        String[] acceptableValues = {"A)", "B)", "C)"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Escoge",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
