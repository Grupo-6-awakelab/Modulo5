package cl.awakelab.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import cl.awakelab.models.service.CapacitacionService;

/**
 * Servlet implementation class ListarCapacitacion
 */
@WebServlet("/administrarcapacitacion")
public class AdministrarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CapacitacionService capacitacionService = new CapacitacionService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdministrarCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();

		if (session.getAttribute("isLogged") == null) {
			response.sendRedirect(request.getContextPath() + "/login");
		} else {
			
			request.setAttribute("capacitaciones", capacitacionService.listAll());	
			getServletContext().getRequestDispatcher("/views/administrarCapacitacion.jsp").forward(request, response);
			
		}
	
	}
	 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
