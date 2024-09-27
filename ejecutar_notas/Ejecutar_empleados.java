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
       
       int Codigo_em;
       String Nombre;
       
        System.out.println("Digite el numero de empleados para calcular el sueldo: ");
        
        int Ne= input.nextInt();
        
        int empleados[]= new int[Ne];
        
        System.out.println("\nCalcule su sueldo ingresando los siguientes datos. ");
        
        for(int i=0; i<empleados.length; i++){
        
        System.out.println("Ingrese la opcion de acuerdo al tipo de empleado al que pertenece: \n1.Programador\n2.Analista\n3.Desarrollador ");
        
        int opcion=input.nextInt();
        
        switch (opcion){
            
            case 1 -> {
                
                System.out.println("Ingrese su codigo de empleado: ");
                
                Codigo_em= input.nextInt();
                
                input.nextLine();
                 
                System.out.println("Ingrese su nombre: ");
        
                Nombre= input.nextLine();
                
                Programadores programadores = new Programadores(Codigo_em,Nombre);
                
                System.out.println("Ingrese el sueldo que gana el empleado "+Nombre+": ");
                
                double SalarioFijo = input.nextDouble();
                
                programadores.setSalariofijo(SalarioFijo);
                programadores.calcularsalario();
                programadores.mostrardatos();
                
                break;
            }
            
            case 2->{
                
                System.out.println("Ingrese su codigo de empleado: ");
                
                Codigo_em= input.nextInt();
                
                input.nextLine();
                 
                System.out.println("Ingrese su nombre: ");
        
                Nombre= input.nextLine();
                
                Analistas analistas = new Analistas(Codigo_em,Nombre);
                
                System.out.println("Ingrese el sueldo que gana el analista "+Nombre+": ");
                
                double Salario_m1= input.nextDouble();
                
                analistas.setSalario_m(Salario_m1);
                analistas.calcularsalario();
                analistas.mostrardatos();
                
                break;
            } 
            
            case 3->{
                
                System.out.println("Ingrese su codigo de empleado: ");
                
                Codigo_em= input.nextInt();
                
                input.nextLine();
                 
                System.out.println("Ingrese su nombre: ");
        
                Nombre= input.nextLine();
                
                Desarrolladores desarrolladores = new Desarrolladores(Codigo_em,Nombre);
                
                System.out.println("Ingrese cuantas lineas de codigo implemento el desarrollador "+Nombre+": ");
                
                int lineasc1= input.nextInt();
                
                System.out.println("Ingrese el valor por cada linea de codigo: ");
                 
                double valorlc1= input.nextDouble();
                
                desarrolladores.setLineasc(lineasc1);
                desarrolladores.setValorlc(valorlc1);
                desarrolladores.calcularsalario();
                desarrolladores.mostrardatos();
            }
        }    
       }  
    }
}
