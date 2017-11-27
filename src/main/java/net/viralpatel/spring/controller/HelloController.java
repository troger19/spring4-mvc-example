package net.viralpatel.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello(Model model) {

		model.addAttribute("name", "John Doe");

		return "welcome";
	}

	@RequestMapping(value = "/hello1",method = RequestMethod.POST)
	public void jano(String fero){
		System.out.println("Ahoj " + fero);

	}

}
