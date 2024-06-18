package spring_web011;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		// 자바 로직 ...
		ModelAndView mav = new ModelAndView();
		mav.setViewName("monday");
		mav.addObject("test", "오늘은 월요일");
		
		return mav;
	}

}
