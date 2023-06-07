package Atividade8;

import java.util.Scanner;

public class TesteBusca {
    public static void main(String[] args) {
        int numExpoente=1, num, elem, numIndex;
        int [] vetor1, vetor2;
        double tempoInicial;

        Scanner teclado=new Scanner(System.in);

        System.out.println("Busca Linear:\n");
        while (numExpoente<=5){
            Double qtdElem=Math.pow(10, numExpoente);
            int qtdElemInt=qtdElem.intValue();
            
            FuncoesAuxiliares v=new FuncoesAuxiliares();
            vetor1=v.criarVetor(qtdElemInt);
            vetor1=v.criarVetorEmbaralhado(vetor1);

            Busca busca=new Busca(vetor1);

            elem=teclado.nextInt();
            numIndex=busca.buscaLinear(elem);

            if (numIndex!=-1){
                tempoInicial=System.currentTimeMillis();
                System.out.println("A busca demorou: "+((System.currentTimeMillis()-tempoInicial)/1000d)+"\n");
            }else{
                System.out.println("O elemento não existe no vetor.");
            }
            
            numExpoente++;
        }
        /*
        int num=10, numIndex;
        int [] vetor;
        
        int elem=teclado.nextInt();
        FuncoesAuxiliares v=new FuncoesAuxiliares();

        vetor=v.criarVetor(num);
        vetor=v.criarVetorEmbaralhado(vetor);
        Busca busca=new Busca(vetor);
        numIndex=busca.buscaLinear(elem);
        */
        
       // numIndex=busca.buscaBinaria(vetor, elem, vetor[0], vetor[num-1]);


        teclado.close();
    }
}
