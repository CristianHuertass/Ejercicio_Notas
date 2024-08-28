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
    
   //Se declaran las variables a utilizar
    
   int Estudiantes_arriba;
   int Estudiantes_abajo;
   int promedio;
   int suma;
   double notas2[];
   
   //Se le da el tamaño al array llamando el tamaño del array principal
   
   public void establecernotas2(double notas2[]){
       
       this.notas2= notas2;
   }
   //Se crea el constructor que realiza las operaciones
   
   public void Calcular_Compararciones(){
       
       for(int i=0; i<notas2.length; i++){
           
           suma+= notas2[i];//Se suman todas las notas
       }
       
       promedio=suma/notas2.length;//Se divide la suma de las notas por el total de notas ingresadas
       
       for(int i=0; i<notas2.length; i++){
           
           //Se comparan que notas estan por abajo y cuales estan por arriba del promedio
           
           if(notas2[i]<promedio){
               
               Estudiantes_abajo++;
           }else{
               
               Estudiantes_arriba++;
           }        
       }  
   }

    public int getEstudiantes_arriba() {//retornamos la variable Estudiantes_arriba
        return Estudiantes_arriba;
    }

    public int getEstudiantes_abajo() {//retornamos la variable Estudiantes_abajo
        return Estudiantes_abajo;
    }

    public int getPromedio() {//retornamos la variable promedio
        return promedio;
    }
}
