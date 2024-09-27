/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutar_notas;

/**
 *
 * @author aseso
 */
public class Desarrolladores extends Empleados{
    
    double salario;
    double salariototal;
    double valorlc;
    int lineasc;
    double bonificacion;

    public Desarrolladores(int Codigo_em, String Nombre) {
        
        super(Codigo_em, Nombre);
    }

    public void setValorlc(double valorlc) {
        this.valorlc = valorlc;
    }

    public void setLineasc(int lineasc) {
        this.lineasc = lineasc;
    }
    
    @Override
    public void calcularsalario(){
        
        salario=valorlc*lineasc;
        bonificacion= salario*5/100;
        salariototal=salario+bonificacion;
        
    }

    @Override
    public void mostrardatos(){
        
        System.out.println("\nEl salario del empleado con codigo "+Codigo_em+" y llamado "+Nombre+" es: "+salariototal);
    }
}
