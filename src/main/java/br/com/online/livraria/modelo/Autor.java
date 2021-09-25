package br.com.online.livraria.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString 
@AllArgsConstructor
@NoArgsConstructor
public class Autor {
	private String nome;
	private String email;
	private LocalDate dataNascimento;
	private String miniCurriculo;
	
}
