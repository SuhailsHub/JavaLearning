package constructor_injuction.map_dependentobj;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	
	private int id;
	private String question;
	private Map<User, Answer> map;
	
	public Question() {}
	public Question(int id, String question) {
		this.id = id;
		this.question = question;
	}
	public Question(int id, String question, Map<User, Answer> map) {
		this.id = id;
		this.question = question;
		this.map = map;
	}
	
	public void display() {
		System.out.println(id+")"+question);
		System.out.println("Answer: ");
		Set<Entry<User, Answer>> set = map.entrySet();
		Iterator<Entry<User, Answer>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<User, Answer> entry = itr.next();
			User user = entry.getKey();
			Answer ans = entry.getValue();
			System.out.println(ans);
			System.out.println("Author : "+user);
		}
	}
}
