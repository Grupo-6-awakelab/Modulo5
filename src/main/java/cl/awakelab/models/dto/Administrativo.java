package cl.awakelab.models.dto;

public class Administrativo {
	
	
	private int id;
	private String run;
	private String nombre;
	private String apellido;
	private String correo;
	private String area;
	private int usuario_id;
	
public Administrativo() {
	
}

public Administrativo(int id, String run, String nombre, String apellido, String correo, String area, int usuario_id) {
	super();
	this.id = id;
	this.run = run;
	this.nombre = nombre;
	this.apellido = apellido;
	this.correo = correo;
	this.area = area;
	this.usuario_id = usuario_id;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getRun() {
	return run;
}

public void setRun(String run) {
	this.run = run;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

public String getArea() {
	return area;
}

public void setArea(String area) {
	this.area = area;
}

public int getUsuario_id() {
	return usuario_id;
}

public void setUsuario_id(int usuario_id) {
	this.usuario_id = usuario_id;
}

@Override
public String toString() {
	return "Administrativo [id=" + id + ", run=" + run + ", nombre=" + nombre + ", apellido=" + apellido + ", correo="
			+ correo + ", area=" + area + ", usuario_id=" + usuario_id + "]";
}



}
