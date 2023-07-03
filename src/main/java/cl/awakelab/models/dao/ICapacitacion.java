package cl.awakelab.models.dao;

import java.util.List;

import cl.awakelab.models.dto.Capacitacion;

public interface ICapacitacion {
	public void create(Capacitacion a);
	public List<Capacitacion> read();
	public Capacitacion read(int id);
	public void update(Capacitacion a);
	public void delete(int id);

}
