package com.mycompany.stringd1;

public class Stringd2 {

    public static void main(String[] args) {
        //Comparando String
        
        String mensaje1 = " Hola";
        String mensaje2 = "Hola    ";
        
        //equals() nos sirve para hacer la comparación entre dos strings
        boolean resultado = mensaje1.trim().equals(mensaje2.trim());
        
        System.out.println(resultado);
    }
    
}
