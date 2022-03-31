package com.proyecto.springboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proyecto.springboot.di.app.models.service.IService;
import com.proyecto.springboot.di.app.models.service.service;

@Configuration
public class Config {

	@Bean("servicio")
	public IService registroService() {
		return new service();
	}
	
}
