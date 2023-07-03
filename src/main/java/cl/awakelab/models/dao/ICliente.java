package cl.awakelab.models.dao;

import java.util.List;

import cl.awakelab.models.dto.Cliente;

public interface ICliente {
	public void create(Cliente a);
	public List<Cliente> read();
	public Cliente read(int id);
	public void update(Cliente a);
	public void delete(int id);

}
