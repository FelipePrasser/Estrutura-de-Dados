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

    public int buscaBinaria(int[] vetor, int ini, int fim, int elemento){
        if (ini<=fim){
            int meio=ini+(fim-ini)/2;
            if (elemento<vetor[meio]){
                return buscaBinaria (vetor, ini, meio, elemento);
            }
            else{
                if (elemento>vetor[meio]){
                    return buscaBinaria(vetor, meio+1, fim, elemento);
                }
                else{
                    return meio;
                }
            }
        }
        return -1;
    }
    
}