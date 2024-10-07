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
import java.util.Arrays;
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
                    
                    int notas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de notas"));
                    
                    float variasNotas [] = new float[notas];
                    
                    //lleno el array de notas
                    
                    for(int i = 0; i < variasNotas.length; i++){
                        
                        variasNotas[i] = Float.parseFloat(JOptionPane.showInputDialog(null,"Nota " + (i+1) + " :"));  
                        
                    }
            
                    //agrego a la lista un estudiante nuevo con los parametros del constructor
                    listaEstudiante.add(new Estudiante(nombres,edad, variasNotas));
                    
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
                    JOptionPane.showMessageDialog(null, "Aún no se encuentran estudiantes registrados");
                } else {
                    StringBuilder datos = new StringBuilder();
                    for(Estudiante nombre:listaEstudiante){
                   
                    datos.append("\n - ").append(nombre.getNombre());
                    }
                    JOptionPane.showMessageDialog(null,"Estudiantes" + datos.toString().toUpperCase());
                }
                break;
            
            //Buscar estudiantes por nombre.
            case 3:
                
                String buscar = JOptionPane.showInputDialog(null,"Ingrese el nombre del estudiante a buscar");
                String mayuscula = buscar.toLowerCase();
                boolean datosEncontrados = false;
                                
                if(listaEstudiante.isEmpty())
                    JOptionPane.showMessageDialog(null, "Aún no se encuentran estudiantes registrados");
                else{
                    
                    StringBuilder datosCompletos = new StringBuilder();
                    for(Estudiante nombre:listaEstudiante){
                        
                        if(mayuscula.trim().equals(nombre.getNombre())){
                            
                            //como las notas son un array, tengo que poner en notas Arrays.toString
                            datosCompletos.append("\n Nombre: ").append(nombre.getNombre().toUpperCase()).
                                    append("\n Edad: ").append(nombre.getEdad()).
                                    append("\n Notas: ").append(Arrays.toString(nombre.getNotas()));
                            datosEncontrados = true;
                            break;

                        }      
                    }
                    
                    if(datosEncontrados)JOptionPane.showMessageDialog(null,"Datos del Estudiante \n" +
                            datosCompletos.toString());
                    
                    else JOptionPane.showMessageDialog(null,"Este estudiante no existe");
                   
                }
      
                break;
            
            //Calcular el promedio de notas    
            case 4: 
                
                String estudiante = JOptionPane.showInputDialog(null,"Estudiante");
                boolean encontrados = false;
                float suma = 0;
                if(listaEstudiante.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No hay estudiantes");
                    
                }else{ 
                    
                    StringBuilder notasEstudiante = new StringBuilder();
//                    for(Estudiante promedioNotas: listaEstudiante){
//                        if(estudiante.trim().toLowerCase().equals(promedioNotas.getNombre()));
//                        notasEstudiante.append("\n Nombre: ").append(promedioNotas.getNombre().toUpperCase()).
//                                append("\n Notas: ").append(Arrays.toString(promedioNotas.getNotas()));
//                        
//                        suma = promedioNotas.getNotas() + promedioNotas.getNotas();
//                        encontrados = true;
//                        break;
//                }

                    for(int i = 0; i < listaEstudiante.size();i++){
                        if(estudiante.trim().equals(listaEstudiante.get(i).getNombre())){
                            notasEstudiante.append(listaEstudiante.get(i).getNombre());
                            float[] notas = listaEstudiante.get(i).getNotas();
                           

                            // Recorrer el array de notas
                            for (float nota : notas) {
                suma += nota; // Sumar cada nota
            }
                        }
                    }
                    
                    if(encontrados) JOptionPane.showMessageDialog(null,"Notas \n" + notasEstudiante.toString());
                    else JOptionPane.showMessageDialog(null,"No existe");
                }
                
                break;
               
            default:
                JOptionPane.showMessageDialog(null,"Por favor inserte una opción valida 1-5");
                
                   
        }
    }
        
        
    }
}
