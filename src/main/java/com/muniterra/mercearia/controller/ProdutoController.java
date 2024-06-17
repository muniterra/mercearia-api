package com.muniterra.mercearia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muniterra.mercearia.produto.ProdutoDto;
import com.muniterra.mercearia.service.ProdutoService;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	@Autowired
	ProdutoService produtoService;

	@GetMapping
	public ResponseEntity<?> listar(){
		return produtoService.listar();
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<?> cadastrarProduto(@Valid @RequestBody ProdutoDto produtosDto) {
		return produtoService.cadastrarProduto(produtosDto);
	}
}
