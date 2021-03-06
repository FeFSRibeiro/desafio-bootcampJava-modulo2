package br.com.online.livraria.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.com.online.livraria.dto.AutorDto;
import br.com.online.livraria.dto.AutorFormDto;
import br.com.online.livraria.modelo.Autor;


@Service
public class AutorService {
	
	private List<Autor> autores = new ArrayList<>();
	private ModelMapper modelMapper = new ModelMapper();
	
	public List<AutorDto> listar() {
		return autores
				.stream()
				.map(t -> modelMapper.map(t, AutorDto.class))
				.collect(Collectors.toList());
	}
	
	public void cadastrar(AutorFormDto dto) {
		Autor autor = modelMapper.map(dto, Autor.class);
		autores.add(autor);
	}
	
	
	public boolean verificaAutor(String nomeAutor) {
		return autores
				.stream()
				.anyMatch(autor -> nomeAutor.equals(autor.getNome()));
	}
}
