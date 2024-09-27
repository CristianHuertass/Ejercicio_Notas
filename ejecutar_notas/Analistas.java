/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutar_notas;

/**
 *
 * @author aseso
 */
public class Analistas extends Empleados{
    
    double Salario_m;
    double Descuento;
    
    public Analistas(int Codigo_em, String Nombre) {
        
        super(Codigo_em, Nombre);    
    }

    public void setSalario_m(double Salario_m) {
        this.Salario_m = Salario_m;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }
    
    
    
    @Override
    public void calcularsalario(){
        
        Descuento=Salario_m*4/100;
        Salario_m= Salario_m-Descuento;
    }
    
    @Override
    public void mostrardatos(){
        
        System.out.println("\nEl salario del empleado con codigo "+Codigo_em+" y llamado "+Nombre+" es: "+Salario_m);
    }
        
}
