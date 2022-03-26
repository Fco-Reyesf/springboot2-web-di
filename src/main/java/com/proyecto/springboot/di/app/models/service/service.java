package com.proyecto.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

@Component
public class service implements IService {

	 /*
	  * todo componente debe tener su constructor vacio
	  * porque utiliza el constructor para crear el componente.
	  */
	
	public service() {}
	
	@Override
	public String operacion() {
		return "ejecutando proceso.....";
	}
	
}
