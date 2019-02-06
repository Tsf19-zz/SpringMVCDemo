package com.tousif;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //1. Indicates that an annotated class is a "Controller" (e.g. a web controller).
public class AddController {
	
//	@RequestMapping("/add") //2.Annotation for mapping web requests onto specific handler classes and/or handler methods. 
//	public String adding() {
//		
//		System.out.println("I'm in Controller");
//		return "display.jsp";	//3. This will call display.jsp
//	}
	
	
//	4.Now actually Adding Two Numbers.
	@RequestMapping("/add")
	public ModelAndView adding( HttpServletRequest request, HttpServletResponse response ) {
		
		System.out.println("I'm in Controller");

		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		int k = i + j;
		
//		5.To pass the values, we need to use "ModelAndView Object"
		
		ModelAndView modelAndView = new ModelAndView();
		
//		6.When working with ModelAndView, we need to specify 2 things :
//			i)	Which View we want to call
//			ii)	What Data you we want to pass
		
		modelAndView.setViewName("display.jsp");
		modelAndView.addObject("result",k);
		
		
		return modelAndView;
	}

}
 
