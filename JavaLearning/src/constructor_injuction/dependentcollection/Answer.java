package constructor_injuction.dependentcollection;

public class Answer {
	private int id;
	private String ans;
	private String by;
	
	public Answer() {}
	public Answer(int id, String ans, String by) {
		this.id=id;
		this.ans=ans;
		this.by=by;
	}
	
	public String toString() {
		return id+") "+ans+"\nAuthor: "+by;
	}
}
