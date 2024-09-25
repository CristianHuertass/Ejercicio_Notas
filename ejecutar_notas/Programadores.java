/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutar_notas;

/**
 *
 * @author aseso
 */
public class Programadores extends Empleados {
    
    double Salariofijo;

    public Programadores(int Codigo_em, String Nombre, double Salariofijo) {
        
        super(Codigo_em,Nombre);
       
        this.Salariofijo = Salariofijo;
    }
    
    @Override
    public void calcularsalario(){
        
        Salariofijo=Salariofijo;
    }
    
    @Override
    public void mostrardatos(){
        
    }
}
