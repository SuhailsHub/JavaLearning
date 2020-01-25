package constructor_injuction.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String question;
	private Map<String, String> answer;
	
	public Question() {}
	public Question(int id, String question, Map<String, String> answer) {
		this.id=id;
		this.question=question;
		this.answer=answer;
	}
	
	public void displayanswer() {
		System.out.println(id+")"+question);
		Set<Entry<String, String>> set= answer.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<String, String> entry= itr.next();
			System.out.println("Answer: "+entry.getValue()+"\nPosted by: "+entry.getKey());
		}
	}

}
