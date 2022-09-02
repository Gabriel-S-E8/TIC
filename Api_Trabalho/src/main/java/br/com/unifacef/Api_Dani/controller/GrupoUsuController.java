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

import br.com.unifacef.Api_Dani.model.GrupoUsu;
import br.com.unifacef.Api_Dani.model.repositories.GrupoUsuRepository;

@RestController
public class GrupoUsuController {

	// vamos fazer o clássico do Spring
	// criar uma injeção de dependência
	@Autowired
	GrupoUsuRepository injecao;
	
	@GetMapping("/grupo")
	@CrossOrigin(origins="*")
	public List<GrupoUsu> get(){
		// select * from Usuario
		return injecao.findAll();
	}
	
	@PostMapping("/grupo")
	@CrossOrigin(origins="*")
	public GrupoUsu  save(@RequestBody GrupoUsu grupo) {
		// insert into Usuario values ...
		GrupoUsu  novo = injecao.save(grupo);
		return novo;
		
	}
	
	@DeleteMapping("/grupo/{id}")
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
	
	@PutMapping("/grupo")
	@CrossOrigin(origins="*")
	public GrupoUsu  update(@RequestBody GrupoUsu  grupo) {
		GrupoUsu  novo = injecao.save(grupo);
		return novo;
	}
}
