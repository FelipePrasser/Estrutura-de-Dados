package Atividade5;

public interface Fila {
    //Função para enfileirar;
    public void enqueue(int v) throws Exception;
    public float dequeue() throws Exception;
    public boolean isEmpty() throws Exception;
    public void reset() throws Exception;
}