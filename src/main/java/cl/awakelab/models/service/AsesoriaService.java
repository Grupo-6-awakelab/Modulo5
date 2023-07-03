package cl.awakelab.models.service;
import java.util.List;

import cl.awakelab.models.dao.AsesoriaDAO;
import cl.awakelab.models.dto.Asesoria;


public class AsesoriaService {

	private AsesoriaDAO asesoriaDAO = new AsesoriaDAO();
	
	
	public List<Asesoria> findAll(){
		return asesoriaDAO.read();		
	}
	
	public Asesoria findOne(int id) {
		return asesoriaDAO.read(id);
	}
	
	public void update(Asesoria a) {
		asesoriaDAO.update(a);
	}
	
	public void create(Asesoria a) {
		asesoriaDAO.create(a);
	}
	
	public void delete(int id) {
		asesoriaDAO.delete(id);
	}
}
