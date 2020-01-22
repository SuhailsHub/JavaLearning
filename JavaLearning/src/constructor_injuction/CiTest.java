package constructor_injuction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiTest {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("springConfig.xml");
		Student student = (Student)context.getBean("CI");
		student.show();
	}

}
