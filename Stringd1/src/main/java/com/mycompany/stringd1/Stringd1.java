/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringd1;

/**
 *
 * @author 57300
 */
public class Stringd1 {

    public static void main(String[] args) {
        String mensaje = "Mi nombre es Robert";
        String mensaje1 = "   Ejemplo trim ";
        
        //toUpperCase() sirve para poner todo el texto en mayusuculas
        System.out.println(mensaje.toUpperCase());
        
        //toLowerCase() sirve para poner todo el texto en minisculas
        System.out.println(mensaje.toLowerCase());
        
        //trim()  sirve para eliminar los espacios que hay antes del texto y al final
        System.out.println(mensaje1);
        System.out.println(mensaje1.trim());
    }
}
