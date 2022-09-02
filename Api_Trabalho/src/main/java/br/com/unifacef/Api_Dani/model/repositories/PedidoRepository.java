package br.com.unifacef.Api_Dani.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifacef.Api_Dani.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
	
	// esta interface vai herdar todos os métodos
	// de operação em banco de dados 
	// CRUD 
	// Create (insert)
	// Retrieve (select) - recuperar
	// Update (update)
	// Delete (delete)
	
	
}
