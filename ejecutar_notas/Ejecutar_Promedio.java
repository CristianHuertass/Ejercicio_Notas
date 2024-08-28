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
public class Ejecutar_Promedio {
    
     public static void main(String[] args) {
        
        int tamaño;
        
        Scanner entrada = new Scanner(System.in);
        
        Calcular_Comparaciones obj = new Calcular_Comparaciones();
        
        System.out.println("Digite el tamaño del vector: ");
        
        tamaño = entrada.nextInt();
        
        double notas []= new double[tamaño];
        
        System.out.println("Digite las notas: ");
        
        for( int i=0; i<tamaño; i++){
            
            notas [i]= entrada.nextDouble();
        }
        
         obj.establecernotas2(notas);
         obj.Calcular_Compararciones();
         
         System.out.println("El promedio de las notas es : "+obj.getPromedio());
         System.out.println("El numero de estudiantes por arriba del promedio es: "+obj.getEstudiantes_arriba());
         System.out.println("El numero de estudiantes por abajo del promedio es: "+obj.getEstudiantes_abajo());
         
    }
}
