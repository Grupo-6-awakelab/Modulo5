package cl.awakelab.models.service;
import java.util.List;

import cl.awakelab.models.dao.AccidenteDAO;
import cl.awakelab.models.dto.Accidente;

public class AccidenteService {
	
		private AccidenteDAO accidenteDAO = new AccidenteDAO();
		
		
		public List<Accidente> findAll(){
			return accidenteDAO.read();		
		}
		
		public Accidente findOne(int id) {
			return accidenteDAO.read(id);
		}
		
		public void update(Accidente a) {
			accidenteDAO.update(a);
		}
		
		public void create(Accidente a) {
			accidenteDAO.create(a);
		}
		
		public void delete(int id) {
			accidenteDAO.delete(id);
		}
	}


