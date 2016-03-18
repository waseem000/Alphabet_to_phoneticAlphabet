package com.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.app.Model.Convert;


@Controller
//@SessionAttributes("convert")
public class ConvertController {

	
	@RequestMapping(value="/convert", method= RequestMethod.GET)
	public String getSentence(@ModelAttribute Convert c)
	{

		///System.out.println("SENTENCE is " + c.getsentence());
		//c.setsentence("A");
		return "convert";
	}
	
	@RequestMapping(value="/convert", method= RequestMethod.POST)
	public String postConverted(@ModelAttribute Convert c)
	{
		System.out.println(c.getsentence());
		c.convertsentence();
		return "convert";
		//return "redirect:index.html";
		
		
	}
}
