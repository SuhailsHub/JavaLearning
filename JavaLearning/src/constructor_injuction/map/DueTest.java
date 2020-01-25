package constructor_injuction.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DueTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor_injuction/map/test.xml");
		Question qus = (Question)context.getBean("exambean");
		qus.displayanswer();

	}

}
