package spring_web011;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FridayController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("friday");
		mav.addObject("test", "오늘이 금요일이라면");
		
		return mav;
	}

}
