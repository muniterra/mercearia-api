package com.muniterra.mercearia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muniterra.mercearia.model.ProdutoModel;
import com.muniterra.mercearia.produto.ProdutoDto;
import com.muniterra.mercearia.repository.ProdutoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	ProdutoRepository produtoRepository;
	
	@PostMapping
	public ResponseEntity<String> cadastrarProduto(@Valid @RequestBody ProdutoDto produtosDto) {
		
		var produtos = new ProdutoModel(produtosDto);
		produtoRepository.save(produtos);
		
		return ResponseEntity.ok("Deu certo, corno!");
	}
}
