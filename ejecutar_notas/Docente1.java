/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutar_notas;

/**
 *
 * @author aseso
 */
public class Docente1 {
    
   protected String NombreDoc;
   protected String FacultadDoc;
   protected String CadiDoc;
   
   public Docente1(String NombreDoc, String FacultadDoc, String CadiDoc){
       
       this.NombreDoc = NombreDoc;
       this.FacultadDoc = FacultadDoc;
       this.CadiDoc = CadiDoc;
   }

    public String getNombreDoc() {
        return NombreDoc;
    }

    public String getFacultadDoc() {
        return FacultadDoc;
    }

    public String getCadiDoc() {
        return CadiDoc;
    }
    
}
