package cl.awakelab.models.dao;

import java.util.List;

import cl.awakelab.models.dto.Administrativo;

public interface IAdministrativo {
	public void create(Administrativo a);
	public List<Administrativo> read();
	public Administrativo read(int id);
	public void update(Administrativo a);
	public void delete(int id);

}
