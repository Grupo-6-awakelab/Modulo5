package cl.awakelab.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import cl.awakelab.models.service.VisitaService;

/**
 * Servlet implementation class ListarCapacitacion
 */
@WebServlet("/administrarvisita")
public class AdministrarVisita extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private VisitaService visitaService = new VisitaService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdministrarVisita() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    HttpSession session = request.getSession();
	    String param = request.getParameter("id");
	    if (session.getAttribute("isLogged") == null) {
	        response.sendRedirect(request.getContextPath() + "/login");
	    } else if (param == null) {
	        request.setAttribute("visita", visitaService.findAll());
	        getServletContext().getRequestDispatcher("/views/administrarVisita.jsp").forward(request, response);
	    } else {
	        int id = Integer.parseInt(param);
	        param = request.getParameter("a");

	        if (param == null) {
	            param = "read";
	        }

	        String path = "/views/crearvisita.jsp";

	        switch (param) {
	            case "read":
	                request.setAttribute("action", "read");
	                break;
	            case "edit":
	                request.setAttribute("action", "edit");
	                break;
	            case "delete":
	            	 request.setAttribute("action", "delete");
	            	visitaService.delete(id);
	            	request.setAttribute("visita", visitaService.findAll());
	    	       
	                
	                break;
	            default:
	                break;
	        }

	        request.setAttribute("visita", visitaService.findOne(id));
	        getServletContext().getRequestDispatcher(path).forward(request, response);
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
