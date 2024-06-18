package kr.co.jhta.web.control;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("hello");
//		mav.addObject("msg", "spring web mvc test!!!");
//		
//		return mav;
		
		return new ModelAndView("hello", "msg", "spring web mvc test!!!");
		
	}
	
}
