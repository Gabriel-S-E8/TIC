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

import br.com.unifacef.Api_Dani.model.Usuario;
import br.com.unifacef.Api_Dani.model.repositories.UsuarioRepository;

@RestController
public class UsuarioController {

	// vamos fazer o clássico do Spring
	// criar uma injeção de dependência
	@Autowired
	UsuarioRepository injecao;
	
	@GetMapping("/usuario")
	@CrossOrigin(origins="*")
	public List<Usuario> get(){
		// select * from Usuario
		return injecao.findAll();
	}
	
	@PostMapping("/usuario")
	@CrossOrigin(origins="*")
	public Usuario save(@RequestBody Usuario usuario) {
		// insert into Usuario values ...
		Usuario novo = injecao.save(usuario);
		return novo;
		
	}
	
	@DeleteMapping("/usuario/{id}")
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
	
	@PutMapping("/usuario")
	@CrossOrigin(origins="*")
	public Usuario update(@RequestBody Usuario usuario) {
		Usuario novo = injecao.save(usuario);
		return novo;
	}
}
