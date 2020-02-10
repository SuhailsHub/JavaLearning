package SpringAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringAutowiring/application.xml");
		Application app = (Application)context.getBean("App");
		app.ref();
		Performer perform = context.getBean("play", Performer.class);
		perform.play();
	}

}
