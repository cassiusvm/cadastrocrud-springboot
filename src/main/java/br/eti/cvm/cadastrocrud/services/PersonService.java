package br.eti.cvm.cadastrocrud.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.eti.cvm.cadastrocrud.model.Person;
import br.eti.cvm.cadastrocrud.repositories.PersonRepository;

@Service
public class PersonService {
	private PersonRepository personRepository;

	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public Person findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	public void create(Person person) {
		// TODO Auto-generated method stub

	}
	
	public List<Person> findAll() {
		return personRepository.findAll();
	}

}
