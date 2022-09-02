package br.com.unifacef.tic;

public class Parmegiana implements Pizza {
    
    /**
     * {@inheritDoc}
     */
    public void adicionar()
    {
        System.out.println("Pizza Parmegiana: Molho, Presunto, Bacon, , Muçarela, Azeitonas e Orégano");
    }
    
    // tempo 
    public void assar()
    {
        System.out.println("25 minutos");
    }
    
    public void valor()
    {
        System.out.println("R$47,50");
    }
    
}
