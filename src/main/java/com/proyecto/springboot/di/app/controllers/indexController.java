package com.proyecto.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyecto.springboot.di.app.models.service.service;

/*
 * DAO : data access object. accede a datos realizando consultas.
 * controlador interactua con los dao (service)
 * dependencia, no crea instancia, se crea por si sola (aparte)
 */

@Controller
public class indexController {
	
	// crea la inyeccion
	@Autowired
	private service servicio;
	
	@GetMapping({"","/","/index"})
	public String index(Model modelo) {
		modelo.addAttribute("dataServicio", servicio.operacion());
		return "index";
	}
	
}
