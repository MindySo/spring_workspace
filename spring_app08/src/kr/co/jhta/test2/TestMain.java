package kr.co.jhta.test2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		
		// 싱글톤 객체를 로딩할 때 getBean()가 호출될 때까지 bean의 생성을 미룬다.
		ApplicationContext factory = new ClassPathXmlApplicationContext("app02.xml");
		// 좀 더 사용하기 쉽게 만들어진 모듈
		// 좀 더 영리하게 동작 context가 시작하기 전에 모든 빈을 생성하고 로딩
		// 필요할 때 언제든지 가져다 쓸 수 있도록 정리
		
		
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app02.xml"));
		SystemMonitor sm = factory.getBean("sm", SystemMonitor.class);
		sm.print();
		
		
	}
}
