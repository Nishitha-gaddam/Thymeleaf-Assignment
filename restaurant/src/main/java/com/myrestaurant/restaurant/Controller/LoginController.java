package com.myrestaurant.restaurant.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {

		return "fancy-login";

	}

	@GetMapping("/")
	public String welcomePage() {
		return "welcome";
	}

	@GetMapping("/thank-you")
	public String thankYouPage() {
		return "thank-you";

	}

	@GetMapping("/access-denied")
	public String showAccessDenied() {
		
		return "access-denied";
		
	}
}
