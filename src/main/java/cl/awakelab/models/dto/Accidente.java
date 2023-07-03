package cl.awakelab.models.dto;

import java.sql.Date;

public class Accidente {
	
	private int id; 
	private int cliente_id; 
	private Date fecha_accidente; 
	private String detalle;
	
public Accidente() {
	
}

public Accidente(int id, int cliente_id, Date fecha_accidente, String detalle) {
	super();
	this.id = id;
	this.cliente_id = cliente_id;
	this.fecha_accidente = fecha_accidente;
	this.detalle = detalle;
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

public Date getFecha_accidente() {
	return fecha_accidente;
}

public void setFecha_accidente(Date fecha_accidente) {
	this.fecha_accidente = fecha_accidente;
}

public String getDetalle() {
	return detalle;
}

public void setDetalle(String detalle) {
	this.detalle = detalle;
}

@Override
public String toString() {
	return "Accidente [id=" + id + ", cliente_id=" + cliente_id + ", fecha_accidente=" + fecha_accidente + ", detalle="
			+ detalle + "]";
}
	

	
	
	
	

}
