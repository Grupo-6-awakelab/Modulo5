package cl.awakelab.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.awakelab.models.service.UserService;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   private UserService userService = new UserService();
    public login() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
	}
		
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	
		HttpSession session = request.getSession();
		
		
		if (userService.login(username, password)) {	
			session.setAttribute("isLogged", true);
			
			response.sendRedirect(request.getContextPath() + "/dashboard");
	
		} else {
			
			session.setAttribute("isLogged", false);
			getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
		}
		
	}
}


