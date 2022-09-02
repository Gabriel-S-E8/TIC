package br.com.unifacef.Api_Dani.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// definindo a classe como uma entidade do BD
@Entity
@Table(name="Pedido")
public class Pedido {
	
	// criar uma variável que representa a chave primária
	// auto-incremento
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Cliente")
	private String Cliente;
	@Column(name="Sabor")
	private String Sabor;
	@Column(name="Quantidade")
	private String Quantidade;
	@Column(name="valor")
	private String valor;
	
	public Pedido() {
		super();
	}

	public Pedido(Long id, String cliente, String sabor, String quantidade, String valor) {
		super();
		this.id = id;
		Cliente = cliente;
		Sabor = sabor;
		Quantidade = quantidade;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCliente() {
		return Cliente;
	}

	public void setCliente(String cliente) {
		Cliente = cliente;
	}

	public String getSabor() {
		return Sabor;
	}

	public void setSabor(String sabor) {
		Sabor = sabor;
	}

	public String getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(String quantidade) {
		Quantidade = quantidade;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", Cliente=" + Cliente + ", Sabor=" + Sabor + ", Quantidade=" + Quantidade
				+ ", valor=" + valor + "]";
	}
	
}
