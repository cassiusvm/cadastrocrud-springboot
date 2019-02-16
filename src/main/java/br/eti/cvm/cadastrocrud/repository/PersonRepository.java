package br.eti.cvm.cadastrocrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.eti.cvm.cadastrocrud.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	Person findByEmail(String email);
}
