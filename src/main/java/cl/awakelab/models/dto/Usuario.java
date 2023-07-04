package cl.awakelab.models.dto;

public class Usuario {
    private int id;
    private String nombre;
    private String username;
    private String password;

    public Usuario() {
    }

    public Usuario(String nombre, String username, String password) {
        this.nombre = nombre;
        this.username = username;
        this.password = password;
    }
    

	public Usuario(int id, String nombre, String username, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
    
}