package ticPolimorfismo;

public class Parmegiana implements Pizza {
    
    // quais ingredientes adicionar
    @Override
    public void adicionar()
    {
        System.out.println("Pizza Parmegiana: Molho, Presunto, Bacon, , Muçarela, Azeitonas e Orégano");
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
        System.out.println("R$47,50");
    }
    
}