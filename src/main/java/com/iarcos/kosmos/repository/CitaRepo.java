package com.iarcos.kosmos.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.iarcos.kosmos.entity.Cita;

public interface CitaRepo extends JpaRepository<Cita, UUID> {
	
	@Query(value = "SELECT * FROM citas WHERE horario >= CURDATE() AND horario > NOW()", nativeQuery =true)
	Optional<List<Cita>> findHoy();
}
