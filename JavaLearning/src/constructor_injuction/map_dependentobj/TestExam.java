package constructor_injuction.map_dependentobj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestExam {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor_injuction/map_dependentobj/config.xml");
		Question question = (Question)context.getBean("testbean");
		
		question.display();

	}

}
