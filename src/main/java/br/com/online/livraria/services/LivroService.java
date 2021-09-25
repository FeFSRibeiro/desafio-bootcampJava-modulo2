package br.com.online.livraria.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.online.livraria.dto.LivroDto;
import br.com.online.livraria.dto.LivroFormDto;
import br.com.online.livraria.modelo.Livro;


@Service
public class LivroService {
	
	private List<Livro> livros = new ArrayList<>();
	private ModelMapper modelMapper = new ModelMapper();
	
	@Autowired
	private AutorService autor;
	
	public List<LivroDto> listar() {
		
		return livros
				.stream()
				.map(t -> modelMapper.map(t, LivroDto.class))
				.collect(Collectors.toList());
	}
	
	public String cadastrar(LivroFormDto dto) {
		Livro livro = modelMapper.map(dto, Livro.class);
		if (autor.verificaAutor(dto.getAutor())) {
			livros.add(livro);
			return "OK";
		}else {
			//System.out.println("Autor inexistente!");
			return "Autor inexistente!";
		}
		
	}
}
