/*
    Crea un programa que permita ingresar datos de estudiantes (nombre, edad, notas), 
    realizar operaciones como:
    - Mostrar todos los estudiantes.
    - Buscar estudiantes por nombre.
    - Calcular el promedio de notas.
 */

package com.mycompany.gestionestudiantes;

import javax.swing.JOptionPane;

public class GestionEstudiantes {

    public static void main(String[] args) {
        
        
        int menu = Integer.parseInt(JOptionPane.showInputDialog(null,"GESTIÓN DE ESTUDIANTES \n\n"
                + "1: Ingresar datos de estudiantes \n"
                + "2: Mostrar estudiantes \n"
                + "3: Buscar estudiante por nombre \n "
                + "4: Calcular el promedio de notas \n"
                + "5: Salir"));
        
        switch (menu) {
            case 1:
                
                while(true){
                    Estudiante estudiante = new Estudiante();
                estudiante.setNombre(JOptionPane.showInputDialog(null," Nombre: "));
                }
                
                
                break;
            default:
                throw new AssertionError();
        }
    }
}
