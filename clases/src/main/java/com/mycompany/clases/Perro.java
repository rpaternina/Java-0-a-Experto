
package com.mycompany.clases;

public class Perro {
    
    String nombre;
    String raza;
    int edad;
    
    //METODOS (void) --> no retorna nada
    
    void comer(){
        System.out.println("El perro puede comer");
    }
    
    void ladrar(){
        
    }
    
    //PARAMETROS
    
    void establecerAtributos(String nombrePerro, String razaPerro, int edadPerro){
        nombre = nombrePerro;
        raza = razaPerro;
        edad = edadPerro;
    }
}
