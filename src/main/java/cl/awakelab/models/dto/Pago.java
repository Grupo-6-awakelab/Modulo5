package cl.awakelab.models.dto;

import java.sql.Date;

public class Pago {
	private int id;
	private int cliente_id;
	private double monto;
	private Date fecha_pago;

public Pago() {
	
}

public Pago(int id, int cliente_id, double monto, Date fecha_pago) {
	super();
	this.id = id;
	this.cliente_id = cliente_id;
	this.monto = monto;
	this.fecha_pago = fecha_pago;
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

public double getMonto() {
	return monto;
}

public void setMonto(double monto) {
	this.monto = monto;
}

public Date getFecha_pago() {
	return fecha_pago;
}

public void setFecha_pago(Date fecha_pago) {
	this.fecha_pago = fecha_pago;
}

@Override
public String toString() {
	return "Pago [id=" + id + ", cliente_id=" + cliente_id + ", monto=" + monto + ", fecha_pago=" + fecha_pago + "]";
}


	
	
}
