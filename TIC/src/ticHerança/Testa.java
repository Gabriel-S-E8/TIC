package ticHerança;

import java.util.Date;

public class Testa {
    public static void Polimorfismo(Pedido pedido){
        System.out.println(pedido.toString());
    }
    public static void main(String[] args) {
        agendado a1 = new agendado ("Av. Dom Pedro I", 32102222, "César", "Pizza 1/2 Frango catupiry 1/2 file mignom", 189, new Date());
        salao s1 = new salao (13 , "Daniel", "Pizza calabresa com catupiry", 290, new Date());
        
        Polimorfismo(a1);
        Polimorfismo(s1);
    }
    
}
