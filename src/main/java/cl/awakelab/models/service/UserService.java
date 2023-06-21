package cl.awakelab.models.service;
import cl.awakelab.models.dto.User;
import cl.awakelab.models.dto.UserProfile;

import java.util.ArrayList;
import java.util.List;


public class UserService {
	
	
	private final String username = "admin";
	private final String password = "admin";
	private List<User> userList = new ArrayList<User>();
	
	public UserService() {
		
		userList.add(new User(1,"Juan","Perez","admin@xxx.xx","admin","admin",UserProfile.ADMINISTRATIVO));
		userList.add(new User(2,"Pedro","Rodriguez","pedro@xxx.xx","pedro","pedro",UserProfile.CLIENTE));
		userList.add(new User(3,"Diego","Rojas","diego@xxx.xx","diego","diego",UserProfile.PROFESIONAL));
	}
	
	public List<User> listAll(){
		return userList;	
	}

	public User findOne(int id) {
				
		return userList.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
		
	}
	
public boolean login(String u, String p) {
		for (User user : userList) {
			
			if (user.getUSERNAME().equals(u) && user.getPASSWORD().equals(p)) {
				return true;
			}
			
		}	
		
		return false;
	}
	

}
