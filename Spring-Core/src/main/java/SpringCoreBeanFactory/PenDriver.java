package SpringCoreBeanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PenDriver 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr=new ClassPathResource("MyCore.xml");
		BeanFactory bfact=new XmlBeanFactory(cpr);
		Pen p=(Pen) bfact.getBean("myPen");
		p.write();
		
		Pen p1=(Pen) bfact.getBean("myPen");
		System.out.println(p);
		System.out.println(p1);
	}
}
