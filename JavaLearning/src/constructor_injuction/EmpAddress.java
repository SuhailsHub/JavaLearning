package constructor_injuction;

public class EmpAddress {
	private String city, state, country;
	
	public EmpAddress(String city, String state, String country) {
		this.city=city;
		this.state=state;
		this.country=country;
	}
	
	public String toString() {
		return city+" "+state+" "+country;
	}
}
