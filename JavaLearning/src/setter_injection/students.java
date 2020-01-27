package setter_injection;

public class students {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("\n Name is: "+name);
	}
	
}
