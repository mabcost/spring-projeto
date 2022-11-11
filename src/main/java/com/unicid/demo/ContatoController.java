package com.unicid.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contato")
public class ContatoController {
	@GetMapping("/contato")
	public String contato()
	{
		return"/contato/contato";
	}
}