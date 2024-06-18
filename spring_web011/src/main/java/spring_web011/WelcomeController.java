package spring_web011;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// controller 라고 하지만 사실은 로직을 처리
public class WelcomeController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 전달 데이터 : Model
		// 찾아갈 jsp의 이름 : view
		// 데이터 + 뷰의 이름 ==> ModelAndView
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("welcome");
		mav.addObject("msg", "안녕하세요");

		
		return null;
	}
	
	
}
