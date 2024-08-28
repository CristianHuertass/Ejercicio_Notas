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
        
        int tamaño;//se declara la variable que almacena el numero de notas que se van a ingressar
        
        Scanner entrada = new Scanner(System.in);
        
        Calcular_Comparaciones obj = new Calcular_Comparaciones();// se define la subclase como un objeto
        
        System.out.println("Digite el tamaño del vector: ");
        
        tamaño = entrada.nextInt();//se almacena el numero de notas en la variable
        
        double notas []= new double[tamaño];// se le da el tamaño al array segun el numero der notas
        
        System.out.println("Digite las notas: ");
        
        for( int i=0; i<tamaño; i++){//se recorre el vector y se ingresan el valor de cada nota
            
            notas [i]= entrada.nextDouble();
        }
        
         obj.establecernotas2(notas);//llamamos al objeto que creamos con la funcion establecernotas2 y llenamos el array
         obj.Calcular_Compararciones();//llamamos a un obejto con la funcion Calcular_Comparaciones para que haga las debidas operaciones
         
         //Se imprimen los resultados obtenidos por medio de los getters
         
         System.out.println("El promedio de las notas es : "+obj.getPromedio());
         System.out.println("El numero de estudiantes por arriba del promedio es: "+obj.getEstudiantes_arriba());
         System.out.println("El numero de estudiantes por abajo del promedio es: "+obj.getEstudiantes_abajo());
         
    }
}
