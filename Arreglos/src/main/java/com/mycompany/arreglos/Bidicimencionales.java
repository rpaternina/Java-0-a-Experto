
package com.mycompany.arreglos;

import javax.swing.JOptionPane;

public class Bidicimencionales {

    public static void main(String[] args) {
        
        int filas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de filas"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de columnas"));
        
        int matriz [][] = new int [filas][columnas]; 
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero" + " de la fila " + i 
                        + " y la columna "+ j));
                
                System.out.println(matriz[i][j]);
            }  
        }
    }
    
}
