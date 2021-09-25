package br.com.online.livraria.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.online.livraria.dto.LivroDto;
import br.com.online.livraria.dto.LivroFormDto;
import br.com.online.livraria.services.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {

	@Autowired
	private LivroService service;

	@GetMapping
	public List<LivroDto> listar() {
		return service.listar();
	}

	@PostMapping
	public ResponseEntity<String> cadastrar(@RequestBody @Valid LivroFormDto dto) {
		String resultado = service.cadastrar(dto);
		
		if (resultado == "OK") {
			return new ResponseEntity<>(HttpStatus.CREATED);
		}else {
			return ResponseEntity.badRequest().body(resultado);
		}
	}
}
