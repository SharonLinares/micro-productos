package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.ProductoDto;

public class ProductoService {

	private List<ProductoDto> productosDto = new ArrayList<>();



	public void agregarProducto(ProductoDto productoDto) {
		this.productosDto.add(productoDto);
	}

	public List<ProductoDto> consultarProductos() {
		return this.productosDto;
	}

}
