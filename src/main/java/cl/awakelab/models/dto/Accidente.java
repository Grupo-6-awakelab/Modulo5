package cl.awakelab.models.dto;

import java.sql.Date;

public class Accidente {

	private int id;
	private int clienteId;
	private Date fechaAccidente;
	private String detalle;

	public Accidente() {

	}

	public Accidente(int id, int clienteId, Date fechaAccidente, String detalle) {
		super();
		this.id = id;
		this.clienteId = clienteId;
		this.fechaAccidente = fechaAccidente;
		this.detalle = detalle;
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

	public Date getFechaAccidente() {
		return fechaAccidente;
	}

	public void setFechaAccidente(Date fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

}
