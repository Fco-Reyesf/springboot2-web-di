package com.proyecto.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyecto.springboot.di.app.models.service.IService;

/*
 * DAO : data access object. accede a datos realizando consultas.
 * controlador interactua con los dao (service)
 * dependencia, no crea instancia, se crea por si sola (aparte)
 * @repository: DAOs
 * @service: logica de negocio y datos
 * beans es como un componente, @autowired obliga a tener un constructor vacio.
 */

@Controller
public class indexController {
	
	/*
	 * @autowired crea la inyeccion
	 * puede colocarse en la instancia del servicio o en los set o get
	 * pero solo puede ser en uno solo
	 * 
	 * con @qualifier("nombre-component") indica el servicio de preferencia
	 * que utiliza la interfaz
	 */
	
	@Autowired    // opcion 1
	private IService servicio;
	
	
	// cuando se inyecta por constructor se puede omitir la sentencia @autowired
	/*
	@Autowired
	public indexController(IService servicio) {
		this.servicio = servicio;
	}
	*/


	@GetMapping({"","/","/index"})
	public String index(Model modelo) {
		modelo.addAttribute("dataServicio", servicio.operacion());
		return "index";
	}

	/* opcion con los set y get
	@Autowired
	public void setServicio(IService servicio) {
		this.servicio = servicio;
	}
	*/
	
	
}
