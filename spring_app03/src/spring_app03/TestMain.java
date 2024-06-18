package spring_app03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		Printer p = factory.getBean("printer", Printer.class);
		p.print("푸른하늘 은하수");
	}

}
