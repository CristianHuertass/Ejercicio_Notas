/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutar_notas;

/**
 *
 * Cristian Huertas
 */
public class Operaciones_notas {
   
    double Notas2[]= new double [15];
    double Suma_T;
    double MayorNota;
    double Promedio;
    double porcentaje;
    int Posicion_Menor;
    int aprobados;
    
   public Operaciones_notas(){
    
}
    
    public void EstablecerNotas2(double Notas2[]){
        
        this.Notas2=Notas2;
    }
    
    public void comparar_notas(){
        
        double MenorNota= Notas2[0];
        
        for(int i=0; i<Notas2.length; i++){
            
            Suma_T +=Notas2[i];
            
            if(MayorNota<Notas2[i]){
                
                MayorNota=Notas2[i];
            }
            if(MenorNota>Notas2[i]){
                
                MenorNota=Notas2[i];
                Posicion_Menor=i;
            }
            
            if(Notas2[i]>3.0){
                
                aprobados++;
            } 
           
       }
        
        Promedio= Suma_T/Notas2.length;
        porcentaje= (double)aprobados/Notas2.length*100;
     
    }
    
}
