package com.unicid.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class Dashboard4Controller {
	@GetMapping("/dashboard4")
	public String dashboard4()
	{
		return"/dashboard/dashboard4";
	}
}