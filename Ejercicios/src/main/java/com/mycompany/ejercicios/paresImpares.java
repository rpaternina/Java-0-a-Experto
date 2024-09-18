
//Escribe un programa que cuente cuántos dígitos pares e impares hay en un número dado por el usuario.
package com.mycompany.ejercicios;

import javax.swing.JOptionPane;

public class paresImpares {

    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        int contadorPares = 0;
        int contadorInpares = 0;
        
        for(int i = 1; i <= numero; i++){
            if(i % 2 == 0)contadorPares++;
            else if(i % 2 != 0) contadorInpares++;  
        }
    
    JOptionPane.showMessageDialog(null, "La cantidad de pares que hay entre 1 y " + numero + " es: " +contadorPares);
    JOptionPane.showMessageDialog(null, "La cantidad de impares que hay entre 1 y " + numero + " es: " +contadorInpares);
    }
    
}
