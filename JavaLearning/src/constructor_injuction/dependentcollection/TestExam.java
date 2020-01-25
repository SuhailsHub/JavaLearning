package constructor_injuction.dependentcollection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestExam {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("constructor_injuction/dependentcollection/CollectionDepnd.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		ExamClass exm = (ExamClass)factory.getBean("exambean");
		exm.display();

	}

}
