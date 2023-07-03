package cl.awakelab.models.dao;

import java.util.List;

import cl.awakelab.models.dto.Pago;

public interface IPago {
	public void create(Pago a);
	public List<Pago> read();
	public Pago read(int id);
	public void update(Pago a);
	public void delete(int id);

}
