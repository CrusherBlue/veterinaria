package ramosfonbon.holamundo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ramosfonbon.holamundo.model.Producto;
import ramosfonbon.holamundo.repository.ProductoServicio;

import java.util.List;
import ramosfonbon.holamundo.model.Cita;
import ramosfonbon.holamundo.model.Cliente;
import ramosfonbon.holamundo.model.Inventario;
import ramosfonbon.holamundo.model.Mascota;
import ramosfonbon.holamundo.model.Tipo;
import ramosfonbon.holamundo.repository.CitaServicio;
import ramosfonbon.holamundo.repository.ClienteServicio;
import ramosfonbon.holamundo.repository.InventarioServicio;
import ramosfonbon.holamundo.repository.MascotaServicio;
import ramosfonbon.holamundo.repository.TipoServicio;

@RestController
public class HolaController {

    ProductoServicio ps = new ProductoServicio();
    MascotaServicio ms = new MascotaServicio();
    ClienteServicio cs = new ClienteServicio();
    CitaServicio ss = new CitaServicio();
    TipoServicio ts = new TipoServicio();
    InventarioServicio ins = new InventarioServicio();

    @GetMapping(value = "/hola")
    public String sayHola(){
        return "Hola desde sptingboot modificado";
    }

    @GetMapping(value = "/producto")
    public Producto getProducto(){
        return ps.getProducto();
    }
     @GetMapping(value = "/mascota")
    public Mascota getMascota(){
        return ms.getMascota();
    }
    
    @GetMapping(value = "/cliente")
    public Cliente getCliente(){
        return cs.getCliente();
    }
    
    @GetMapping(value = "/cita")
    public Cita getCita(){
        return ss.getCita();
    }
    
    @GetMapping(value = "/tipo")
    public Tipo getTipo(){
        return ts.getTipo();
    }
    @GetMapping(value = "/inventario")
    public Inventario getInventario(){
        return ins.getInventario();
    }
    /*@PostMapping(value = "/producto"
                    )
    public Producto getProducto(
            @RequestBody Producto producto){
        return ps.getProducto(producto);
    }*/

    /*@GetMapping(value = "/listaProductos",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Producto> listaProductos(){
        return ps.listaProductos();
    }*/

    /*@GetMapping(value = "/listaProductosXML",
            produces = MediaType.TEXT_XML_VALUE)
    public List<Producto> listaProductoXML(){
        return ps.listaProductos();
    }*/
}

//    locahost:8080/hola
