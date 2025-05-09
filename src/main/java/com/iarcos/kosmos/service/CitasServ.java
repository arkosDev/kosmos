package com.iarcos.kosmos.service;

import com.iarcos.kosmos.dto.CitaReq;
import com.iarcos.kosmos.entity.Cita;
import com.iarcos.kosmos.expo.CitasExpo;

public  interface CitasServ {

	String getCitasHoy() throws CitasExpo;

	Cita saveCita(CitaReq citaReq) throws CitasExpo;

}
