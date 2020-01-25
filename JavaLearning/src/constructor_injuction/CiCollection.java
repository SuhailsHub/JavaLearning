package constructor_injuction;

import java.util.Iterator;
import java.util.List;

public class CiCollection {
	
	private int id;
	private String question;
	private List<String> answer;
	
	public CiCollection() {}
	public CiCollection( int id, String question, List<String> answer) {
		this.id=id;
		this.question=question;
		this.answer=answer;
	}
	
	public void display() {
		System.out.println("Id= "+id+"\nQuestion= "+question);
		System.out.println("Answers =");
		Iterator<String> itr = answer.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
