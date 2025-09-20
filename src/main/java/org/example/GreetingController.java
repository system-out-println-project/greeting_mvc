package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
	@Autowired
	@Qualifier("org.example.model.Greeting.language")
	private Greeter greeter;
	
	@GetMapping("getgreeting")
	public String getGreeting(Model model) {
		model.addAttribute("es", greeter.getGreeting(1).getGreeting());
		model.addAttribute("fr", greeter.getGreeting(2).getGreeting());
		model.addAttribute("de", greeter.getGreeting(3).getGreeting());
		model.addAttribute("it", greeter.getGreeting(4).getGreeting());
		model.addAttribute("gr", greeter.getGreeting(5).getGreeting());
		return "hello";
	}
}
