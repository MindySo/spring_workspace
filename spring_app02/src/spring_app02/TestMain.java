package spring_app02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		
		// 객체의 생성
		// 의존 관계를 스프링에게 위임
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		Object obj = factory.getBean("coffee");
		Beverage b = (Beverage)obj;
		b.drink("홍길동");
	}
}
