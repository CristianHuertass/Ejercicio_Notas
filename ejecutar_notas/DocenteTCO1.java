/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutar_notas;

/**
 *
 * @author aseso
 */
public class DocenteTCO1 extends Docente1{
    
    double sueldoMensual;
    int canTrabGrado;
    double ValorHoraAsesor;
    double sueldoBasico;
    
    public DocenteTCO1 (String NombreDoc, String FacultadDoc, String CadiDoc, double sueldoMensual, int canTrabGrado, double ValorHoraAsesor, double sueldoBasico){
        
        super(NombreDoc,FacultadDoc,CadiDoc);
        
        this.canTrabGrado = canTrabGrado;
        this.sueldoBasico = sueldoBasico;
    }

    public void setCanTrabGrado(int canTrabGrado) {
       this.canTrabGrado = canTrabGrado;
   }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
  
    public void calcularValorHoraAsesor(){
        ValorHoraAsesor = ((sueldoBasico/30)/8)*canTrabGrado ;
    }
    public void CalcularsueldoMensual(){
        sueldoMensual = sueldoBasico+ValorHoraAsesor; 
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }
}
