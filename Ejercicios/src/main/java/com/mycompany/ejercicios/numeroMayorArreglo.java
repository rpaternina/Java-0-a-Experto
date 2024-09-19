
//Escribe un programa que encuentre y muestre el número máximo y el número mínimo en un arreglo dado por el usuario.
package com.mycompany.ejercicios;

import javax.swing.JOptionPane;

public class numeroMayorArreglo {

    public static void main(String[] args) {
        
        
        int numeros [] = {10,20,1,100,-2,10000};
        
        int menor = numeros[0];
        int mayor = numeros[0];
        
        for(int i = 0; i < numeros.length; i++) {
            
            if(numeros[i] < menor)menor = numeros[i];
                
            else if(numeros[i] > mayor) mayor = numeros[i];
            
        }
        JOptionPane.showMessageDialog(null,"El numero menor del Array es: " + menor);        
        JOptionPane.showMessageDialog(null,"El numero mayor del Array es: " + mayor);
    }
    
}
