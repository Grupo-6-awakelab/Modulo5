package cl.awakelab.models.dao;

import java.util.List;

import cl.awakelab.models.dto.Asistente;


public interface IAsistente {
	public void create(Asistente a);
	public List<Asistente> read();
	public Asistente read(int id);
	public void update(Asistente a);
	public void delete(int id);

}
