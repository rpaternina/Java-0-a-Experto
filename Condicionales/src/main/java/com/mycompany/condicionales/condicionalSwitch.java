
package com.mycompany.condicionales;

public class condicionalSwitch {

    public static void main(String[] args) {
        
        String semaforo = "Verde";
        
        switch (semaforo) {
            case "Verde":
                System.out.println("Continue");
                break;
            case "Amarillo":
                System.out.println("Preparese para avanzar");
                break;
            case "Rojo":
                System.out.println("Alto");
                break;
        }
        
    }
    
}
