
//Escribe un programa que tome una lista de números ingresada por el usuario y los ordene en orden ascendente.
package com.mycompany.ejercicios;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class ordenarLista {

    public static void main(String[] args) {
        
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad del arreglo"));
        
        int numeros [] = new int[tamaño];
        
        int menor = numeros[0];
        
        for(int i = 0; i < tamaño; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero "+ (i+1) +": "));
            System.out.println(numeros[i]);
            
        }
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        
            
            
         
        /*StringBuilder resultado = new StringBuilder("Elementos ingresados:\n");
        for (int elemento : numeros) {
            resultado.append(elemento).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());*/
    }
        
}
    

