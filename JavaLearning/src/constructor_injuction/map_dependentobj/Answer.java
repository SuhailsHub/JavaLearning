package constructor_injuction.map_dependentobj;

import java.util.Date;

public class Answer {
	private String answer;
	private Date date;
	
	public Answer(String answer , Date date) {
		this.answer=answer;
		this.date=date;
	}
	
	public String toString() {
		return answer+" Posted date : "+date;
	}

}
