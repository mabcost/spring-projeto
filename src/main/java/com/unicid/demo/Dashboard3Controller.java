package com.unicid.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class Dashboard3Controller {
	@GetMapping("/dashboard3")
	public String dashboard3()
	{
		return"/dashboard/dashboard3";
	}
}