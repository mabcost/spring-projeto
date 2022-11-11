package com.unicid.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class Dashboard5Controller {
	@GetMapping("/dashboard5")
	public String dashboard5()
	{
		return"/dashboard/dashboard5";
	}
}