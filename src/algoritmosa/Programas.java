/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmosa;

import java.util.Scanner;

/**
 *
 * @author bcalderon
 */
public class Programas {
    
    public static void distanciaPuntos(){
        // Scanner
        Scanner teclado = new Scanner(System.in);
        
        //creacion de variables
        int xUno;
        int xDos;
        int yUno;
        int yDos;
        
        int distancia;
        
        //Ingreso de datos
        System.out.println("Ingrese la coordinada Uno en X");
        xUno = teclado.nextInt();
        
        System.out.println("Ingrese la coordenada Dos en X");
        xDos = teclado.nextInt();
        
        System.out.println("Ingrese la coordenada Uno en Y");
        yUno = teclado.nextInt();
        
        System.out.println("Ingrese la coordenada Dos en Y");
        yDos = teclado.nextInt();
        
        //Operacion.
        distancia = (xUno - xDos) * (xUno - xDos) + (yUno - yDos) * (yUno - yDos);
        distancia = (int)Math.sqrt(distancia);
        
        //Mostrar informacion 
        System.out.println("La distancia entre los puntos es: " + distancia);
    }
    
    public static void calificacion(){
        // Scanner
        Scanner teclado = new Scanner(System.in);
        
        //Creacion de VARIABLES
        double calificacion;
        
        //Ingreso de informacion
        System.out.println("Ingrese la calificacion del alumno");
        calificacion = teclado.nextDouble();
        
        //Operacion y Muestra de informacion.
        if(calificacion > 8)
        {
            System.out.println("APROBADO");
        }
    }
    
    public static void aumentoSueldo(){
        // Scanner
        Scanner teclado = new Scanner(System.in);
        
        //Creacion de Variables 
        double sueldo;
        
        //Ingreso de datos
        System.out.println("Ingrese el sueldo del trabajador");
        sueldo = teclado.nextDouble();
        
        //Operacion y muestra de datos
        if(sueldo < 1000)
        {
            //Aumento del sueldo
            sueldo = sueldo + (sueldo * 0.15);
            
            //Mostrar informacion
            System.out.println("El nuevo sueldo del trabajador es: Q" + sueldo);
        }
    }
    
    public static void calificacionMejorado(){
        // Scanner
        Scanner teclado = new Scanner(System.in);
        
        // Creacion de variables
        double calificacion;
        
        //Ingreso de datos
        System.out.println("Ingrese la calificacion del alumno.");
        calificacion = teclado.nextDouble();
        
        //Operacion, condicion y muestra de informacion
        if(calificacion >= 8)
        {
            System.out.println("APROBADO");
        } else {
            System.out.println("REPROBADO");
        }
    }
    
    public static void aumentoSueldoMejorado(){
        // Scanner
        Scanner teclado = new Scanner(System.in);
        
        //creacion de variables
        double sueldo;
        
        //ingreso de datos
        System.out.println("Ingresar el sueldo del trabajor.");
        sueldo = teclado.nextDouble();
        
        //Operacion y condicion.
        if(sueldo < 1000)
        {
            //aumenta el 15% del sueldo
            sueldo = sueldo + (sueldo * 0.15);
        } else {
            //auemnta el 12% del sueldo
            sueldo = sueldo + (sueldo * 0.12);
        }
        
        //Muestra informacion
        System.out.println("El nuevo sueldo del trabajador es: Q" + sueldo);
    }
    
    public static void datosNumericos(){
        // Scanner
        Scanner teclado = new Scanner(System.in);
        
        //creacion de variables
        int op;
        int numero;
        
        double resultado = 0;
        
        //Ingreso de datos
        System.out.println("Ingrese el numero a Operar");
        numero = teclado.nextInt();
        
        System.out.println("Ingrese la opcion que desea,\n"
                + "1 = Multiplicacion con 100\n"
                + "2 = Eleva 100 con el numero ingresado.\n"
                + "3 = 100 dividido el numero ingresado.\n"
                + "0 = Fin.");
        op = teclado.nextInt();
        
        //multi condicion.
        switch(op){
            case 1:
                resultado = numero * 100;
                break;
            case 2:
                resultado = Math.pow(100, numero);
                break;
            case 3: 
                resultado = 100 / numero;
                break;
            default: 
                System.out.println("No ingreso una opcion valida");
        }
        
        //Mostrar resultados
        System.out.println("El resultado de la operacion de la opcion elegida es: " + resultado);
    }
    
    public static void numerosDescendente(){
        // Scanner
        Scanner teclado = new Scanner(System.in);
        
        //Creacion de variables
        int a;
        int b;
        int c; 
        
        //Ingreso de datos
        System.out.println("Ingrese el primer numero. ");
        a = teclado.nextInt();
        
        System.out.println("Ingrese el segundo numero. ");
        b = teclado.nextInt();
        
        System.out.println("Ingrese el tercer numero. ");
        c = teclado.nextInt();
        
        //Operacion y muestra de informacion
        if(a > b)
        {
            if(a > c)
            {
                if (b > c) {
                    System.out.println("Los numero Descendentes son: " + a + " " + b + " " + c);
                } else {
                    System.out.println("Los numero Descendentes son: " + a + " " + c + " " + b);
                }
            } else {
                System.out.println("Los numero Descendentes son: " + c + " " + a + " " + b);
            }
            
        } else if(b > c) {
            
            if (a > c) {
                System.out.println("Los numero Descendentes son: " + b + " " + a + " " + c);
            } else {
                System.out.println("Los numero Descendentes son: " + b + " " + c + " " + a);
            }
        } else {
            System.out.println("Los numero Descendentes son: " + c + " " + b + " " + a);
        }
    }
    
    public static void nomina(){
        // Scanner
        Scanner teclado = new Scanner(System.in);
        
        //crecion de variables
        double nomina = 0;
        double sueldo;
        int cont = 1;
        
        // operacion con FOR
//        for (int i = 1; i <= 10; i++) {
//            //ingreso de informacion
//            System.out.println("Ingrese el sueldo del empleado " + i);
//            sueldo = teclado.nextDouble();
//            
//            nomina = nomina + sueldo;
//        }

//        while(cont <= 10){
//            System.out.println("Ingrese el sueldo del empleado " + cont);
//            sueldo = teclado.nextDouble();
//            
//            nomina = nomina + sueldo;
//            cont++;
//        }
        
        do {
            System.out.println("Ingrese el sueldo del empleado " + cont);
            sueldo = teclado.nextDouble();
            
            nomina = nomina + sueldo;
            cont++;
        } while (cont <= 10);
        
        
        
        System.out.println("La nomina o planilla de la empresa es: Q" + nomina);
    }
    
    public static void encuentraCeros(){
        // Scanner
        Scanner teclado = new Scanner(System.in);
        
        //Creacion de variables
        int numero;
        int numorosIngresar;
        int totalCeros = 0;
        
        //Ingreso de cuantos numeros van a ingresar
        System.out.println("Ingrese la cantidad de numeros que va a introducir. ");
        numorosIngresar = teclado.nextInt();
        
        for (int i = 0; i < numorosIngresar; i++) {
            System.out.println("Ingrese su numero.");
            numero = teclado.nextInt();
            
            if (numero == 0) {
                totalCeros++;
            }
        }
        
        System.out.println("El total de 0 ingresados fue: " + totalCeros);
    }
}
