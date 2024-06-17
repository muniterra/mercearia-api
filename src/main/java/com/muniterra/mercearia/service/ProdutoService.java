package com.muniterra.mercearia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muniterra.mercearia.model.ProdutoModel;
import com.muniterra.mercearia.produto.ProdutoDto;
import com.muniterra.mercearia.repository.ProdutoRepository;

import jakarta.validation.Valid;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;
	
	public void cadastrarProduto(@Valid ProdutoDto produtosDto) {
		var produtos = new ProdutoModel(produtosDto);
		produtoRepository.save(produtos);
	}

	
	
}
