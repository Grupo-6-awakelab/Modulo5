package cl.awakelab.models.dto;

public class Chequeo {
    private int id;
    private int visitaId;
    private String detalle;
    private String estado;

    public Chequeo() {
    }

    public Chequeo(int id, int visitaId, String detalle, String estado) {
        this.id = id;
        this.visitaId = visitaId;
        this.detalle = detalle;
        this.estado = estado;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

	public int getVisitaId() {
		return visitaId;
	}

	public void setVisitaId(int visitaId) {
		this.visitaId = visitaId;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}



 }
