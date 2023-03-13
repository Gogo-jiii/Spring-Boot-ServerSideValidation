package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.models.LoginData;

import jakarta.validation.Valid;

@Controller
public class TestController {

	@GetMapping("/form")
	public String validate(Model model) {
		model.addAttribute("loginData", new LoginData());
		return "form";
	}

	@PostMapping("/submit")
	public String submit(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult result) {

		if (result.hasErrors()) {
			System.out.println(result.getAllErrors().toString());
			return "form";
		} else {
			System.out.println("Login data: " + loginData.toString());
			return "success";
		}
	}
}
