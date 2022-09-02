package br.com.unifacef.Api_Dani.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// definindo a classe como uma entidade do BD
@Entity
@Table(name="Grupo")
public class GrupoUsu {
	
	// criar uma variável que representa a chave primária
	// auto-incremento
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="cargo")
	private String cargo;
	@Column(name="setor")
	private String setor;
	
	public GrupoUsu() {
		super();
	}

	public GrupoUsu(Long id, String cargo, String setor) {
		super();
		this.id = id;
		this.cargo = cargo;
		this.setor = setor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "GrupoUsu [id=" + id + ", cargo=" + cargo + ", setor=" + setor + "]";
	}
	
	
}
