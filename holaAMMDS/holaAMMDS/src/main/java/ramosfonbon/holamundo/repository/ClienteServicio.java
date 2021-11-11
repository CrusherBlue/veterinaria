/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramosfonbon.holamundo.repository;

import java.util.ArrayList;
import java.util.List;
import ramosfonbon.holamundo.model.Cliente;

/**
 *
 * @author Exhib
 */
public class ClienteServicio {
    
    ArrayList<Cliente> listaCliente = new ArrayList<>();

    public Cliente getCliente(){
        return new Cliente(1,
                "pepe",
                "av.mexicali m:232 l89",
                "961121212");
    }

    public List<Cliente> listaCliente(){

        Cliente ca = new Cliente(4,"pepe2","av.mexicali m:232 l89","961121212");
        Cliente cb = new Cliente(5,"pepe3","av.mexicali m:232 l89","961121212");

        listaCliente.add(ca);
        listaCliente.add(cb);
        listaCliente.add(getCliente());

        return listaCliente;

    }

    public Cliente getCliente(Cliente cliente){

     return listaCliente.get(cliente.getId());

    }
    
}
