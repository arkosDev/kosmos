package com.iarcos.kosmos.service.impl;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iarcos.kosmos.entity.Consultorio;
import com.iarcos.kosmos.entity.Doctor;
import com.iarcos.kosmos.expo.CitasExpo;
import com.iarcos.kosmos.repository.ConsultorioRepo;
import com.iarcos.kosmos.service.ConsultorioServ;

@Service
public class ConsultorioServImpl implements ConsultorioServ {

	@Autowired
	ConsultorioRepo consulRepo;
	
	@Override
	public List<Map<String, Object>> getConsul() throws CitasExpo {
	    try {
	        final List<Consultorio> consulz= consulRepo.findAll();

	        return consulz.stream().map(doctor -> {
	            Map<String, Object> map = new java.util.HashMap<>();
	            for (Field field : Doctor.class.getDeclaredFields()) {
	                field.setAccessible(true); // Permite acceso a campos privados
	                try {
	                    map.put(field.getName(), field.get(doctor));
	                } catch (IllegalAccessException e) {
	                    throw new RuntimeException("Error al acceder al campo: " + field.getName(), e);
	                }
	            }
	            return map;
	        }).collect(Collectors.toList());
	    } catch (Exception expo) {
	        throw new CitasExpo(expo.getMessage());
	    }
	}

}
