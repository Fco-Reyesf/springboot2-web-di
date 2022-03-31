package com.proyecto.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.springboot.di.app.models.entity.Factura;

@Controller
@RequestMapping("/factura")
public class FacturaController {

	@Autowired
	private Factura factura;
	
	@GetMapping("/mostrar")
	public String mostrar(Model modelo) {
		modelo.addAttribute("factura", factura);
		modelo.addAttribute("titulo", "Ejemplo de inyeccion de dependencias (Facturas)");
		return "Factura/mostrar";
	}
	
}
