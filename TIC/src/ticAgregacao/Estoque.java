package ticAgregacao;
public class Estoque {
    private int qntItens, codItem;
    
    public Estoque() {
    }

    public Estoque(int qntItens, int codItem) {
        this.qntItens = qntItens;
        this.codItem = codItem;
    }

    public int getQntItens() {
        return qntItens;
    }

    public void setQntItens(int qntItens) {
        this.qntItens = qntItens;
    }

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public void mostra(){
        System.out.println("Quantidade de Itens: " + this.qntItens + " Código do estoque: " + this.codItem);
    }
    
}
