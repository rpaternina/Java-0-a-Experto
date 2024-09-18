package com.mycompany.arreglos;

import javax.swing.JOptionPane;

public class Arreglos {

    public static void main(String[] args) {
        String nombres [] = new String[3];
        
        nombres[0] = "Robert";
        nombres[1] = "Keiry";
        nombres[2] = "Samuel";
        
        JOptionPane.showMessageDialog(null, nombres[0]+ ", " + nombres[1]+", " + nombres[2]);
    }
}
