package cl.awakelab.models.dao;

import java.util.List;

import cl.awakelab.models.dto.User;

	public interface IUser {
		public void create(User a);
		public List<User> read();
		public User read(int id);
		public void update(User a);
		public void delete(int id);

	}

