/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutar_notas;

import java.util.Scanner;

/**
 *
 * @author aseso
 */
public class Ejecutar_empleados {
    
    public static void main(String[] args) {
         
       Scanner input= new Scanner(System.in);
       
       int Codigo_em1;
       String Nombre1;
       
        System.out.println("Calcule su sueldo ingresando los siguientes datos: \nIngrese su codigo de empleado: ");
        
        Codigo_em1= input.nextInt();
        
        input.nextLine();
        
        System.out.println("Ingrese su nombre: ");
        
        Nombre1= input.nextLine();
        
        System.out.println("Ingrese la opcion de acuerdo al tipo de empleado al que pertenece: \n1.Programador\n2.Analista\n3.Desarrollador ");
        
        int opcion=input.nextInt();
        
        
    }
}
