package br.eti.cvm.cadastrocrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LanguageController {
	@GetMapping("/language")
	public String chooseLanguage() {
		return "language";
	}
}
