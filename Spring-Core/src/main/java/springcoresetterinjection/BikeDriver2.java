package springcoresetterinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BikeDriver2 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr=new ClassPathResource("MyCore.xml");
		BeanFactory bfact=new XmlBeanFactory(cpr);
		Bike b=(Bike) bfact.getBean("myBike2");
		b.bikeDetails();
		
		
	}
}
