package com.iarcos.kosmos.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CitaReq {
    
	@NotEmpty(message = "Nombre Doctor es obligatorio")
	private String idDoctor;
	
	@NotEmpty(message = "Consultorio es obligatorio")
	private String idConsul;
	
	@NotEmpty(message = "Día de la cita es obligatorio")
	private String dia;
	
	@NotEmpty(message = "Hora de la cita es obligatorio")
	private String hora;
	
	@NotEmpty(message = "Nombre Paciente es obligatorio")
	private String nomPaciente;
    
}
