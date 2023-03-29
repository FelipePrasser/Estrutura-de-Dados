package Atividade1;

import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) {
        int vetor[]={0,4,5,7,9,3,2,8,6,1};
        int membros=vetor.length;
        Scanner teclado=new Scanner(System.in);
        int opMenu=1;
        System.out.println("1. Ordenar usando Bubble Sort;");
        System.out.println("2. Ordenar usando Quick Sort;");
        opMenu=teclado.nextInt();
        switch (opMenu){
            case 1:
                bubbleSort(membros, vetor);
                System.out.println("O vetor ordenado: ");
                System.out.print("v=[");
                //imprimir vetor
                for(int i=0; i<membros; i++){
                    System.out.print(vetor[i]+" ");
                }
                System.out.println(" ];");
                break; 
            case 2:
                quickSort(0, 0, vetor);
                System.out.println("O vetor ordenado: ");
                System.out.print("v=[");
                //imprimir vetor
                for(int i=0; i<membros; i++){
                    System.out.print(vetor[i]+" ");
                }
                System.out.println(" ];");
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
    public static void quickSort(int inicioVetor, int fimVetor, int v[]){
        int n=v.length;
        inicioVetor=0;
        fimVetor=n-1;
        int iVetor=inicioVetor;
        int fVetor=fimVetor;
        int pivo=v[(iVetor+fVetor)/2], aux;
        while (iVetor<=fVetor){
            while (v[iVetor]<pivo){
                iVetor++;
            }
            while (v[fVetor]>pivo){
                fVetor++;
            }
            if(iVetor<=fVetor){
                aux=v[iVetor];
                v[iVetor]=v[fVetor];
                v[fVetor]=aux;
                iVetor++;
                fVetor--;
            }
        }
        if (inicioVetor<fVetor){
            quickSort(inicioVetor,fVetor, v);
        }
        if(iVetor>fimVetor){
            quickSort(iVetor,fimVetor, v);
        }
    }
}
