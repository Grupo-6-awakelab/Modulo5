package cl.awakelab.models.service;
import java.util.List;
import cl.awakelab.models.dto.Capacitacion;
import cl.awakelab.models.dao.CapacitacionDAO;

public class CapacitacionService {

private CapacitacionDAO capacitacionDAO = new CapacitacionDAO();
	
	
	public List<Capacitacion> findAll(){
		return capacitacionDAO.read();		
	}
	
	public Capacitacion findOne(int id) {
		return capacitacionDAO.read(id);
	}
	
	public void update(Capacitacion a) {
		capacitacionDAO.update(a);
	}
	
	public void create(Capacitacion a) {
		capacitacionDAO.create(a);
	}
	
	public void delete(int id) {
		capacitacionDAO.delete(id);
	}
}
