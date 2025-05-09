package com.iarcos.kosmos.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iarcos.kosmos.entity.Consultorio;
import com.iarcos.kosmos.entity.Doctor;

public interface ConsultorioRepo extends JpaRepository<Consultorio, UUID> {
	
	Optional<Doctor> findByNumConsul(Integer numConsul);

}
