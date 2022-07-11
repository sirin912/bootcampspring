package com.sip.ams.controllers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/info")
	public String info(Model model) {
		String formation="Fullstack";
		ArrayList<String> lang=new ArrayList<>();
		lang.add("OCA");
		lang.add("OCP");
		lang.add("spring");
		lang.add("angular");
		System.out.println("methode info");
		model.addAttribute("workshop",formation);
		model.addAttribute("listlang",lang);
		return "home/info";
	}
	@RequestMapping("/affiche")

	public String affiche() {
		System.out.println("methode affiche");
		return "home/affiche";
	}

}
