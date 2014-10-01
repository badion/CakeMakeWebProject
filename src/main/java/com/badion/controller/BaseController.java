package com.badion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class BaseController {
	
	@RequestMapping(value="*", method = RequestMethod.GET) 
	public String index(ModelMap model) {
		return "index";
	}

	@RequestMapping(value="/testPage", method = RequestMethod.GET) 
	public String welcome(ModelMap model) {
		model.addAttribute("message",
				"Method welcome()");
		return "testPage";
	}

}
