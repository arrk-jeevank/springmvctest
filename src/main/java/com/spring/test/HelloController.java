package com.spring.test;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
 
public class HelloController extends AbstractController{
 
	@Override
	@RequestMapping("/hello")
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
 
		System.out.println("hiii mahiii");
		
		ModelAndView model = new ModelAndView("hello");
		model.addObject("msg", "hello mahesh- welcome to spring mvc");
 
		return model;
	}
}
