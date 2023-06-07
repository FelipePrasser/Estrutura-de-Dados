package Atividade8;

import java.util.Scanner;

public class TesteBusca {
    public static void main(String[] args) {
        int numExpoente=1, elem, numIndex, qtdElemInt=0;
        int [] vetor1; 
        int [] vetor2;
        double tempoInicial;
        Double qtdElem;
        
        Scanner teclado=new Scanner(System.in);

        System.out.println("Busca Linear:\n");
        while (numExpoente<=5){
            tempoInicial=System.currentTimeMillis();
            qtdElem=Math.pow(10, numExpoente);
            qtdElemInt=qtdElem.intValue();
            
            FuncoesAuxiliares v=new FuncoesAuxiliares();
            vetor1=v.criarVetor(qtdElemInt);
            vetor1=v.criarVetorEmbaralhado(vetor1);

            Busca busca=new Busca(vetor1);

            elem=teclado.nextInt();
            numIndex=busca.buscaLinear(elem);

            if (numIndex!=-1){
                System.out.println("A busca demorou: "+((System.currentTimeMillis()-tempoInicial)/1000d));
            }else{
                System.out.println("O elemento não existe no vetor.");
            }
            
            numExpoente++;
        }
        
        numExpoente=1;
        
        System.out.println("Busca Binária:");
        while (numExpoente<=5) {
            tempoInicial=System.currentTimeMillis();
            qtdElem=Math.pow(10, numExpoente);
            qtdElemInt=qtdElem.intValue();
            
            FuncoesAuxiliares v=new FuncoesAuxiliares();
            vetor2=v.criarVetor(qtdElemInt);
            vetor2=v.criarVetorEmbaralhado(vetor2);
            vetor2=v.mergeSort(vetor2, 0, qtdElemInt-1);
            Busca busca=new Busca(vetor2);
            elem=teclado.nextInt();
            numIndex=busca.buscaBinaria(vetor2, 0, qtdElemInt-1, elem);

            if (numIndex!=-1){
                System.out.println("A busca demorou: "+((System.currentTimeMillis()-tempoInicial)/1000d)+"s");
            }else{
                System.out.println("O elemento não existe no vetor.");
            }
            numExpoente++;
        }
        teclado.close();
    }
}
