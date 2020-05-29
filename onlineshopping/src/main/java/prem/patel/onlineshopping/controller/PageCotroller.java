package prem.patel.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PageCotroller {


	@RequestMapping(value= {"/","/index","/foru"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("msg","welcome to spring");
		return mv;
		
	}
	
	
	@RequestMapping(value = "aboutus")
	public String aboutus(Model model) {
		model.addAttribute("message", "pritesh");
		return "aboutus";
	}
    
	
	@RequestMapping(value = "foru")
	public String foru(Model model) {
		model.addAttribute("message", "love");
		return "foru";
	}
}
