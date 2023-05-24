package Atividade8;

import java.util.Random;

public class FuncoesAuxiliares {
    public int[] criarVetor(int num){
        int[] vetor=new int[num];
        for (int i = 0; i < num; i++) {
            vetor[i]=i;
        }
        return vetor;
    }
    public int[] criarVetorEmbaralhado(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            int j, aux;
            Random aleatorio=new Random();
            j=aleatorio.nextInt(vetor.length);
            aux=vetor[i];
            vetor[i]=vetor[j];
            vetor[j]=aux;
        }
        return vetor;
    }
}
