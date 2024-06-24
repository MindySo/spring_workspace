package kr.co.jhta.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator cal;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("전체 테스트 시작 전에 1회만 실행");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("전체 테스트 종료 후에 1회만 실행");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("각 테스트 시작 전에 실행");
		cal = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("각 테스트 종료 후에 실행");
	}
	
	@DisplayName("합계 테스트")
	@Test
	void test_합계테스트() {
		// 단정문(assert문)
		
//		assertArrayEquals(a, b);	// 배열 a와 b가 같은 값인지
//		assertArrayEquals(a, b);	// 객체 a와 b가 같은 값인지
		
//		assertEquals(a, b, c);	// 객체 a와 b가 일치하는지 (a: 예상값, b: 결과값, c: 오차범위)
		
//		assertSame(a, b);	// 객체가 같은 객체인지
//		assertTrue(a); 		// 조건 a가 참인지
//		assertNotNull(a);	// 객체 a가 null이 아닌지
//		fail("message");	// 그냥 fail해라	
		
		
		
//		cal = null;			// 결과값 : error(틀린 결과값이 아니라 문법오류)
//		assertNotNull(cal);	// 결과값 : failure(cal = null이므로 틀렸음)
		
		
//		assertEquals(기대값, 실제값);
		System.out.println("sum test");
		assertEquals(300, cal.sum(100, 200));
	}
	
	@DisplayName("마이너스 테스트")
	@Test
	void test_minus() {
		System.out.println("minus test");
		assertEquals(100, cal.minus(200, 100));
	}
	
	// 테스트 코드의 가독성을 높여주는 라이브러리
	// AssertJ
	assertthat
	
	
	
	
	
	@DisplayName("곱셈 테스트")
	@Test
	void test_multi() {
		System.out.println("multi test");
		assertEquals(100, cal.multi(2, 50));
	}
	
}











