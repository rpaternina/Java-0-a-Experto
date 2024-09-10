package com.mycompany.condicionales;

import javax.swing.JOptionPane;



public class ejercicioSwitch {

    public static void main(String[] args) {
        
       int menu = Integer.parseInt(JOptionPane.showInputDialog(null,"Eliga una opcion: \n"
                + "1: Sumar \n"+
                  "2: Restar \n"+
                  "3: Dividir \n"+
                  "4: Multiplicar"));
      
        switch (menu) {
            case 1:
                int suma, numero1,numero2;
                numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
                
                suma = numero1 + numero2;
                JOptionPane.showMessageDialog(null,"El resultado de la suma es: " + suma);
                break;
            case 2:
                int resta, rnumero1, rnumero2;
                rnumero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
                rnumero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
                resta = rnumero1 - rnumero2;
                JOptionPane.showMessageDialog(null,"El resultado de la resta es: " + resta);
            break;
        }
    }
    
}
