package com.mycompany.condicionales;

import javax.swing.JOptionPane;

public class bucleFor {

    public static void main(String[] args) {
        //Tabla de multiplicar
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero"));
        if(numero <= 0){
            JOptionPane.showMessageDialog(null, "Ingrese un numero mayor a 0");
        }
        
        int contador;
        for(contador = 1; contador <= 10; contador++){
            
            System.out.println(numero + " * " + contador + " = " + numero*contador);
        }
        
        }
    }
    

