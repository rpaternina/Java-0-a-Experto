
//Escribe un programa que calcule el factorial de un número dado por el usuario

package com.mycompany.ejercicios;

import javax.swing.JOptionPane;

public class Factorial {

    public static void main(String[] args) {
        
        int numFactorial = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero"));
        int contador = 1;
        
        for(int i = 1; i <= numFactorial; i++){
            contador *= i;
            
        }
        JOptionPane.showMessageDialog(null, "El factorial de "+ numFactorial + " es " + contador);
    
    }
    
}
