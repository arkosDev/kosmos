package com.iarcos.kosmos.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.iarcos.kosmos.dto.CitaReq;
import com.iarcos.kosmos.service.CitasServ;
import com.iarcos.kosmos.service.ConsultorioServ;
import com.iarcos.kosmos.service.DocServ;

import jakarta.validation.Valid;

@Controller
public class CitasController {

	private final Logger LOGGER = LogManager.getLogger(CitasController.class);

	@Autowired
	CitasServ citasServ;

	@Autowired
	DocServ docServ;
	
	@Autowired
	ConsultorioServ consulServ;

	/**
	 * inicio
	 * 
	 * @return home page
	 */
	@GetMapping("/")
	public String getHomePage() {
		citasServ.getCitasHoy();
		return "home_page";
	}

	//
	@GetMapping("/formCita")
	public String viewForm(Model model) {
		CitaReq citareq = new CitaReq();
		model.addAttribute("citareq", citareq);

		model.addAttribute("doctores", docServ.getDoc());
		
		return "newcita";
	}

	@PostMapping("/agregarCita")
	public String register(@Valid @ModelAttribute("cita") CitaReq product, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			model.addAttribute("doctores", docServ.getDoc());
			return "admin/product";
		}
		return "savedcita";
	}

}
