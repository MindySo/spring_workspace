package kr.co.jhta.test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain3 {
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("app03.xml");
		Printer p = factory.getBean("p", Printer.class);
		p.print();
		
	}
}
