package br.eti.cvm.cadastrocrud.controllers.crud;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.eti.cvm.cadastrocrud.services.PersonService;

@Controller
public class PersonController {
	private PersonService personService;

	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	@GetMapping("/retrieve")
	public String retrieve(Model model) {
		model.addAttribute("personList", personService.findAll());
		
		return "retrieve";
	}
}
