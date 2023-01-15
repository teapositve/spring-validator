package com.validate.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.validate.entities.LoginData;

@Controller
public class FormController {

	@GetMapping("/form")
	public String openFrom(Model m) {

		System.out.println("Opening Form");
		m.addAttribute("loginData", new LoginData());

		return "form";
	}

	//Handler for process form
	@PostMapping("/process")
	public String processForm(@Valid @ModelAttribute("loginData") LoginData loginData,BindingResult result) {

		if(result.hasErrors()) {
			System.out.println(result);
			return "form";
		}

		System.out.println(loginData);

		//Data process
		return "success";
	}
}
