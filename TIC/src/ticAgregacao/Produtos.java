package ticAgregacao;
public class Produtos {
    private int codigo, quantidade;
    private float preco;
    private String descProd;
    
    private Estoque estoque;

    public Produtos() {
    }

    public Produtos(int codigo, int quantidade, float preco, String descProd, Estoque estoque) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
        this.descProd = descProd;
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescProd() {
        return descProd;
    }

    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
    public void mostra(){
        System.out.println("Código: " + this.codigo + " Quantidade: " + this.quantidade + " Preço: " + this.preco + " Descrição Produto: " + this.descProd);
        this.estoque.mostra();
    }
}
