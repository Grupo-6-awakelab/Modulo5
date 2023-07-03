package cl.awakelab.models.dao;

import java.util.List;

import cl.awakelab.models.dto.Profesional;

public interface IProfesional {
	public void create(Profesional a);
	public List<Profesional> read();
	public Profesional read(int id);
	public void update(Profesional a);
	public void delete(int id);

}
