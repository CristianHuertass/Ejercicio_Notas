/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutar_notas;

import java.util.Scanner;

/**
 *
 * @author Cristian Huertas
 */
public class EjecutarDocente {
    
    public static void main(String[] args) {
        
       String NombreDoc;
       String FacultadDoc;
       String CadiDoc;
       int Horastrab1;
       double valorHora1;
       double sueldoMeshora = 0;
       double sueldoMensual = 0;
       double ValorHoraAsesor = 0;
       double sueldoBasico = 0;
       
   
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de acuerdo al tipo de docente al que hace parte\n 1 si es docente hora catedra\n 2 si es docente tiempo completo");
        
        int opcion = leer.nextInt();
        
        switch (opcion){
            
            case 1 -> {
                System.out.println("ingrese el nombre del docente: ");
                
                NombreDoc = leer.nextLine();
                
                System.out.println("\nIngrese la Facultad del docente:  ");
                
                FacultadDoc = leer.nextLine();
                
                System.out.println("Ingrese el Cadi del Docente: ");
                
                CadiDoc = leer.nextLine();
                
                System.out.println("Ingrese la cantidad de horas trabajadas en el mes: ");
                
                Horastrab1 = leer.nextInt();
                
                System.out.println("Ingrese el valor que gana por hora: ");
                
                valorHora1 = leer.nextInt();
                
               DocenteHC1 obj = new DocenteHC1( NombreDoc,FacultadDoc, CadiDoc, Horastrab1,valorHora1, sueldoMeshora);
                
               obj.setValorHora(valorHora1);
               obj.setHorastrab(Horastrab1);
               obj.calcularsueldoMeshora();
            }               
                
            case 2 -> {
                
                System.out.println("ingrese el nombre del docente: ");
                
                NombreDoc = leer.nextLine();
                
                System.out.println("Ingrese la Facultad del docente:  ");
                
                FacultadDoc = leer.nextLine();
                
                System.out.println("Ingrese el Cadi del Docente: ");
                
                CadiDoc = leer.nextLine();
                
                System.out.println("Ingrese cuanto es es su sueldo fijo al mes: ");
                
                int sueldoBasico1 = leer.nextInt();
                
                System.out.println("ingrese la cantida de horas de trabajo de asesoria: ");
                
                int canTrabGrado = leer.nextInt();
                
                DocenteTCO1 obj = new DocenteTCO1(NombreDoc, FacultadDoc, CadiDoc, sueldoMensual, canTrabGrado, ValorHoraAsesor, sueldoBasico);
                
                obj.setCanTrabGrado(canTrabGrado);
                obj.setSueldoBasico(sueldoBasico1);
                obj.calcularValorHoraAsesor();
                obj.CalcularsueldoMensual();
            }
        }
    }
}
