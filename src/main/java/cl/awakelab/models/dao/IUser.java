package cl.awakelab.models.dao;

import java.util.List;

import cl.awakelab.models.dto.Usuario;

	public interface IUser {
		public void create(Usuario a);
		public List<Usuario> read();
		public Usuario read(int id);
		public void update(Usuario a);
		public void delete(int id);

	}

