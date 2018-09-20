package br.eti.cvm.cadastrocrud.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.eti.cvm.cadastrocrud.model.Person;
import br.eti.cvm.cadastrocrud.repositories.PersonRepository;

@Service
public class PersonService {
	private PersonRepository personRepository;

	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Transactional
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
