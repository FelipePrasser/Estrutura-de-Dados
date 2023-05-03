package Atividade6;

public class TesteArvoreBinaria {
    public static void main(String[] args) {
        ArvoreBinaria arvore=new ArvoreBinaria();
        arvore.insere(1, arvore.insere(2, null, arvore.insere(4, null, null)), arvore.insere(3, arvore.insere(5, null, null), arvore.insere(6, null, null)));
    }
}
