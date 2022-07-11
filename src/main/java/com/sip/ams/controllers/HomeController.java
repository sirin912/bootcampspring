package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/info")
	public String info(Model model) {
		String formation="Fullstack";
		System.out.println("methode info");
		model.addAttribute("workshop",formation);
		return "home/info";
	}
	@RequestMapping("/affiche")

	public String affiche() {
		System.out.println("methode affiche");
		return "home/affiche";
	}

}
