package cl.awakelab.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import cl.awakelab.models.dto.*;
import cl.awakelab.models.dao.*;
/**
 * Servlet implementation class CrearUsuario
 */
@WebServlet("/crearusuario")
public class CrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		if (session.getAttribute("isLogged") == null) {
			response.sendRedirect(request.getContextPath() + "/login");
		} else {
			getServletContext().getRequestDispatcher("/views/crearusuario.jsp").forward(request, response);
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String tipoUsuario = request.getParameter("tipoUsuario");
		Usuario usuario = new Usuario(nombre, username, password);
		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.create(usuario);
		int usuarioId = usuario.getId();
		 System.out.println(usuarioId);
		 System.out.println(usuarioId);
		// Obtener los valores específicos según el tipo de usuario seleccionado
		if (tipoUsuario.equals("cliente")) {
			 String nombreCliente = request.getParameter("nombrecliente");
			String apellido = request.getParameter("apellido");
		    String rut = request.getParameter("rut");
		    String correo = request.getParameter("correo");
		    String telefono = request.getParameter("telefono");
		    String afp = request.getParameter("afp");
		    String sistemaSalud = request.getParameter("sistemaSalud");
		    String direccion = request.getParameter("direccion");
		    String comuna = request.getParameter("comuna");
		   
		    int edad = Integer.parseInt(request.getParameter("edad"));
		    // Guardar los datos en la base de datos usando la función create del DAO correspondiente
		    Cliente cliente = new Cliente(rut, nombreCliente, apellido, correo, telefono, afp, sistemaSalud, direccion, comuna, edad, usuarioId);
		  
		    ClienteDAO clienteDao = new ClienteDAO();
		    clienteDao.create(cliente);
		    getServletContext().getRequestDispatcher("/views/crearusuario.jsp").forward(request, response);
		    
		} else if (tipoUsuario.equals("profesional")) {
			 String nombreProfesional = request.getParameter("nombreprofesional");
			 String apellido = request.getParameter("apellido");
		    String run = request.getParameter("run");
		    String correo = request.getParameter("correo");
		    String telefono = request.getParameter("telefono");
		    String cargo = request.getParameter("cargo");
		    // Guardar los datos en la base de datos usando la función create del DAO correspondiente
		    Profesional profesional = new Profesional(run,nombreProfesional, apellido, correo, telefono, cargo, usuario.getId());
		    ProfesionalDAO profesionalDao = new ProfesionalDAO();
		    profesionalDao.create(profesional);
		    getServletContext().getRequestDispatcher("/views/crearusuario.jsp").forward(request, response);
		} else if (tipoUsuario.equals("administrativo")) {
			 String nombreAdmin = request.getParameter("nombreadmin");
			 String apellido = request.getParameter("apellido");

		    String run = request.getParameter("run");
		    String correo = request.getParameter("correo");
		    String telefono = request.getParameter("telefono");
		    String area = request.getParameter("area");
		    Administrativo administrativo = new Administrativo(run, nombreAdmin, apellido, correo, telefono, usuario.getId());
		    AdministrativoDAO administrativoDao = new AdministrativoDAO();
		    
		    administrativoDao.create(administrativo);
		    getServletContext().getRequestDispatcher("/views/crearusuario.jsp").forward(request, response);
		}
		
	}

}
