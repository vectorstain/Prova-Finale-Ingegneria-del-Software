package com.vincenzomariacalandra.provaFinale.BachecaUniCollege.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author VectorCode
 *
 */
@Controller
public class LoginController {
	
	  // Initialization Login form
	  @RequestMapping("/login")
	  public String login() {
	    return "login";
	  }
	  
	  // Initialization Login form
	  @RequestMapping("/")
	  public String index() {
	    return "redirect:/login";
	  }
}
