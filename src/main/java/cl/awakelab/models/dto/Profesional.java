package cl.awakelab.models.dto;

public class Profesional {
    private int id;
    private String run;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String cargo;
    private int usuarioId;

    public Profesional() {
    }

    public Profesional(int id, String run, String nombre, String apellido, String correo, String telefono, String cargo,
			int usuarioId) {
		super();
		this.id = id;
		this.run = run;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono;
		this.cargo = cargo;
		this.usuarioId = usuarioId;
	}

	public Profesional(String run, String nombre, String apellido, String correo, String telefono, String cargo,
            int usuarioId) {
        
        this.run = run;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.cargo = cargo;
        this.usuarioId = usuarioId;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}
    
}