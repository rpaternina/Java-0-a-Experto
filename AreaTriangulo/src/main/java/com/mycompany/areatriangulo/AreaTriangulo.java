
package com.mycompany.areatriangulo;

import javax.swing.JOptionPane;

public class AreaTriangulo {

    public static void main(String[] args) {
        
        
        Triangulo triangulo = new Triangulo();
        
        String sbase = JOptionPane.showInputDialog(null,"base");
        String saltura = JOptionPane.showInputDialog(null,"altura");
        
        triangulo.base = Float.parseFloat(sbase);
        triangulo.altura = Float.parseFloat(saltura);
        
        JOptionPane.showMessageDialog(null, triangulo.area());
        
    }
}
