package ec.edu.ups.appdis.g1.ExamenSagbayJeffersonCliente.entity;

import java.io.Serializable;

public class Producto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nombre;
	private String descripcion;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	

}
