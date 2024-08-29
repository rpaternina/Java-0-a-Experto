package com.mycompany.opreadorternario;

public class OpreadorTernario {

    public static void main(String[] args) {
        /*Funciona como un if-else, ejemplo
        Si expresion1 = true entonces expresion 2
        Si expresion1 = false entonces expresion 3
        */
        
        String mensaje = 100 > 99 ? "Es mayor" : "Es menor";
        System.out.println(mensaje);
    }
}
