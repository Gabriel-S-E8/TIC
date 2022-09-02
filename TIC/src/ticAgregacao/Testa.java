package ticAgregacao;
public class Testa {
    public static void main(String[] args) {
        Estoque st1 = new Estoque(145, 1100);
        Produtos p1 = new Produtos(1, 100, 200, "Cebola", st1);
        Produtos p2 = new Produtos(2, 50, 100, "Champignon", st1);
        Produtos p3 = new Produtos(3, 2, 37, "Farinha de Trigo 1kg", st1);
        p1.mostra();
        p2.mostra();
        p3.mostra();
    }
}
