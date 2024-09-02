package com.mycompany.stringd1;

public class Stringd2 {

    public static void main(String[] args) {
        //Comparando String
        
        String mensaje1 = "Hola ", mensaje2 = "hOla";
        
        //equals() nos sirve para hacer la comparación entre dos strings
        boolean resultado = mensaje1.trim().equals(mensaje2.trim());
        System.out.println(resultado);
        
        //equalsIgnoreCase() sirve para comparar el texto sin importar que esten diferentes siempre y cuando sean el mismo texto
        boolean resultado1 = mensaje1.equalsIgnoreCase(mensaje2);
        System.out.println(resultado1);
    }
    
}
