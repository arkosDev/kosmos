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
@Table(name = "doctores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Doctor implements Serializable  {
	
	private static final long serialVersionUID = 3790819962788364480L;

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "idDoc", updatable = false, nullable = false, columnDefinition = "VARCHAR(36)")
	@JdbcTypeCode(SqlTypes.UUID)
	private UUID idDoc;

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "paterno")
	private String appPat;
	
	@Column(name = "materno")
	private String appMat;
		
	@Column(name = "especialidad")
	private String especialidad;
		
}
