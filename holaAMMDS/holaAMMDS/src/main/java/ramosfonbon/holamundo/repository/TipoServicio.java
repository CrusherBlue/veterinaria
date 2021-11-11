/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramosfonbon.holamundo.repository;

import java.util.ArrayList;
import java.util.List;
import ramosfonbon.holamundo.model.Tipo;

/**
 *
 * @author Exhib
 */
public class TipoServicio {
     ArrayList<Tipo> listaTipo = new ArrayList<>();

    public Tipo getTipo(){
        return new Tipo(1,
                "pequeño");
    }

    public List<Tipo> listaTipo(){

        Tipo ta = new Tipo(2,"grande");
        Tipo tb = new Tipo(3,"pequeñp");

        listaTipo.add(ta);
        listaTipo.add(tb);
        listaTipo.add(getTipo());

        return listaTipo;

    }

    public Tipo getTipo(Tipo tipo){

        return listaTipo.get(tipo.getId());
    }
}
