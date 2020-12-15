package ec.edu.ups.appdis.g1.ExamenSagbayJeffersonCliente.views;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.appdis.g1.ExamenSagbayJeffersonCliente.entity.Producto;



public class ProductoON implements ProductoOnRemoto {


	
	private List<Producto> productos = new ArrayList<Producto>();

	public boolean registrar(Producto producto)  {
		return true;

	}
	public List<Producto> getProductos(){
		System.out.println(productos);
		return productos;
	}

	public boolean actualizar(Producto producto) {
		return true;

	}
	public boolean buscar(String nombre) {
		return true;

	}

}
