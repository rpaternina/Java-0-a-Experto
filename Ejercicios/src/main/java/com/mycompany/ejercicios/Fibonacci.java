
//Escribe un programa que genere la serie de Fibonacci hasta un número dado por el usuario
package com.mycompany.ejercicios;

import javax.swing.JOptionPane;

public class Fibonacci {

    public static void main(String[] args) {
        
                int n = 10;  // Término de la sucesión que deseas calcular
        int a = 0, b = 1;  // Los primeros dos números de Fibonacci

        System.out.print("Fibonacci hasta " + n + ": " + a + " " + b);

        for (int i = 2; i < n; i++) {
            int siguiente = a + b;
            System.out.print(" " + siguiente);
            a = b;  // Mover a la posición siguiente
            b = siguiente;  // Mover b a la posición siguiente
        }
        
    }
    
}
