package ticComposição;

import java.util.ArrayList;
import java.util.Date;

public class PedidoEfetuado{
    private int codPedido;
    private Date horario;

    private ArrayList<Pagamento> pagamento; 

    public PedidoEfetuado() {
        this.pagamento = new ArrayList();
    }

    public PedidoEfetuado(int codPedido, Date horario, ArrayList<Pagamento> payment) {
        this.codPedido = codPedido;
        this.horario = horario;
        this.pagamento = payment;
    }
    
    public PedidoEfetuado(int codPedido, Date horario) {
        this.codPedido = codPedido;
        this.horario = horario;
        this.pagamento = new ArrayList();
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

    public ArrayList<Pagamento> getPagamento() {
        return pagamento;
    }

    public void setPagamento(ArrayList<Pagamento> pagamento) {
        this.pagamento = pagamento;
    }
    
    public void addPagamento(Pagamento pagamento){
        this.pagamento.add(pagamento);
    }

    @Override
    public String toString() {
        return "PedidoEfetuado{" + "codPedido=" + codPedido + ", horario=" + horario + ", \npagamentos=" + pagamento + '}';
    }
}
