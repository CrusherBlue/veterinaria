/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramosfonbon.holamundo.model;

/**
 *
 * @author Exhib
 */
public class Inventario {
    
    
    private int idCodigo;
    private String nombre;
    private String sustanciaActiva;
    private String fechaCaducacion;
    
    public Inventario(){
    }
    
    public Inventario(int idCodigo, String nombre, String sustanciaActiva, String fechaCaducacion ){
        this.idCodigo = idCodigo;
        this.nombre = nombre;
        this.sustanciaActiva = sustanciaActiva;
        this.fechaCaducacion = fechaCaducacion;
    }
    
    public int getIdCodigo(){
       return idCodigo; 
    }
    public void setIdCodigo(int id){
        this.idCodigo=id;
    }
    
    public String getNombre(){
       return nombre; 
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getSustanciaActiva(){
       return sustanciaActiva; 
    }
    public void setSustanciaActiva(String sustanciaActiva){
        this.sustanciaActiva=sustanciaActiva;
    }
    
    public String getFechaCaducacion(){
       return fechaCaducacion; 
    }
    public void setFechaCaducacion(String fechaCaducacion){
        this.fechaCaducacion=fechaCaducacion;
    }
    
}
