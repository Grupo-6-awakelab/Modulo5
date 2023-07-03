package cl.awakelab.models.dto;

public class Chequeo {
	
	private int id;
	private int visita_id;
	private String detalle;
	private ChequeoEstado estado;
	
	public Chequeo() {
		
	}

	public Chequeo(int id, int visita_id, String detalle, ChequeoEstado estado) {
		super();
		this.id = id;
		this.visita_id = visita_id;
		this.detalle = detalle;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVisita_id() {
		return visita_id;
	}

	public void setVisita_id(int visita_id) {
		this.visita_id = visita_id;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public ChequeoEstado getEstado() {
		return estado;
	}

	public void setEstado(ChequeoEstado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Chequeo [id=" + id + ", visita_id=" + visita_id + ", detalle=" + detalle + ", estado=" + estado + "]";
	}
	
	

}
