/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutar_notas;

/**
 *
 * @author aseso
 */
public abstract class Empleados {
    
   protected int Codigo_em;
   protected String Nombre;

    public Empleados(int Codigo_em, String Nombre) {
        
        this.Codigo_em = Codigo_em;
        this.Nombre = Nombre;
    }

    public int getCodigo_em() {
        return Codigo_em;
    }

    public String getNombre() {
        return Nombre;
    }
    
    public abstract void calcularsalario();
       
    public void mostrardatos(){
        
    }
}
