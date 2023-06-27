package cl.awakelab.models.dto;

public class Capacitacion {

	private int id;
	private String name;
	private String detalle;

	public Capacitacion() {

	}

	public Capacitacion(int id, String name, String detalle) {
		super();
		this.id = id;
		this.name = name;
		this.detalle = detalle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", name=" + name + ", detalle=" + detalle + "]";
	}
	
	
	
	
}
