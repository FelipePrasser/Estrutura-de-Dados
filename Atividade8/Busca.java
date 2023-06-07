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
            int meio=ini+(fim-ini)/2;
            if (elemento<vetor[meio]){
                return buscaBinaria (vetor, elemento, ini, meio);
            }
            else{
                if (elemento>vetor[meio]){
                    return buscaBinaria(vetor, elemento, meio+1, fim);
                }
                else{
                    return meio;
                }
            }
        }
        else{
            return -1;
        }
    }
    
}