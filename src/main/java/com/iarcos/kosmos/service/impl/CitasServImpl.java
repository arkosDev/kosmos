package com.iarcos.kosmos.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iarcos.kosmos.dto.CitaReq;
import com.iarcos.kosmos.entity.Cita;
import com.iarcos.kosmos.expo.CitasExpo;
import com.iarcos.kosmos.repository.CitaRepo;
import com.iarcos.kosmos.service.CitasServ;

@Service
public class CitasServImpl implements CitasServ {

	@Autowired
	CitaRepo citaRepo;

	@Override
	public String getCitasHoy() throws CitasExpo {
		try {
			final List<Cita> citas = citaRepo.findHoy().orElse(Collections.emptyList());
			ObjectMapper objectMapper = new ObjectMapper();
			return objectMapper.writeValueAsString(citas);
		} catch (Exception expo) {
			throw new CitasExpo(expo.getMessage());
		}
	}
	
	@Override
	public Cita saveCita(final CitaReq citaReq) throws CitasExpo {
		try {
			final Cita neoCita = new Cita();
			neoCita.setHorario("");//yyMMdd HHH:mm
			neoCita.setIdConsul(UUID.fromString(citaReq.getIdConsul()));
			neoCita.setIdDoctor(UUID.fromString(citaReq.getIdDoctor()));
			neoCita.setNomPaciente(citaReq.getNomPaciente());
			
			citaRepo.save(neoCita);
			
			return neoCita;
		} catch (Exception expo) {
			throw new CitasExpo(expo.getMessage());
		}
	}

}
