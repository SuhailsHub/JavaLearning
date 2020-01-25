package constructor_injuction.dependentcollection;

import java.util.Iterator;
import java.util.List;

public class ExamClass {
	private int id;
	private String question;
	private List<Answer> answer;
	
	public ExamClass() {}
	public ExamClass(int id, String question, List<Answer> answer) {
		this.id=id;
		this.question=question;
		this.answer=answer;
	}
	
	public void display() {
		System.out.println(id+") "+question);
		Iterator<Answer> itr = answer.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
