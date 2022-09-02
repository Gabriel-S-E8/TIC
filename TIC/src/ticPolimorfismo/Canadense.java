package ticPolimorfismo;

public class Canadense implements Pizza{
    
    // quais ingredientes adicionar
    @Override
    public void adicionar()
    {
        System.out.println("Pizza Canadense: Molho, Lombo Canadense, Muçarela, Bacon, Palmito, Champignon, Azeitona, Tomate e Orégano");
    }
    
    // tempo de duração necessário para assar a pizza
    @Override
    public void assar()
    {
        System.out.println("25 minutos");
    }
    
    // valor a cobrar pela pizza escolhida
    @Override
    public void valor()
    {
        System.out.println("R$43,50");
    }

    
}