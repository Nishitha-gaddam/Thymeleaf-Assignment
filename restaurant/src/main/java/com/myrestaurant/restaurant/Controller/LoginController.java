package com.myrestaurant.restaurant.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/api7")
public class LoginController {

	 @GetMapping("/showLoginPage")
	    public String showLoginPage() {
	        return "customer-login";
	    }
}
