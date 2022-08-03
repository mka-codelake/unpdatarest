package de.codelake.unpdatarest.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.codelake.unpdatarest.domain.model.Unit;

public interface UnitRepository extends JpaRepository<Unit, Long> {

}
