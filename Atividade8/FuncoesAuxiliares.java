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

    public void imprime(int[] vetor){
        System.out.print("<");
        for (int i=0; i<vetor.length-1; i++){
            System.out.print(vetor[i]+",");
        }
        System.out.println(vetor[vetor.length-1]+">");
    }
    public int[] mergeSort(int v[], int inicioVetor,int fimVetor){
        if (inicioVetor<fimVetor){
            int meioVetor=(inicioVetor+fimVetor)/2;
            mergeSort(v, inicioVetor, meioVetor);
            mergeSort(v, meioVetor+1, fimVetor);
            merge(v, inicioVetor, meioVetor,fimVetor);
        }
        return v;
    }

    public void merge(int v[], int inicioVetor, int meioVetor, int fimVetor){
        int tamEsq=meioVetor-inicioVetor+1;
        int tamDir=fimVetor-meioVetor;
        int vetEsq[]=new int[tamEsq];
        int vetDir[]=new int[tamDir];
        for (int i = 0; i <tamEsq;  i++) {
            vetEsq[i]=v[inicioVetor+i];
        }
        for (int i = 0; i <tamDir; i++) {
            vetDir[i]=v[meioVetor+i+1];
        }
        int idEsq=0, idDir=0;
        for (int i = inicioVetor; i <=fimVetor; i++) {
            if (idEsq<tamEsq){
                if (idDir<tamDir){
                    if (vetEsq[idEsq]<vetDir[idDir]){
                        v[i]=vetEsq[idEsq];
                        idEsq++;
                    }
                    else{
                        v[i]=vetDir[idDir];
                        idDir++;
                    }
                }
                else{
                    v[i]=vetEsq[idEsq];
                    idEsq++;
                }
            }
            else{
                v[i]=vetDir[idDir];
                idDir++;
            }
        }
    }
}
