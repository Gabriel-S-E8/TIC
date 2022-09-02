package br.com.unifacef.Api_Dani.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// definindo a classe como uma entidade do BD
@Entity
@Table(name="Usuario")
public class Usuario {
	
	// criar uma variável que representa a chave primária
	// auto-incremento
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nome")
	private String nome;
	@Column(name="cargo")
	private String cargo;
	@Column(name="telefone")
	private String telefone;
	@Column(name="email")
	private String email;
	@Column(name="senha")
	private String senha;
	
	public Usuario() {
		super();
	}

	public Usuario(Long id, String nome, String cargo, String telefone, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", cargo=" + cargo + ", telefone=" + telefone + ", email="
				+ email + ", senha=" + senha + "]";
	}
	
}
