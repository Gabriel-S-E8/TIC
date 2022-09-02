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

import br.com.unifacef.Api_Dani.model.Sabores;
import br.com.unifacef.Api_Dani.model.repositories.SaboresRepository;

@RestController
public class SaboresController {

	// vamos fazer o clássico do Spring
	// criar uma injeção de dependência
	@Autowired
	SaboresRepository injecao;
	
	@GetMapping("/sabores")
	@CrossOrigin(origins="*")
	public List<Sabores> get(){
		// select * from Ingredientes
		return injecao.findAll();
	}
	
	@PostMapping("/sabores")
	@CrossOrigin(origins="*")
	public Sabores save(@RequestBody Sabores sabores) {
		// insert into ingredientes values ...
		Sabores novo = injecao.save(sabores);
		return novo;
		
	}
	
	@DeleteMapping("/sabores/{id}")
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
	
	@PutMapping("/sabores")
	@CrossOrigin(origins="*")
	public Sabores update(@RequestBody Sabores sabores) {
		Sabores novo = injecao.save(sabores);
		return novo;
	}
}
