package cl.awakelab.models.dto;

import java.sql.Date;
import java.sql.Time;

public class Visita {
    private int id;
    private int clienteId;
    private Date fecha;
    private Time hora;
    private String lugar;
    private boolean realizado;
    private String detalle;
    private int profesionalId;

    public Visita() {
    }

    public Visita(int id, int clienteId, Date fecha, Time hora, String lugar, boolean realizado, String detalle,
            int profesionalId) {
        this.id = id;
        this.clienteId = clienteId;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.realizado = realizado;
        this.detalle = detalle;
        this.profesionalId = profesionalId;
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

	public boolean isRealizado() {
		return realizado;
	}

	public void setRealizado(boolean realizado) {
		this.realizado = realizado;
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



    
}