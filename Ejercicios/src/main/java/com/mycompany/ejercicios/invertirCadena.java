
//Escribe un programa que tome una cadena de texto dada por el usuario y la invierta. Por ejemplo, "hola" se convertiría en "aloh
package com.mycompany.ejercicios;

import javax.swing.JOptionPane;

public class invertirCadena {

  
    public static void main(String[] args) {
        
        String cadena = JOptionPane.showInputDialog(null, "Ingrese la cadena a invertir");
        
        char caracteres [] = new char[cadena.length()];
        
        String invertida = "";
        
        for(int i = cadena.length() - 1; i >= 0; i--){
            caracteres[i] = cadena.charAt(i);
            invertida += caracteres[i];
           
        }
        
        JOptionPane.showMessageDialog(null, "La cadena invertida es: " + invertida);
       
    }
    
}
