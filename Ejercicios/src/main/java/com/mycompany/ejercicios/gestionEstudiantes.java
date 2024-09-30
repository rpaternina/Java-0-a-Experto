/*
    Crea un programa que permita ingresar datos de estudiantes (nombre, edad, notas), 
    almacenarlos en un array y realizar operaciones como:
    - Mostrar todos los estudiantes.
    - Buscar estudiantes por nombre.
    - Calcular el promedio de notas.
 */
package com.mycompany.ejercicios;

import javax.swing.JOptionPane;

public class gestionEstudiantes {

    public static void main(String[] args) {
        
        int menu = Integer.parseInt(JOptionPane.showInputDialog(null,"GESTION DE ESTUDIANTES \n"
                + "1: Ingresar datos de estudiantes \n"
                + "2: Mostrar todos los estudinates \n"
                + "3: Buscar estudiante por nombre \n"
                + "4: Calcular el promedio de notas \n"));

        switch (menu) {
            case 1:
                Object[] datos = new Object[5];
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
