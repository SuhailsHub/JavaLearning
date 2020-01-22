package constructor_injuction;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CiDependentObject {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("springConfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		EmpDetails details = (EmpDetails)factory.getBean("ciDependentObj");
		
		details.show();
	}

}
