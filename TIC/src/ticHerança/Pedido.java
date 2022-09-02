package ticHerança;

import java.util.Date;

public abstract class Pedido {
    protected String nome, desPedido;
    protected int codPedido;
    protected Date horario;

    public Pedido() {
    }

    public Pedido(String nome, String desPedido, int codPedido, Date horario) {
        this.nome = nome;
        this.desPedido = desPedido;
        this.codPedido = codPedido;
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesPedido() {
        return desPedido;
    }

    public void setDesPedido(String desPedido) {
        this.desPedido = desPedido;
    }

    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "\nPedido{" + "nome=" + nome + ", desPedido=" + desPedido + ", codPedido=" + codPedido + ", horario=" + horario + '}';
    }
    
    
    
}
