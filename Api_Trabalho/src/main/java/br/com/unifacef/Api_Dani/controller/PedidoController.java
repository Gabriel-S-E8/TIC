package br.com.unifacef.Api_Dani.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacef.Api_Dani.model.Pedido;
import br.com.unifacef.Api_Dani.model.repositories.PedidoRepository;

@RestController
public class PedidoController {

	// vamos fazer o clássico do Spring
	// criar uma injeção de dependência
	@Autowired
	PedidoRepository injecao;
	
	@GetMapping("/Pedido")
	@CrossOrigin(origins="*")
	public List<Pedido> get(){
		// select * from Usuario
		return injecao.findAll();
	}
	
	@PostMapping("/Pedido")
	@CrossOrigin(origins="*")
	public Pedido save(@RequestBody Pedido pedido) {
		// insert into Usuario values ...
		Pedido novo = injecao.save(pedido);
		return novo;
		
	}
	
	@DeleteMapping("/Pedido/{id}")
	@CrossOrigin(origins="*")
	public String delete(@PathVariable Long id) {
		try {
			injecao.deleteById(id);
			return "Remoção realizada com sucesso";
		}
		catch(Exception e) {
			return "Nenhum pokemon encontrado";
		}	
	}
	
	@PutMapping("/Pedido")
	@CrossOrigin(origins="*")
	public Pedido update(@RequestBody Pedido pedido) {
		Pedido novo = injecao.save(pedido);
		return novo;
	}
}
