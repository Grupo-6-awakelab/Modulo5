package cl.awakelab.models.dao;

import java.util.List;

import cl.awakelab.models.dto.Chequeo;



public interface IChequeo {
	
	public void create(Chequeo a);
	public List<Chequeo> read();
	public Chequeo read(int id);
	public void update(Chequeo a);
	public void delete(int id);

}
