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

    public Analistas(int Codigo_em, String Nombre, double Salario_m, double Descuento) {
        super(Codigo_em, Nombre);
        
        this.Salario_m = Salario_m;
        this.Descuento = Descuento;
    }
    
    @Override
    public void calcularsalario(){
        
        Descuento=Salario_m*4/100;
        Salario_m= Salario_m-Descuento;
    }

    public double getSalario_m() {
        return Salario_m;
    }
    
    @Override
    public void mostrardatos(){
        
        
    }
        
}
