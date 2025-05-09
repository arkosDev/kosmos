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
@Table(name = "consultorios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Consultorio implements Serializable  {
	
	private static final long serialVersionUID = -1311525456136237794L;

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "idConsul", updatable = false, nullable = false, columnDefinition = "VARCHAR(36)")
	@JdbcTypeCode(SqlTypes.UUID)
	private UUID idConsul;

	@Column(name = "numConsul")
	private Integer numConsul;
	
	@Column(name = "piso")
	private Integer piso;
	
}
