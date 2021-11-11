/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramosfonbon.holamundo.repository;

import java.util.ArrayList;
import java.util.List;
import ramosfonbon.holamundo.model.Mascota;

/**
 *
 * @author Exhib
 */
public class MascotaServicio {
    
    ArrayList<Mascota> listaMascota = new ArrayList<>();

    public Mascota getMascota(){
        return new Mascota(1,
                "chester",
                "12/12/12",
                "limpieza");
    }

    public List<Mascota> listaMascota(){

        Mascota ma = new Mascota(2,"firulas","1/1/1","limpieza");
        Mascota mb = new Mascota(3,"oso","2/2/2","limpieza");

        listaMascota.add(ma);
        listaMascota.add(mb);
        listaMascota.add(getMascota());

        return listaMascota;

    }

    public Mascota getMascota(Mascota mascota){

        return listaMascota.get(mascota.getId());
    }
    
}
