package br.eti.cvm.cadastrocrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.eti.cvm.cadastrocrud.model.Person;
import br.eti.cvm.cadastrocrud.repository.PersonRepository;

@Service
public class PersonService {
	private PersonRepository personRepository;

	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public void create(Person person) {
		personRepository.save(person);
	}

	public Person findByEmail(String email) {
		return personRepository.findByEmail(email);
	}

	public List<Person> findAll() {
		return personRepository.findAll();
	}
}
