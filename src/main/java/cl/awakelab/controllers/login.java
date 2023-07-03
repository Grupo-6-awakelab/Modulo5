package cl.awakelab.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.awakelab.models.dto.UserProfile;
import cl.awakelab.models.service.UserService;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService userService = new UserService();

	public login() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

        boolean parametroSesion = false;
        if (session.getAttribute("isLogged") != null) {
            parametroSesion = (boolean) session.getAttribute("isLogged");
            
        }

        if (parametroSesion) {
           
        	response.sendRedirect(request.getContextPath() + "/dashboard");
        } else {
        	getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String nombre = userService.getNombre(username);
		UserProfile rol = userService.getRole(username);
		HttpSession session = request.getSession();

		if ((userService.login(username, password) != null) && rol == UserProfile.ADMINISTRATIVO) {
			session.setAttribute("isLogged", true);
			session.setAttribute("rol", "admin");
			session.setAttribute("user", nombre);

			response.sendRedirect(request.getContextPath() + "/dashboard");

		} else if ((userService.login(username, password) != null) && rol == UserProfile.CLIENTE) {
			session.setAttribute("isLogged", true);
			session.setAttribute("rol", "cliente");
			session.setAttribute("user", nombre);

			response.sendRedirect(request.getContextPath() + "/dashboard");

		} else if ((userService.login(username, password) != null) && rol == UserProfile.PROFESIONAL) {
			session.setAttribute("isLogged", true);
			session.setAttribute("rol", "profesional");
			session.setAttribute("user", nombre);

			response.sendRedirect(request.getContextPath() + "/dashboard");

		} else {

			session.setAttribute("isLogged", false);
			getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
		}

	}
}
