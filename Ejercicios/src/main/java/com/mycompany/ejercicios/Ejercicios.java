
//Escribe un programa que sume todos los números impares entre 1 y un número dado por el usuario.

package com.mycompany.ejercicios;

import javax.swing.JOptionPane;

public class Ejercicios {

    public static void main(String[] args) {
        int suma = 0;
        
        int numeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        
        //StringBuilder resultado = new StringBuilder();
        
        for(int i = 1; i <= numeros; i++){
            if(i % 2 != 0){
                suma = suma + i;
                      
            }
            
        }
        System.out.println("La suma de los nuermos primos que hay de 1 a "+ numeros +" es: "+ suma);
    }
}
