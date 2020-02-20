package com.produto.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produto.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	//Produto findbyid(Long id);

}
