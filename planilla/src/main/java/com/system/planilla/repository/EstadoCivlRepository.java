package com.system.planilla.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.system.planilla.model.EstadoCivil;

@Repository
public interface EstadoCivlRepository extends JpaRepository<EstadoCivil, Integer> {

}
