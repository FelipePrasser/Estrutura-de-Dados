package Atividade9;

public class TesteArvoreBinariaBusca {
    public static void main(String[] args) {
        ArvoreBinariaBusca arvore=new ArvoreBinariaBusca();
        arvore.insere(6);
        arvore.insere(8);
        arvore.insere(2);
        arvore.insere(4);
        arvore.insere(1);
        arvore.insere(3);
        arvore.insere(3);
        arvore.insere(3);
        arvore.insere(10);
        arvore.insere(-1);
        System.out.println(arvore.busca(6));
        System.out.println(arvore.busca(8));
        System.out.println(arvore.busca(2));
        System.out.println(arvore.busca(4));
        System.out.println(arvore.busca(1));
        System.out.println(arvore.busca(3));
        System.out.println(arvore.somaFolhas());
        System.out.println(arvore.toString());
        System.out.println(arvore.toStringDecrescente());
        arvore.retira(3);
        System.out.println(arvore.toString());
        System.out.println(arvore.toStringDecrescente());
        arvore.retira(8);
        System.out.println(arvore.toString());
        System.out.println(arvore.toStringDecrescente());
    }
}
