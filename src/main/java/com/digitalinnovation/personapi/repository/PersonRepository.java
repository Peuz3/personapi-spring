package com.digitalinnovation.personapi.repository;

import com.digitalinnovation.personapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
