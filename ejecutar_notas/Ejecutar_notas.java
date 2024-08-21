/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutar_notas;

import java.util.Scanner;

/**
 *
 * @author Cristian Huertas
 */
public class Ejecutar_notas {

    public static void main(String[] args) {
        
       
        Operaciones_notas obj = new Operaciones_notas();
        
        double Notas[]= new double[15];
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite las notas del curso: ");
        
        for(int i=0; i<Notas.length; i++){
            
            Notas[i]= entrada.nextDouble(); 
        }
        
        obj.EstablecerNotas2(Notas);
        obj.comparar_notas();
        
        System.out.println("\nLa nota mayor es: "+obj.MayorNota);
        System.out.println("\nEl porcentaje de estudiantes que aprobaron es: "+obj.porcentaje);
        System.out.println("\nEl promedio de las notas es: "+obj.Promedio);
        System.out.println("\nLa posicion del numero menor es: "+obj.Posicion_Menor);
    }
    
}
