/**
 * GRUPO 9 
 * ALUNOS: Gabriel Ferreira(gerente)
 *         Amanda Barboza 
 *         Danilo Badoco
 *         Leonardo Baldo
 *         Juliano Silva
 * */
package ticComposição;
public class Pagamento {
    private int codTransicao;
    private String nomePagante, endereco;
    private float valor;

    public Pagamento() {
    }

    public Pagamento(int codTransicao, String nomePagante, String endereco, float valor) {
        this.codTransicao = codTransicao;
        this.nomePagante = nomePagante;
        this.endereco = endereco;
        this.valor = valor;
    }

    public int getCodTransicao() {
        return codTransicao;
    }

    public void setCodTransicao(int codTransicao) {
        this.codTransicao = codTransicao;
    }

    public String getNomePagante() {
        return nomePagante;
    }

    public void setNomePagante(String nomePagante) {
        this.nomePagante = nomePagante;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\nPagamento{" + "codTransicao=" + codTransicao + ", nomePagante=" + nomePagante + ", endereco=" + endereco + ", valor=" + valor + '}';
    }
}
