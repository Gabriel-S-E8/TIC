package br.com.unifacef.Api_Dani.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// definindo a classe como uma entidade do BD
@Entity
@Table(name="Sabores")
public class Sabores {
	
	// criar uma variável que representa a chave primária
	// auto-incremento
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nome")
	private String nome;
	@Column(name="ing1")
	private String ing1;
	@Column(name="ing2")
	private String ing2;
	@Column(name="ing3")
	private String ing3;
	@Column(name="ing4")
	private String ing4;
	@Column(name="ing5")
	private String ing5;
	@Column(name="ing6")
	private String ing6;
	@Column(name="ing7")
	private String ing7;
	@Column(name="ing8")
	private String ing8;
	@Column(name="ing9")
	private String ing9;
	
	public Sabores() {
		
	}

	public Sabores(Long id, String nome, String ing1, String ing2, String ing3, String ing4, String ing5, String ing6,
			String ing7, String ing8, String ing9) {
		super();
		this.id = id;
		this.nome = nome;
		this.ing1 = ing1;
		this.ing2 = ing2;
		this.ing3 = ing3;
		this.ing4 = ing4;
		this.ing5 = ing5;
		this.ing6 = ing6;
		this.ing7 = ing7;
		this.ing8 = ing8;
		this.ing9 = ing9;
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

	public String getIng1() {
		return ing1;
	}

	public void setIng1(String ing1) {
		this.ing1 = ing1;
	}

	public String getIng2() {
		return ing2;
	}

	public void setIng2(String ing2) {
		this.ing2 = ing2;
	}

	public String getIng3() {
		return ing3;
	}

	public void setIng3(String ing3) {
		this.ing3 = ing3;
	}

	public String getIng4() {
		return ing4;
	}

	public void setIng4(String ing4) {
		this.ing4 = ing4;
	}

	public String getIng5() {
		return ing5;
	}

	public void setIng5(String ing5) {
		this.ing5 = ing5;
	}

	public String getIng6() {
		return ing6;
	}

	public void setIng6(String ing6) {
		this.ing6 = ing6;
	}

	public String getIng7() {
		return ing7;
	}

	public void setIng7(String ing7) {
		this.ing7 = ing7;
	}

	public String getIng8() {
		return ing8;
	}

	public void setIng8(String ing8) {
		this.ing8 = ing8;
	}

	public String getIng9() {
		return ing9;
	}

	public void setIng9(String ing9) {
		this.ing9 = ing9;
	}

	@Override
	public String toString() {
		return "Sabores [id=" + id + ", nome=" + nome + ", ing1=" + ing1 + ", ing2=" + ing2 + ", ing3=" + ing3
				+ ", ing4=" + ing4 + ", ing5=" + ing5 + ", ing6=" + ing6 + ", ing7=" + ing7 + ", ing8=" + ing8
				+ ", ing9=" + ing9 + "]";
	}
	
}
