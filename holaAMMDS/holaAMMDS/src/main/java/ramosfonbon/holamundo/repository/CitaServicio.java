/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramosfonbon.holamundo.repository;

import java.util.ArrayList;
import java.util.List;
import ramosfonbon.holamundo.model.Cita;

/**
 *
 * @author Exhib
 */
public class CitaServicio {
    
     ArrayList<Cita> listaCita = new ArrayList<>();

    public Cita getCita(){
        return new Cita(1,
                "12/12/12",
                "12:23",
                "limpieza");
    }

    public List<Cita> listaCita(){

        Cita sa = new Cita(7,"12/1/12","10:30","limpieza");
        Cita sb = new Cita(8,"12/2/12","10:00","limpieza");

        listaCita.add(sa);
        listaCita.add(sb);
        listaCita.add(getCita());

        return listaCita;

    }

    public Cita getCita(Cita cita){

        return listaCita.get(cita.getId());
    }
    
}
