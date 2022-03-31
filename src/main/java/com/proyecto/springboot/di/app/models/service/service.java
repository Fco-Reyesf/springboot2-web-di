package com.proyecto.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

@Component
public class service implements IService {

	 /*
	  * todo componente debe tener su constructor vacio
	  * porque utiliza el constructor para crear el componente.
	  * inyeccion de dependencia, es entregar la referencia de un objeto a otro.
	  * no lo llama, si no que entrega los servicios.
	  */
	
	public service() {}
	
	@Override
	public String operacion() {
		return "ejecutando proceso.....";
	}
	
}
