package br.eti.cvm.cadastrocrud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping({"","/","/index.html","/index.htm"})
	public String index() {
		return "redirect:/retrieve";
	}
}
