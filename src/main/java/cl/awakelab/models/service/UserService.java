package cl.awakelab.models.service;

import cl.awakelab.models.dto.User;
import cl.awakelab.models.dto.UserProfile;

import java.util.ArrayList;
import java.util.List;

public class UserService {

	private List<User> userList = new ArrayList<User>();

	public UserService() {

		userList.add(new User(1, "Juan", "Perez", "admin@xxx.xx", "admin", "1234", UserProfile.ADMINISTRATIVO));
		userList.add(new User(2, "Pedro", "Rodriguez", "pedro@xxx.xx", "pedro", "pedro", UserProfile.CLIENTE));
		userList.add(new User(3, "Diego", "Rojas", "diego@xxx.xx", "diego", "diego", UserProfile.PROFESIONAL));
	}

	public List<User> listAll() {
		return userList;
	}

	public User findOne(int id) {

		return userList.stream().filter(s -> s.getId() == id).findFirst().orElse(null);

	}

	public User login(String username, String password) {
	    for (User user : userList) {
	        if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
	            return user;
	        }
	    }
	    return null;
	}
	public UserProfile getRole(String username) {
	    for (User user : userList) {
	        if (user.getUsername().equals(username)) {
	            return user.getProfile();
	        }
	    }
	    return null; 
	}
	
	  public String getNombre(String username) {
		  for (User user : userList) {
		        if (user.getUsername().equals(username)) {
		            return user.getName();
		        }
		    }
		    return null; 
	    }
	
	
	



	
}
