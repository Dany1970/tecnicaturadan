/*
 Ejercicio 3 : Leer números hasta que se introduzca un cero. Para cada uno
indicar si es par o impar. 
Primero con clase JOptionPane
 */
package Ciclos03;

import javax.swing.JOptionPane;

public class Ejercicio03 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(numero != 0) {
            if(numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El número " +numero+ " es par");
            }
            else{
                JOptionPane.showMessageDialog(null, "El número " +numero+ " es impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
            
        }
        JOptionPane.showMessageDialog(null, "El número " +numero+ " finaliza el programa");
    
}
}