package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Form;

@Controller
public class FormController {

	
	
	@GetMapping("/hi")
	public String showForm(Model model) {
		model.addAttribute("form", new Form());
		
		return "form";
	}

	@PostMapping("/go")
	
		public String checkPersonInfo(@Valid Form form, BindingResult bindingResult) {
       
			if (bindingResult.hasErrors()) {
				return "form";
			}

			return "result";
	
	}
}

