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
	
	// componentes para inyectar en itemFactura.
	@Bean("itemsFactura")
	public List<ItemFactura> registarItems(){
		Producto producto1 = new Producto("producto1", 100);
		Producto producto2 = new Producto("producto2", 200);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		
		return Arrays.asList(linea1,linea2);
	}
	
	@Bean("itemsFacturaNuevo")
	public List<ItemFactura> registarItemsNuevo(){
		Producto producto1 = new Producto("productoNuevo1", 100);
		Producto producto2 = new Producto("productoNuevo2", 600);
		Producto producto3 = new Producto("productoNuevo3", 10);
		Producto producto4 = new Producto("productoNuevo4", 60);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 1);
		ItemFactura linea3 = new ItemFactura(producto3, 1);
		ItemFactura linea4 = new ItemFactura(producto4, 1);
		
		return Arrays.asList(linea1,linea2,linea3,linea4);
	}
}
