package br.com.online.livraria.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AutorFormDto {
	
	@NotBlank
	@Size(min = 10)
	private String nome;
	@NotBlank
	private String email;
	@NotNull
	private LocalDate dataNascimento;
	@NotBlank
	private String miniCurriculo;
}
