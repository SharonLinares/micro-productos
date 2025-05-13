package com.example.demo.controller;

import java.util.List;

import com.example.demo.dto.ProductoDto;
import com.example.demo.service.ProductoService;

public class ProductoController {

	private ProductoService productoService = new ProductoService();

	public void agregarProducto(ProductoDto productoDto) {
		this.productoService.agregarProducto(productoDto);
	}

	public void imprimirProducto() {

		List<ProductoDto> productos = this.productoService.consultarProductos();
		
		for (int i = 0; i < productos.size(); i++) {			
			ProductoDto producto = productos.get(i);
			System.out.println(producto.getCodigo());
		}

	}

	public static void main(String[] args) {

		ProductoController productoController = new ProductoController();
		ProductoDto telefono = new ProductoDto();

		telefono.setCodigo(12);
		telefono.setNombre("iphone");
		telefono.setValor(344);
		telefono.setCantidad(3);
		

		productoController.agregarProducto(telefono);
		productoController.imprimirProducto();
	}

}
