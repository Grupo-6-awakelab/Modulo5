

	package cl.awakelab.models.service;

	import java.util.List;

	import cl.awakelab.models.dao.UsuarioDAO;
	import cl.awakelab.models.dto.Usuario;

	public class UsuarioService {

	    private UsuarioDAO usuarioDAO = new UsuarioDAO();

	    public List<Usuario> findAll() {
	        return usuarioDAO.read();
	    }

	    public Usuario findOne(int id) {
	        return usuarioDAO.read(id);
	    }

	    public void update(Usuario usuario) {
	        usuarioDAO.update(usuario);
	    }

	    public void create(Usuario usuario) {
	        usuarioDAO.create(usuario);
	    }

	    public void delete(int id) {
	        usuarioDAO.delete(id);
	    }
	    public boolean login(String username, String password) {
	        Usuario user = usuarioDAO.buscarUsuario(username); // Consultar el usuario por su nombre de usuario en la base de datos
	        if (user != null && user.getPassword().equals(password)) { // Verificar si el usuario existe y la contraseña es correcta
	            return true;
	        }
	        return false;
	    }
	    
	    public String getRol(String username) {
	        return usuarioDAO.getRol(username);
	    }
	    public String getName(String username) {
	        return usuarioDAO.getName(username);
	    }
	}
