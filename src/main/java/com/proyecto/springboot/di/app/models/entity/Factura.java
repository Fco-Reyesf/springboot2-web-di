package com.proyecto.springboot.di.app.models.entity;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Factura {

	@Value("${Factura.descripcion}")
	private String descripcion;
	
	@Autowired
	private Cliente cliente;
	
	@Autowired
	@Qualifier("itemsFacturaNuevo")   // indica que bean utiliza para inyectar los datos
	private List<ItemFactura> items;
	
	@PostConstruct			// despues de realizar la inyeccion de datos, hacer la siguiente accion
	public void postCliente() {
		cliente.setNombre("nombrePost");
		cliente.setApellido("apellidoPost");
		descripcion = descripcion.concat(" con el post");
	}
	
	@PreDestroy			// al momento de ser destruido el bean ejecuta la accion.
	public void preCliente() {
		System.out.println("factura destruida");
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItems() {
		return items;
	}
	
	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}
	
	
	
}
