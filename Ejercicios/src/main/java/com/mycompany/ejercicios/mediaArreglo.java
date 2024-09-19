
//Escribe un programa que calcule y muestre la media de un arreglo de números dado por el usuario.
package com.mycompany.ejercicios;

import javax.swing.JOptionPane;

public class mediaArreglo {

    public static void main(String[] args) {
        
        int cantidadArreglo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño del arreglo"));
        int numeros [] = new int [cantidadArreglo];
        int suma = 0;
        float division = 0; 
        
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero: " + (i+1)));
            suma += numeros[i];
            division = suma / numeros.length;
        }  
        
        JOptionPane.showMessageDialog(null, "La media del arreglo es: "+ division);
    }
    
}
