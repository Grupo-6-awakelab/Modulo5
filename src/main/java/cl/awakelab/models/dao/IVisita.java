package cl.awakelab.models.dao;

import java.util.List;

import cl.awakelab.models.dto.Visita;

public interface IVisita {
	public void create(Visita a);
	public List<Visita> read();
	public Visita read(int id);
	public void update(Visita a);
	public void delete(int id);

}
