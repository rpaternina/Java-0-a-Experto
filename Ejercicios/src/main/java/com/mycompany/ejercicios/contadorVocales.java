/*
Escribe un programa que tome una cadena de texto ingresada por el usuario y cuente cuántas vocales hay en ella(
considera tanto mayúsculas como minúsculas).
*/
package com.mycompany.ejercicios;

import javax.swing.JOptionPane;

public class contadorVocales {

    public static void main(String[] args) {
        
        String cadenaTexto = JOptionPane.showInputDialog(null, "Ingrese una cadena de texto");  
        String minuscula = cadenaTexto.toUpperCase();
        
        char textos [] = new char[minuscula.length()];
        
        int contador = 0;
        
        for(int i = 0; i < textos.length; i++){
            textos[i] = minuscula.charAt(i);
            
            String convertir = String.valueOf(textos[i]);
            
            if(convertir.contains("A")|| convertir.contains("E")|| convertir.contains("I")|| 
                    convertir.contains("O")|| convertir.contains("U")) contador++;
         
        }
        
        JOptionPane.showMessageDialog(null, "La palabra "+ cadenaTexto + " tiene " + contador + " vocales");
   
    } 
}
