package com.itmpp.pp2.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import com.itmpp.pp2.crud.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm User Controller!");
		model.addAttribute("messages", messages);
		return "index";
	}
	
}