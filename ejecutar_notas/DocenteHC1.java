/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutar_notas;

/**
 *
 * @author aseso
 */
public class DocenteHC1 extends Docente1{
    
    int Horastrab;
    double valorHora;
    double sueldoMeshora;
    
    public DocenteHC1 (String NombreDoc, String FacultadDoc, String CadiDoc, int Horastrab, double valorHora, double sueldoMeshora ){
        
    super(NombreDoc,FacultadDoc,CadiDoc);
    
    this.Horastrab = Horastrab;
    this.valorHora = valorHora;
    this.sueldoMeshora = sueldoMeshora;
    }

    public void setHorastrab(int Horastrab) {
        this.Horastrab = Horastrab;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    
    public void calcularsueldoMeshora(){
        
        sueldoMeshora = Horastrab*valorHora;
    }

    public double getSueldoMeshora() {
        return sueldoMeshora;
    }
  
}
