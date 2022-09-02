package ticHerança;

import java.util.Date;

public class salao extends Pedido{
    private int nmrMesa;

    public salao() {
    }

    public salao(int nmrMesa, String nome, String desPedido, int codPedido, Date horario) {
        super(nome, desPedido, codPedido, horario);
        this.nmrMesa = nmrMesa;
    }

    public int getNmrMesa() {
        return nmrMesa;
    }

    public void setNmrMesa(int nmrMesa) {
        this.nmrMesa = nmrMesa;
    }

    @Override
    public String toString() {
        return "salao{" + "nmrMesa=" + nmrMesa + super.toString() + '}';
    }
    
    
}
