package de.codelake.unpdatarest.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.codelake.unpdatarest.domain.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
