

package com.mycompany.clases;

import javax.swing.JOptionPane;

public class Clases {

    public static void main(String[] args) {
        
        Perro oregitas = new Perro();
        
        oregitas.nombre = JOptionPane.showInputDialog(null,"Nombre");
        oregitas.edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Edad"));
        oregitas.raza = JOptionPane.showInputDialog(null,"Nombre");
        
        oregitas.establecerAtributos(oregitas.nombre, oregitas.raza,oregitas.edad);
        
        
        
    }
}
