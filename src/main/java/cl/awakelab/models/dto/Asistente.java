package cl.awakelab.models.dto;

public class Asistente {
	
	private int capacitacionId;
	private int usuarioId;
	
public Asistente() {
	
}

public Asistente(int capacitacionId, int usuarioId) {
	super();
	this.capacitacionId = capacitacionId;
	this.usuarioId = usuarioId;
}

public int getCapacitacionId() {
	return capacitacionId;
}

public void setCapacitacionId(int capacitacionId) {
	this.capacitacionId = capacitacionId;
}

public int getUsuarioId() {
	return usuarioId;
}

public void setUsuarioId(int usuarioId) {
	this.usuarioId = usuarioId;
}



}
