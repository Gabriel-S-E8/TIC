package ticHerança;

import java.util.Date;

public class agendado extends Pedido{
    private String endereco;
    private int telefone;

    public agendado() {
    }

    public agendado(String endereco, int telefone, String nome, String desPedido, int codPedido, Date horario) {
        super(nome, desPedido, codPedido, horario);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "agendado{" + "endereco=" + endereco + ", telefone=" + telefone + super.toString() + '}';
    }
    
}
