package com.unicid.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class Dashboard2Controller {
	@GetMapping("/dashboard2")
	public String dashboard2()
	{
		return"/dashboard/dashboard2";
	}
}