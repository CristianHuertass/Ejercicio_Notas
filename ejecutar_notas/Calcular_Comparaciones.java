/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutar_notas;

/**
 *
 * @author aseso
 */
public class Calcular_Comparaciones {
    
    int Estudiantes_arriba;
   int Estudiantes_abajo;
   int promedio;
   int suma;
   double notas2[];
   
   public void establecernotas2(double notas2[]){
       
       this.notas2= notas2;
   }
   
   public void Calcular_Compararciones(){
       
       for(int i=0; i<notas2.length; i++){
           
           suma+= notas2[i];
       }
       
       promedio=suma/notas2.length;
       
       for(int i=0; i<notas2.length; i++){
           
           if(notas2[i]<promedio){
               
               Estudiantes_abajo++;
           }else{
               
               Estudiantes_arriba++;
           }        
       }  
   }

    public int getEstudiantes_arriba() {
        return Estudiantes_arriba;
    }

    public int getEstudiantes_abajo() {
        return Estudiantes_abajo;
    }

    public int getPromedio() {
        return promedio;
    }
}
