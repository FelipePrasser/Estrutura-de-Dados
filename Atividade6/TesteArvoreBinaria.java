package Atividade6;

public class TesteArvoreBinaria {
    public static void main(String[] args) {
        ArvoreBinaria arvore=new ArvoreBinaria();
        arvore.insere(1, arvore.insere(2, null, arvore.insere(4, null, null)), arvore.insere(3, arvore.insere(5, null, null), arvore.insere(6, null, null)));
        System.out.println("Pré Ordem:\n"+arvore.imprimePre());
        System.out.println("Ordem Simétrica:\n"+arvore.imprimeSim(arvore.getRaiz()));
        System.out.println("Pós Ordem:\n"+arvore.imprimePos(arvore.getRaiz()));
        System.out.println("Numeros Nos:\n"+arvore.numNos(arvore.getRaiz()));
        System.out.println("Altura:\n"+arvore.altura(arvore.getRaiz()));
        System.out.println("Folhas:\n"+arvore.folhas(arvore.getRaiz()));
    }
}
