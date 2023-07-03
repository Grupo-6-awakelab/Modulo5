package cl.awakelab.models.dao;

import java.util.List;

import cl.awakelab.models.dto.Accidente;


public interface IAccidente {
	public void create(Accidente a);
	public List<Accidente> read();
	public Accidente read(int id);
	public void update(Accidente a);
	public void delete(int id);

}
