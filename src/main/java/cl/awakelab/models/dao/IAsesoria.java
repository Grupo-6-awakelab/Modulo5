package cl.awakelab.models.dao;

import java.util.List;

import cl.awakelab.models.dto.Asesoria;

public interface IAsesoria {
	public void create(Asesoria a);
	public List<Asesoria> read();
	public Asesoria read(int id);
	public void update(Asesoria a);
	public void delete(int id);

}
