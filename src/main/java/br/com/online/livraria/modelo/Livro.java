package br.com.online.livraria.modelo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString 
@AllArgsConstructor
@NoArgsConstructor
public class Livro{
	private String titulo;
	private LocalDate dataLancamento;
	private int quantidadePaginas;
	private String autor;
}
