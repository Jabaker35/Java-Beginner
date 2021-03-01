package constructor_Lesson;

public class User {

	private Integer id;
	private String name;
	private String email;
	
	public User(Integer id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Integer setId() {
		return id;
	}
	
	public String setName() {
		return name;
	}
	
	public String setEmail() {
		return email;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
