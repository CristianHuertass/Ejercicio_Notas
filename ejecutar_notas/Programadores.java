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

    public Programadores(int Codigo_em, String Nombre) {
        
        super(Codigo_em,Nombre);
     
    }

    public void setSalariofijo(double Salariofijo) {
        this.Salariofijo = Salariofijo;
    }
    
    
    
    @Override
    public void calcularsalario(){
        
        Salariofijo=Salariofijo;
    }
    
    @Override
    public void mostrardatos(){
        
        System.out.println("\nEl salario del empleado con codigo "+Codigo_em+" y llamado "+Nombre+" es: "+Salariofijo);
    }
}
