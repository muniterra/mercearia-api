package com.muniterra.mercearia.model;

import java.math.BigInteger;

import com.muniterra.mercearia.produto.ProdutoDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "Produto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ProdutoModel {

	public ProdutoModel(@Valid ProdutoDto produtosDto) {
		this.nome = produtosDto.nome();
		this.preco = produtosDto.preco();
	}
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private BigInteger id;
	private String nome;
	private Double preco;
}
