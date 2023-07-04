package cl.awakelab.models.dto;

public class Asesoria {
	private int id; 
	private String nombre;  
	private String detalle; 
	private int profesionalId;
	private int clienteId;


public Asesoria() {
	
}



public Asesoria(int id, String nombre, String detalle, int profesionalId, int clienteId) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.detalle = detalle;
	this.profesionalId = profesionalId;
	this.clienteId = clienteId;
}



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


public String getDetalle() {
	return detalle;
}


public void setDetalle(String detalle) {
	this.detalle = detalle;
}


public int getProfesionalId() {
	return profesionalId;
}


public void setProfesionalId(int profesionalId) {
	this.profesionalId = profesionalId;
}


public int getClienteId() {
	return clienteId;
}


public void setClienteId(int clienteId) {
	this.clienteId = clienteId;
}




}