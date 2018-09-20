package br.eti.cvm.cadastrocrud.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.eti.cvm.cadastrocrud.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	List<Person> findAll();
}
