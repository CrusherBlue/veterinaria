/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramosfonbon.holamundo.model;

/**
 *
 * @author Exhib
 */
public class Cita {
    
    
    private int id;
    private String fecha;
    private String hora;
    private String tipoServicio;
    
    public Cita(){
    }
    
    public Cita(int id, String fecha, String hora, String tipoServicio ){
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.tipoServicio = tipoServicio;
    }
    
    public int getId(){
       return id; 
    }
    public void setId(int id){
        this.id=id;
    }
    
    public String getFecha(){
       return fecha; 
    }
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    
    public String getHora(){
       return hora; 
    }
    public void setHora(String hora){
        this.hora=hora;
    }
    
    public String getTipoServicio(){
       return tipoServicio; 
    }
    public void setTipoServicio(String tipoServicio){
        this.tipoServicio=tipoServicio;
    }
}
