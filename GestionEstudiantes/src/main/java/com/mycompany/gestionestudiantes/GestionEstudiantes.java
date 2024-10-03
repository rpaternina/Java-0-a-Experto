/*
    Crea un programa que permita ingresar datos de estudiantes (nombre, edad, notas), 
    realizar operaciones como:
    - Mostrar todos los estudiantes.
    - Buscar estudiantes por nombre.
    - Calcular el promedio de notas.
 */

package com.mycompany.gestionestudiantes;

import java.util.ArrayList;
import java.util.List;
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
                    List <Estudiante> listaEstudiante = new ArrayList<Estudiante>();
                    String nombre = JOptionPane.showInputDialog(null,"Nombre");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Edad"));
                    String notas = JOptionPane.showInputDialog(null,"Notas");
                    float notasEstudiantes = Float.parseFloat(notas);
                    listaEstudiante.add(new Estudiante(nombre,edad,notasEstudiantes));
                    String salir = JOptionPane.showInputDialog(null,"Desea registrar otro estudiante? (SI/NO)");
                  
                    
                    if(salir.toLowerCase().equals("no")){
                        break;
                    }
                } 
                break;
            
            case 2:
                
                break;
            default:
                throw new AssertionError();
        }
    }
}
