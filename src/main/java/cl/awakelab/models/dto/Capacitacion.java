package cl.awakelab.models.dto;

import java.sql.Date;
import java.sql.Time;

public class Capacitacion {

	   private int id;
	    private String nombre;
	    private String detalle;
	    private Date fecha;
	    private Time hora;
	    private String lugar;
	    private float duracion;
	    private int cantidad;
	    private int clienteId;
	

	public Capacitacion() {

	}


	public Capacitacion(int id, String nombre, String detalle, Date fecha, Time hora, String lugar, float duracion,
			int cantidad, int clienteId) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.detalle = detalle;
		this.fecha = fecha;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidad = cantidad;
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


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Time getHora() {
		return hora;
	}


	public void setHora(Time hora) {
		this.hora = hora;
	}


	public String getLugar() {
		return lugar;
	}


	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	public float getDuracion() {
		return duracion;
	}


	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public int getClienteId() {
		return clienteId;
	}


	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	
	
	
	
	
}
