

package com.mycompany.clases;

import javax.swing.JOptionPane;

public class Clases {

    public static void main(String[] args) {
        
        Perro oregitas = new Perro();
        
        oregitas.nombre = JOptionPane.showInputDialog(null,"Nombre");
        oregitas.edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Edad"));
        
        System.out.println(oregitas.nombre + oregitas.edad);
        
    }
}
