/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramosfonbon.holamundo.repository;

import java.util.ArrayList;
import java.util.List;
import ramosfonbon.holamundo.model.Inventario;

/**
 *
 * @author Exhib
 */
public class InventarioServicio {
     ArrayList<Inventario> listaInventario = new ArrayList<>();

    public Inventario getInventario(){
        return new Inventario(10,
                "paracetamol",
                "si",
                "12/12/2021");
    }

    public List<Inventario> listaInventario(){

        Inventario ia = new Inventario(11,"loratadina","no","12/12/2021");
        Inventario ib = new Inventario(12,"penicilina","si","12/12/2021");

        listaInventario.add(ia);
        listaInventario.add(ib);
        listaInventario.add(getInventario());

        return listaInventario;

    }

    public Inventario getInventario(Inventario inventario){

        return listaInventario.get(inventario.getIdCodigo());
    }
}
