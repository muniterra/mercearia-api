package com.muniterra.mercearia.produto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record ProdutoDto(
		@NotBlank
		String nome, 
		@Positive
		Double preco) {

}
