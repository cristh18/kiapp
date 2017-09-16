package com.kangarooinsurance.kiapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/kiapp")
	public String home() {
		return "index";
	}
}
