package com.app.Controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

		//System.out.println("SENTENCE is " + c.getsentence());
		//c.setsentence("A");
		return "convert";
	}
	
	@RequestMapping(value="/convert", method= RequestMethod.POST)
	public String postConverted(@ModelAttribute ("convert") Convert c )
	{
		String converted_Setntance;
		System.out.println(c.getsentence());
		c.convertsentence();
		
		converted_Setntance=c.getConverted_setntance();
	//	m.addAttribute("convsent",c);
		System.out.println("From controller JAVA Class : converted sentence is ===="+converted_Setntance+c);
	
		return "convert";
		//return "redirect:index.html";
		
		
	}
}
