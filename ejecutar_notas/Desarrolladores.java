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

    public Desarrolladores(int Codigo_em, String Nombre, double salario, double valorlc, int lineasc, double bonificacion ) {
        super(Codigo_em, Nombre);
        
        this.salario = salario;
        this.valorlc = valorlc;
        this.lineasc = lineasc;
        this.bonificacion = bonificacion;
    }
    
    @Override
    public void calcularsalario(){
        
        salario=valorlc*lineasc;
        bonificacion= salario*5/100;
        salariototal=salario+bonificacion;
        
    }

    public double getSalariototal() {
        return salariototal;
    }
    
    @Override
    public void mostrardatos(){
        
    }
}
