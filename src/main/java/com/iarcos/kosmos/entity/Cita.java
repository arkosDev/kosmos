package com.iarcos.kosmos.entity;

import java.io.Serializable;
import java.util.UUID;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "citas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cita implements Serializable  {
	
	private static final long serialVersionUID = 3790819962788364480L;

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "idCita", updatable = false, nullable = false, columnDefinition = "VARCHAR(36)")
	@JdbcTypeCode(SqlTypes.UUID)
	private UUID idCita;
	
	@Column(name = "idDoctor", updatable = false, nullable = false, columnDefinition = "VARCHAR(36)")
	@JdbcTypeCode(SqlTypes.UUID)
	private UUID idDoctor;
	
	@Column(name = "idConsul", updatable = false, nullable = false, columnDefinition = "VARCHAR(36)")
	@JdbcTypeCode(SqlTypes.UUID)
	private UUID idConsul;
	
	@Column(name = "horario")
	private String horario;
	
	@Column(name = "nomPaciente")
	private String nomPaciente;
	
}
