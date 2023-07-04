package cl.awakelab.models.service;

import java.util.List;
import cl.awakelab.models.dao.VisitaDAO;
import cl.awakelab.models.dto.Visita;

public class VisitaService {
	
	private VisitaDAO visitaDAO = new VisitaDAO();
	
	public List<Visita> findAll() {
		return visitaDAO.read();
	}
	
	public Visita findOne(int id) {
		return visitaDAO.read(id);
	}
	
	public void update(Visita visita) {
		visitaDAO.update(visita);
	}
	
	public void create(Visita visita) {
		visitaDAO.create(visita);
	}
	
	public void delete(int id) {
		visitaDAO.delete(id);
	}
}
