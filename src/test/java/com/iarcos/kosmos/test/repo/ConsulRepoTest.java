package com.iarcos.kosmos.test.repo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iarcos.kosmos.KosmosApp;
import com.iarcos.kosmos.entity.Consultorio;
import com.iarcos.kosmos.repository.ConsultorioRepo;

@SpringBootTest(classes = KosmosApp.class)
public class ConsulRepoTest {

	private final Logger LOGGER = LogManager.getLogger(ConsulRepoTest.class);
	
	@Autowired
	ConsultorioRepo consulRepo;

	
	@Test
	void agregarConsulTest() {
		
		LOGGER.info("agregarDocTest");
		
		try {
			final Consultorio consul = new Consultorio();
			consul.setNumConsul(1);
			consul.setPiso(1);
			
			//consulRepo.save(consul);
			LOGGER.info(consulRepo.findAll());
			
		} catch (Exception expo) {
			expo.printStackTrace();
		}
	}

}
