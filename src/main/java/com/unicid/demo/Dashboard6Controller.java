package com.unicid.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class Dashboard6Controller {
	@GetMapping("/dashboard6")
	public String dashboard6()
	{
		return"/dashboard/dashboard6";
	}
}