/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramosfonbon.holamundo.model;

/**
 *
 * @author Exhib
 */
public class Mascota {
    private int id;
    private String nombre;
    private String fechaDeIngreso;
    private String razon;
    
    public Mascota(){
    }
    
    public Mascota(int id, String nombre, String fechaDeIngreso, String razon ){
        this.id = id;
        this.nombre = nombre;
        this.fechaDeIngreso = fechaDeIngreso;
        this.razon = razon;
    }
    
    public int getId(){
       return id; 
    }
    public void setId(int id){
        this.id=id;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getFechaDeIngreso(){
        return fechaDeIngreso;
    }
    public void setFechaDeIngreso(String fechaDeIngreso){
        this.fechaDeIngreso=fechaDeIngreso;
    }
    
    public String getRazon(){
        return razon;
    }
    public void setRazon(String razon){
        this.razon=razon;
    }
    
    
    
}
