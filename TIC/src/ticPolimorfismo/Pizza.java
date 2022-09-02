package ticPolimorfismo;

// define comportamentos padrões numa pizza
public interface Pizza {
    
    // quais ingredientes adicionar
    public void adicionar();
    
    // tempo de duração necessário para assar a pizza
    public void assar();
    
    // valor a cobrar pela pizza escolhida
    public void valor();
}

