package com.proyecto.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proyecto.springboot.di.app.models.entity.ItemFactura;
import com.proyecto.springboot.di.app.models.entity.Producto;
import com.proyecto.springboot.di.app.models.service.IService;
import com.proyecto.springboot.di.app.models.service.service;

@Configuration
public class Config {

	@Bean("servicio")
	public IService registroService() {
		return new service();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registarItems(){
		Producto producto1 = new Producto("producto1", 100);
		Producto producto2 = new Producto("producto2", 200);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		
		return Arrays.asList(linea1,linea2);
	}
	
}
