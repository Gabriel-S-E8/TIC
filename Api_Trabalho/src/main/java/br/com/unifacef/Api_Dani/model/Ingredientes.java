package br.com.unifacef.Api_Dani.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// definindo a classe como uma entidade do BD
@Entity
@Table(name="Ingredientes")
public class Ingredientes {
	
	// criar uma variável que representa a chave primária
	// auto-incremento
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nome")
	private String nome;
	@Column(name="fornecedor")
	private String fornecedor;
	@Column(name="quantidade")
	private Float quantidade;
	@Column(name="peso")
	private Float peso;
	@Column(name="medida")
	private Float medida;
	@Column(name="valor")
	private Float valor;
	@Column(name="descricao")
	private Float descricao;
	
	public Ingredientes() {
		
	}

	public Ingredientes(Long id, String nome, String fornecedor, Float quantidade, Float peso, Float medida,
			Float valor, Float descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.fornecedor = fornecedor;
		this.quantidade = quantidade;
		this.peso = peso;
		this.medida = medida;
		this.valor = valor;
		this.descricao = descricao;
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

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Float quantidade) {
		this.quantidade = quantidade;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public Float getMedida() {
		return medida;
	}

	public void setMedida(Float medida) {
		this.medida = medida;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Float getDescricao() {
		return descricao;
	}

	public void setDescricao(Float descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Ingredientes [id=" + id + ", nome=" + nome + ", fornecedor=" + fornecedor + ", quantidade=" + quantidade
				+ ", peso=" + peso + ", medida=" + medida + ", valor=" + valor + ", descricao=" + descricao + "]";
	}
	
}
