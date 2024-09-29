/*
Escribe un programa que tome un número entero y devuelva su inverso. Por ejemplo, 
si el número es 1234, el resultado será 4321
 */
package com.mycompany.ejercicios;

import javax.swing.JOptionPane;

public class invertirNumero {

    public static void main(String[] args) {
       
        String numero = JOptionPane.showInputDialog(null, "Ingrese el numero a invertir");
        
        int invertirNumeros [] = new int [numero.length()];
        
        StringBuilder resultado = new StringBuilder("El numero " + numero + " invertido es: ");
        
        for(int i = numero.length() - 1; i >= 0; i--){
            
           resultado.append(numero.charAt(i)).append(""); 
        }
        
        JOptionPane.showMessageDialog(null, resultado.toString());  
    }
    
}
