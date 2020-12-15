package ec.edu.ups.appdis.g1.ExamenSagbayJeffersonCliente.business;

import java.util.List;

import ec.edu.ups.appdis.g1.ExamenSagbayJeffersonCliente.entity.Producto;


public interface ProductoOnRemoto {
	public boolean registrar(Producto producto) ;
	public List<Producto> getProductos();
	public boolean actualizar(Producto producto);
	public boolean buscar(String nombre);

}
