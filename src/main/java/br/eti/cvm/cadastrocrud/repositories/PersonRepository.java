package br.eti.cvm.cadastrocrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.eti.cvm.cadastrocrud.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	Person findByEmail(String email);
}
