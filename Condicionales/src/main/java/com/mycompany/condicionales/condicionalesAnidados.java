package com.mycompany.condicionales;

public class condicionalesAnidados {

    public static void main(String[] args) {
        
        float promedio = 10.1f;
        
        if (promedio >= 7){
            
            if(promedio >= 10){
                System.out.println("Muchas felicidades");
            }else{
                System.out.println("Felicidades");
            }
        }else{
            System.out.println("Necesitas repasar");
        }
        
    }
    
}
