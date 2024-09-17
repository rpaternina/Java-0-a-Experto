package com.mycompany.condicionales;

import javax.swing.JOptionPane;

public class primo {

    public static void main(String[] args) {
        // numeros primos
        int contador = 0;
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        
        //Esto me sirve para mostrar las cosas que estan dentro de un for en una sola linea de codigo
        StringBuilder divisores = new StringBuilder();
        
        for(int i = 1; i <= numero; i++){
            //divisores = numero / i;
            if(numero % i == 0){
                
                /*Se usa StringBuilder para construir la cadena de divisores de manera eficiente. 
                StringBuilder es más adecuado para concatenaciones de cadenas dentro de un bucle.*/
                if (divisores.length() > 0) {
                    /*Se usa StringBuilder para construir la cadena de divisores de manera eficiente. 
                    StringBuilder es más adecuado para concatenaciones de cadenas dentro de un bucle.*/
                    divisores.append(", ");
                }
                //Agrego los divisores i en la variable divisores
                divisores.append(i);
                contador++;    
            }            
        }
        
        System.out.println("Los divisores de " + numero + " son: " + divisores);
        
        if(contador == 2){
            System.out.println( numero + " ES PRIMO");
        }else{
            System.out.println( numero +" NO ES PRIMO");
        }
        
    }
    
}
