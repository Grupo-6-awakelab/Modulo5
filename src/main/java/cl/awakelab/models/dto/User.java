package cl.awakelab.models.dto;

public class User {
	private int id;
	private String name;
	private String lastName;
	private String email;
	private String USERNAME;
	private String PASSWORD;
	private UserProfile profile;
	
	public User() {
		super();
	}

	public User(int id, String name, String lastName, String email, String uSERNAME, String pASSWORD,
			UserProfile profile) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		USERNAME = uSERNAME;
		PASSWORD = pASSWORD;
		this.profile = profile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUSERNAME() {
		return USERNAME;
	}

	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public UserProfile getProfile() {
		return profile;
	}

	public void setProfile(UserProfile profile) {
		this.profile = profile;
	}
	
	
	
	
	
	
	

}
