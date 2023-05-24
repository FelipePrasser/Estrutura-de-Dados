package Atividade8;

public class Busca {

    private int [] vetor;

    public Busca(int[] vetor) {
        this.vetor = vetor;
    }
    
    public int[] getVetor() {
        return vetor;
    }

    public int buscaLinear(int num){
        for (int i = 0; i < vetor.length; i++) {
            if (num==vetor[i])
                return i;
        }
        return -1;
    }

    public int buscaBinaria(int[] vetor, int elemento, int ini, int fim){
        if (ini<fim){
            int meio=
        }
        return -1;
    }
    
}