package cl.awakelab.models.dto;

import java.sql.Date;
import java.sql.Time;

public class Visita {
	private int id;
	private int cliente_id;
	private Date fecha;
	private Time hora;
	private String lugar;
	private int realizado;
	private String detalle;
	private int profesional_id;

public Visita() {
	
}

public Visita(int id, int cliente_id, Date fecha, Time hora, String lugar, int realizado, String detalle,
		int profesional_id) {
	super();
	this.id = id;
	this.cliente_id = cliente_id;
	this.fecha = fecha;
	this.hora = hora;
	this.lugar = lugar;
	this.realizado = realizado;
	this.detalle = detalle;
	this.profesional_id = profesional_id;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getCliente_id() {
	return cliente_id;
}

public void setCliente_id(int cliente_id) {
	this.cliente_id = cliente_id;
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

public int getRealizado() {
	return realizado;
}

public void setRealizado(int realizado) {
	this.realizado = realizado;
}

public String getDetalle() {
	return detalle;
}

public void setDetalle(String detalle) {
	this.detalle = detalle;
}

public int getProfesional_id() {
	return profesional_id;
}

public void setProfesional_id(int profesional_id) {
	this.profesional_id = profesional_id;
}

@Override
public String toString() {
	return "Visita [id=" + id + ", cliente_id=" + cliente_id + ", fecha=" + fecha + ", hora=" + hora + ", lugar="
			+ lugar + ", realizado=" + realizado + ", detalle=" + detalle + ", profesional_id=" + profesional_id + "]";
}


}

