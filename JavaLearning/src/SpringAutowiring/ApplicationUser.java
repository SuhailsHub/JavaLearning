package SpringAutowiring;

public class ApplicationUser {
	private int id;
	private String name;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String autoByName() {
		return "UserId: "+id+"\nUsername : "+name;
	}
}
