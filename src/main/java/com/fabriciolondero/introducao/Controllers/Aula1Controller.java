package com.fabriciolondero.introducao.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Aula1Controller 
{
	@RequestMapping("/")
	public ModelAndView index()
	{
		return new ModelAndView("index");
	}
	
	@RequestMapping("/pagina2")
	public ModelAndView pagina2()
	{
		return new ModelAndView(); 
	}
	
	@RequestMapping("/pagina3")
	public String pagina3()
	{
		return "pagina3";
	}
}
