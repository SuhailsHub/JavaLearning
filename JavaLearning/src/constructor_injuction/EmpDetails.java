package constructor_injuction;

public class EmpDetails {
	
	private int id;
	private String name;
	private EmpAddress address;
	
	public EmpDetails(int id, String name, EmpAddress address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	void show() {
		System.out.println("id= "+id+"\nname= "+name);
		System.out.println("Address= "+address.toString());
	}
}
