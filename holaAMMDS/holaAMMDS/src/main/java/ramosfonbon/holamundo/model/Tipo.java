/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramosfonbon.holamundo.model;

/**
 *
 * @author Exhib
 */
public class Tipo {
    
    private int id;
    private String caracteristica;
    
    public Tipo(){
    }
    
    public Tipo(int id, String caracteristica ){
        this.id = id;
        this.caracteristica = caracteristica;
    }
    
    public int getId(){
       return id; 
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCaracteristica(){
       return caracteristica; 
    }
    public void setCaracteristica(String caracteristica){
        this.caracteristica=caracteristica;
    }
    
}
