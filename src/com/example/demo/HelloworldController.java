package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloworldController {

	@RequestMapping("/showpage")
	public String helloworld()
	{
		return "helloworld-page";
	}
	
	@RequestMapping("/processForm")
	public String datareturn()
	{
		return "helloworld";
	}
	
	@RequestMapping("/processformversion2")
	public String letsshoutout(HttpServletRequest request,Model model)
	{
		String name = request.getParameter("studentName");
		
		name = name.toUpperCase();
		
		String finalname = "welcome "+name;
		
		model.addAttribute("message", finalname);
		
		return "helloworld";
	}
	
	@RequestMapping("/processformversionthree")
	public String processformversionthree(@RequestParam("studentName") String thename,Model model)
	{
		
		thename = thename.toUpperCase();
		
		String finalname = "ProcessFormversionthree  "+thename;
		
		model.addAttribute("message", finalname);
		
		return "helloworld";
	}
}
