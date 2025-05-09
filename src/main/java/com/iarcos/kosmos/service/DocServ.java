package com.iarcos.kosmos.service;

import java.util.List;
import java.util.Map;

import com.iarcos.kosmos.expo.CitasExpo;

public  interface DocServ {

	public List<Map<String, Object>>  getDoc() throws CitasExpo;

}
