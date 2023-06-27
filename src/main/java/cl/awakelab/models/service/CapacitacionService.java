package cl.awakelab.models.service;

import java.util.List;
import java.util.ArrayList;

import cl.awakelab.models.dto.Capacitacion;
import cl.awakelab.models.dto.User;
import cl.awakelab.models.dto.UserProfile;

public class CapacitacionService {

	private List<Capacitacion> list = new ArrayList<Capacitacion>();


	public CapacitacionService() {

		list.add(new Capacitacion (1,"Capacitacion1","detalle1"));
		list.add(new Capacitacion (2,"Capacitacion2","detalle2"));
		list.add(new Capacitacion (3,"Capacitacion3","detalle3"));

	}

	public List<Capacitacion> listAll() {
		return list;
	}

	public Capacitacion findOne(int id) {

		return list.stream().filter(s -> s.getId() == id).findFirst().orElse(null);

	}
}
