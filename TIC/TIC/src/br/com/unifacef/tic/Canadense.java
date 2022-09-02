package br.com.unifacef.tic;

public class Canadense implements Pizza{
    
    // ingredientes
    /** {@inheritDoc} */
    @Override
    public void adicionar()
    {
        System.out.println("Pizza Canadense: Molho, Lombo Canadense, Muçarela, Bacon, Palmito, Champignon, Azeitona, Tomate e Orégano");
    }
    
    // tempo 
    /** {@inheritDoc} */
    @Override
    public void assar()
    {
        System.out.println("25 minutos");
    }
    
    // valor a cobrar
    /** {@inheritDoc} */
    @Override
    public void valor()
    {
        System.out.println("R$43,50");
    }

    
}
