package kr.co.jhta.springbootex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 자동으로 빈을 등록
// 등록된 빈을 읽어
// kr.co.jhta.springbootex01Application 패키지 하위에 있는 컴포넌트를

@SpringBootApplication
public class Springbootex01Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootex01Application.class, args);
	}

}
