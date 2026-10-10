package algoritmosa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bcalderon
 */
public class Presentacion {
    
    public static void datosPersonales(){
        System.out.println("Nombre: Byron Calderon");
        System.out.println("Edad: 29 años");
        System.out.println("Genero: Masculino.");
        System.out.println("Direccion: Guastatoya, El Progreso.");
        System.out.println("Ingeriero en sistemas");
        System.out.println("Univerdsidad Mariano Galvez");
        
    }
    
    public static void datosPersonalesVariables(){
        
        // Creacion de Variables
        String nombre;
        int edad;
        char genero;
        String direccion;
        
        // Asignamos datos a las variables
        nombre = "Byron Calderon";
        edad = 29;
        genero = 'M';
        direccion = "Guastatoya, El Progreso.";
        
        //Impresion de Datos
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero(M=Masculino, F=Femenino): " + genero);
        System.out.println("Direccion: " + direccion);
    }
    
}

