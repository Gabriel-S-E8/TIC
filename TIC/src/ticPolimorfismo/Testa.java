package ticPolimorfismo;

public class Testa {
    
    public static void main(String[] args)
    {
        // preparando a pizza parmegiana
        Preparo preparo = new Preparo();
        Parmegiana pizzaParmegiana = new Parmegiana();
        preparo.fazer(pizzaParmegiana);
        
        // preparando a pizza canadense
        Canadense pizzaCanadense = new Canadense();
        preparo.fazer(pizzaCanadense);
        
        System.exit(0);
    }
}
