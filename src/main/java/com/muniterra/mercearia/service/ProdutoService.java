package com.muniterra.mercearia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.muniterra.mercearia.model.ProdutoModel;
import com.muniterra.mercearia.produto.ProdutoDto;
import com.muniterra.mercearia.repository.ProdutoRepository;

import jakarta.validation.Valid;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;
	
	public ResponseEntity<?> listar() {
		return new ResponseEntity<>(produtoRepository.findAll(), HttpStatus.OK);
	}
	
	public ResponseEntity<?> cadastrarProduto(@Valid ProdutoDto produtosDto) {
		var produtos = new ProdutoModel(produtosDto);
		return new ResponseEntity<>(produtoRepository.save(produtos), HttpStatus.CREATED);
	}


	
	
}
