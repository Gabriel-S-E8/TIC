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

import br.com.unifacef.Api_Dani.model.Ingredientes;
import br.com.unifacef.Api_Dani.model.repositories.IngedientesRepository;

@RestController
public class IngedientesController {

	// vamos fazer o clássico do Spring
	// criar uma injeção de dependência
	@Autowired
	IngedientesRepository injecao;
	
	@GetMapping("/ingredientes")
	@CrossOrigin(origins="*")
	public List<Ingredientes> get(){
		// select * from Ingredientes
		return injecao.findAll();
	}
	
	@PostMapping("/ingredientes")
	@CrossOrigin(origins="*")
	public Ingredientes save(@RequestBody Ingredientes ingrediente) {
		// insert into ingredientes values ...
		Ingredientes novo = injecao.save(ingrediente);
		return novo;
		
	}
	
	@DeleteMapping("/ingredientes/{id}")
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
	
	@PutMapping("/ingredientes")
	@CrossOrigin(origins="*")
	public Ingredientes update(@RequestBody Ingredientes ingrediente) {
		Ingredientes novo = injecao.save(ingrediente);
		return novo;
	}
}
