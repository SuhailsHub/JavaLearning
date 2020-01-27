package setter_injection;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class tests {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("setter_injection/setter.xml");
		students stu = (students)context.getBean("setterbean");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the name: ");
		stu.setName(scn.next());
		System.out.println("\nName is: "+stu.getName());
	}

}
