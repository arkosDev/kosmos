package com.iarcos.kosmos.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iarcos.kosmos.entity.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, UUID> {
	
	Optional<Doctor> findByAppPat(String appPat);

}
