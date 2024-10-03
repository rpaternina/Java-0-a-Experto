/*
    Crea un programa que permita 
    -ingresar datos de estudiantes (nombre, edad, notas), 
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
        
        List <Estudiante> listaEstudiante = new ArrayList<Estudiante>();
        
        while(true){
            
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null,"GESTIÓN DE ESTUDIANTES \n\n"
                + "1: Ingresar datos de estudiantes \n"
                + "2: Mostrar estudiantes \n"
                + "3: Buscar estudiante por nombre \n"
                + "4: Calcular el promedio de notas \n"
                + "5: Salir"));
        
        switch (menu) {
            
            //ingresar datos de estudiantes (nombre, edad, notas)
            case 1:
                while(true){
                    
                    //Cree un ArrayList para guardar a mi Estudiante
                    String nombres = JOptionPane.showInputDialog(null,"Nombre");
                    
                    int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Edad"));
                    
                    String notas = JOptionPane.showInputDialog(null,"Notas");
                    
                    float notasEstudiantes = Float.parseFloat(notas);
                    
                    //agrego a la lista un estudiante nuevo con los parametros del constructor
                    listaEstudiante.add(new Estudiante(nombres,edad,notasEstudiantes));
                    
                    String salir = JOptionPane.showInputDialog(null,"Desea registrar otro estudiante? (SI/NO)");
                  
     
                    if(salir.toLowerCase().equals("no")){
                        break;
                    }
                } 
                break;
            
            //Mostrar todos los estudiantes.    
            case 2:
                
                //is.Empty() --> es para ver si el ArrayList esta vacio
                if(listaEstudiante.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No hay estudiantes");
                } else {
                    StringBuilder datos = new StringBuilder();
                    for(Estudiante nombre:listaEstudiante){
                    datos.append(nombre.getNombre()).append("- \n");
                    }
                    JOptionPane.showMessageDialog(null,"Estudiantes \n" + datos.toString());
                }
                break;
            
            //Buscar estudiantes por nombre.
            case 3:
                
                String buscar = JOptionPane.showInputDialog(null,"Ingrese el nombre del estudiante a buscar");
                
                if(listaEstudiante.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Aún no se encuentran estudiantes registrados");
                }else{
                    
                    for(Estudiante nombre:listaEstudiante){
                        if(buscar.equals(nombre.getNombre())){
                            JOptionPane.showMessageDialog(null, 
                                "Nombre: \n" + nombre.getNombre() + 
                                "Edad: \n" + nombre.getEdad() + 
                                "Notas: \n" +nombre.getNotas());
                        }else{
                            JOptionPane.showMessageDialog(null, "Este estudiante no existe");
                    }       
                }
                }
      
                break;
                
            default:
                JOptionPane.showMessageDialog(null,"Por favor inserte una opción valida");
                
                   
        }
    }
        
        
    }
}
