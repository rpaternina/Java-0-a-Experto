/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cast;

/**
 *
 * @author 57300
 */
public class Cast {

    public static void main(String[] args) {
        /*
        Si queremos asignar un valor diferente al tipo de variable definida nos dara error
        y debemos aplicar el cast, que es convertir la variable al tipo soportado
        EJEMPLO:
        **/
        
        int number = 10, resultado;
        float number2 = 20.5f;
    
        //al poner (int) antes de la  variable se convierte de float a entero 20.5 a 20
        resultado = number + (int)number2;
        
        System.out.println(resultado);
        
        //Podemos convertir la variable en cualquier tipo por EJEMPLO
        System.out.println((float)number);
        
        
    }
}
