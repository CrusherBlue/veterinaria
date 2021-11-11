package ramosfonbon.holamundo.repository;

import ramosfonbon.holamundo.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoServicio {

    ArrayList<Producto> listaProductos = new ArrayList<>();

    public Producto getProducto(){
        return new Producto(5,
                "Frijol",
                30,
                "Abarrotes");
    }

    public List<Producto> listaProductos(){

        Producto pa = new Producto(5,"Frijol", 30,"Abarrotes");
        Producto pb = new Producto(10,"Arroz", 20,"Abarrotes");

        listaProductos.add(pa);
        listaProductos.add(pb);
        listaProductos.add(getProducto());

        return listaProductos;

    }

    public Producto getProducto(Producto producto){

        return listaProductos.get(producto.getCodigo());
    }
}
