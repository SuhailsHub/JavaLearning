package exspring;

public class Student {
	private String name;
	private int id;
	private char section;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	
	public void displayInfo() {
		System.out.println("Hey "+name+" Please check your id and section below\n"+id+" "+section);
	}
	
}
