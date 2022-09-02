package ticComposição;

import java.util.Date;

public class Testa {
    public static void main(String[] args) {
        PedidoEfetuado pedEf1 = new PedidoEfetuado(120, new Date());
        Pagamento pag1 = new Pagamento(1456, "César", "Av. Dom Pedro I", 40);
        Pagamento pag2 = new Pagamento(208, "Daniel", "Av. Dom Pedro I", 20);
        pedEf1.addPagamento(pag1);
        pedEf1.addPagamento(pag2);
        System.out.println(pedEf1.toString());
    }
    
}
