package com.daw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/holamundo")
public class HolamundoController {
	
	@GetMapping
	public String saludar() {
		return "holager";
	}
	
	@GetMapping("/saludo")
	public String saludar2() {
		return "jijiji";
	}
	
	/*
	 * El RequestParam se utiliza cuadno tengamos cualquier metodo 
	 * en el que tengamos parametros el servidor
	 * 
	 * Ejemplo:
	 * 		localhost:8080/books/buscarPorTitulo?titulo=loqsea
	 */
	
	@GetMapping("/salud")
	public String saludar3(@RequestParam(required = false) String nombre) {
		return "hola " + nombre;
	}
	
	/*
	 * EL PathVariable se utiliza exclusivamente para ids 
	 */
	
	@GetMapping("/books/{id}")
	public String libros(@PathVariable long id) {
		return "aqui tienes el libro con id: " + id;
	}
}