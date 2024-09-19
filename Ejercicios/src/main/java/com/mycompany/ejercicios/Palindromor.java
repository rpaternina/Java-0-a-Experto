
//Escribe un programa que verifique si una cadena de texto ingresada por el usuario es un palíndromo
package com.mycompany.ejercicios;

import javax.swing.JOptionPane;

public class Palindromor {

    public static void main(String[] args) {
        
        String palindromo = JOptionPane.showInputDialog(null, "Ingrese la palabra que desea saber si es palindromo");
        
        char cadenaPalindromo [] = new char[palindromo.length()];
        
        String guardarPalindromo = "";
        
        for(int i = palindromo.length() - 1; i >= 0; i--){
            cadenaPalindromo[i] = palindromo.charAt(i);
            guardarPalindromo += cadenaPalindromo[i];
        }
        
        if(guardarPalindromo.equals(palindromo))JOptionPane.showMessageDialog(null, palindromo + " Es un palindromo");        
        else JOptionPane.showMessageDialog(null, palindromo + " No es un palindromo");
                
    }
    
}
