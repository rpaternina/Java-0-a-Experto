/*
Escribe un programa que tome un número entero y calcule la suma de sus dígitos. Por ejemplo, si el número es 1234, 
la suma sería 1 + 2 + 3 + 4 = 10.
 */
package com.mycompany.ejercicios;

import javax.swing.JOptionPane;

public class sumaDigitos {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        
        int suma = 0;
        for(int i = 1; i <= numero; i++){
            suma += i;
        }
        
        JOptionPane.showMessageDialog(null, "La suma de los digitos de " + numero + " es: " + suma);
       
    }
    
}
