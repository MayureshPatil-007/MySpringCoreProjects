package SpringCoreDependancyInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CarDrive

{
	public static void main(String[] args) 
	{
		ClassPathResource cpr=new ClassPathResource("MyCore.xml");
		BeanFactory bfact=new XmlBeanFactory(cpr);
		Car c=(Car) bfact.getBean("myCar");
		c.carDetails();
	}
	
}
