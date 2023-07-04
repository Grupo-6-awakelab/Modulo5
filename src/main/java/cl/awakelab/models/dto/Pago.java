package cl.awakelab.models.dto;

import java.math.BigDecimal;
import java.sql.Date;

public class Pago {
	private int id;
	private int clienteId;
	private BigDecimal monto;
	private Date fechaPago;

	public Pago() {
	}

	public Pago(int id, int clienteId, BigDecimal monto, Date fechaPago) {
		this.id = id;
		this.clienteId = clienteId;
		this.monto = monto;
		this.fechaPago = fechaPago;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	
}