package com.mycompany.condicionales;

public class Condicionales {

    public static void main(String[] args) {
                String color = "amarillo";
        
        if(color.equalsIgnoreCase("verde")){
            System.out.println("Puede pasar");
        } else if (color.equalsIgnoreCase("Amarillo")){
            System.out.println("Preparese para arrancar");
        } else {
            System.out.println("Alto");
        }
    }
    }
