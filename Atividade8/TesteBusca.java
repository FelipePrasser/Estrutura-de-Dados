package Atividade8;

import java.util.Scanner;

public class TesteBusca {
    public static void main(String[] args) {
        int num=10, numIndex;
        int [] vetor;
        Scanner teclado=new Scanner(System.in);
        int elem=teclado.nextInt();
        FuncoesAuxiliares v=new FuncoesAuxiliares();

        vetor=v.criarVetor(num);
        vetor=v.criarVetorEmbaralhado(vetor);

        Busca busca=new Busca(vetor);
        numIndex=busca.buscaLinear(elem);

        if (numIndex!=-1){
            System.out.println("O elemento foi encontrado no vetor.\nSua posição no vetor é:");
            System.out.println(numIndex);
        }else{
            System.out.println("O elemento não existe no vetor.");
        }
        
        teclado.close();
    }
}
