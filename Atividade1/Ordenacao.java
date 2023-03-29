package Atividade1;

import java.util.Random;
import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int[] vetor=new int[10];
        gerarVetor(vetor);
        System.out.print("Vetor Não Ordenado:\n v=[");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }
        System.out.print("]\n");
        int opMenu;
            System.out.println("1. Use o Bubble Sort para ordenar;");
            System.out.println("2. Use o Quick Sort para ordenar;");
            System.out.println("3. Use o Merge Sort para ordenar;");;
            System.out.println("0. Sair do programa;");
            opMenu=teclado.nextInt();
            switch (opMenu) {
                case 1:
                    System.out.print("Vetor Ordenado:\n v=[");
                    for (int i = 0; i < vetor.length; i++) {
                        System.out.print(vetor[i]+" ");
                    }
                    System.out.print("]\n");
                    break;
                case 2:
                    System.out.print("Vetor Ordenado:\n v=[");
                    for (int i = 0; i < vetor.length; i++) {
                        System.out.print(vetor[i]+" ");
                    }
                    System.out.print("]\n");
                    break;
                case 3:
                    System.out.print("Vetor Ordenado:\n v=[");
                    for (int i = 0; i < vetor.length; i++) {
                        System.out.print(vetor[i]+" ");
                    }
                    System.out.print("]\n");
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        teclado.close();
    }
    
    public static void bubbleSort(int n, int v[]){
        int aux;
        //para rodar o vetor por completo
        for(int i=n-1; i>=0; i--){
            //roda o vetor, trocando as posições de modo que a maior fique no final do vetor, e o for anterior diminuindo i a cada loop, impede que o ordenador passer por posições já ordenadas;
            for(int j=0; j<i; j++){
                //condição para troca;
                if (v[j]>v[j+1] && (j+1)<n){
                    aux=v[j+1];
                    v[j+1]=v[j];
                    v[j]=aux;
                    System.out.println("O vetor ordenando: ");
                    System.out.print("v=[");
                    for(int k=0; k<n; k++){
                        System.out.print(v[k]+" ");
                    }
                    System.out.println(" ];");
                    System.out.println("---------------------------");
                }
            }
        }
    }
    
    public static void quickSort(int v[], int inicioVetor, int fimVetor){
        int iVetor=inicioVetor;
        int fVetor=fimVetor;
        int pivo=v[(inicioVetor+fimVetor)/2], aux;
        while (iVetor<=fVetor){
            while (v[iVetor]<pivo && iVetor<fimVetor){
                iVetor++;
            }
            while (v[fVetor]>pivo && fVetor>inicioVetor){
                fVetor--;
            }
            if(iVetor<=fVetor){
                aux=v[iVetor];
                v[iVetor]=v[fVetor];
                v[fVetor]=aux;
                iVetor++;
                fVetor--;
            }
        }
        if (fVetor>inicioVetor){
            quickSort(v, inicioVetor, fVetor+1);
        }
        if(iVetor<fimVetor){
            quickSort(v,iVetor, fimVetor);
        }
    }

    public static void mergeSort(int v[], int inicioVetor,int fimVetor){
        if (inicioVetor<fimVetor){
            int meioVetor=(inicioVetor+fimVetor)/2;
            mergeSort(v, inicioVetor, meioVetor);
            mergeSort(v, meioVetor+1, fimVetor);
            merge(v, inicioVetor, meioVetor,fimVetor);
        }
    }
    public static void merge(int v[], int inicioVetor, int meioVetor, int fimVetor){
        int tamEsq=meioVetor-inicioVetor+1;
        int tamDir=fimVetor-meioVetor;
        int vetEsq[]=new int[tamEsq];
        int vetDir[]=new int[tamDir];
        System.out.println("tamEsq "+tamEsq+";\ntamDir "+tamDir);
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
                    System.out.print("Vetor Ordenado:\n v=[");
                    for (int j = 0; j < v.length; j++) {
                        System.out.print(v[j]+" ");
                    }
                    System.out.print("]\n");
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

    public static void gerarVetor(int vetor[]){
        Random aleatorio=new Random();
        for (int i = 0; i < 10; i++) {
            vetor[i]=aleatorio.nextInt(10);
        }
    }
}
