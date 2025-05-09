package com.iarcos.kosmos.test.repo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iarcos.kosmos.KosmosApp;
import com.iarcos.kosmos.entity.Doctor;
import com.iarcos.kosmos.repository.DoctorRepo;

@SpringBootTest(classes = KosmosApp.class)
public class DocRepoTest {

	private final Logger LOGGER = LogManager.getLogger(DocRepoTest.class);
	
	@Autowired
	DoctorRepo docRepo;

	
	@Test
	void agregarDocTest() {
		
		LOGGER.info("agregarDocTest");
		
		try {
			final Doctor neoDr = new Doctor();
			neoDr.setNombre("Michaela");
			neoDr.setAppPat("Quinn");
			neoDr.setAppMat("Q");
			neoDr.setEspecialidad("G");
			
			//docRepo.save(neoDr);
			
		} catch (Exception expo) {
			expo.printStackTrace();
		}
	}

}
