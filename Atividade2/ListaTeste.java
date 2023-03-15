import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ListaTeste {
    public static void main(String[] args) {
        Lista lista1=new Lista();
        Lista lista2=new Lista();
        Lista trocaDeLista=lista1;
        Scanner teclado=new Scanner(System.in);
        int opMenu, num;
        boolean aux=true;
        while (aux==true){
            System.out.println("1. Inserir um elemento na Lista;");
            System.out.println("2. Imprimir um elemento da Lista;");
            System.out.println("3. Ver se a Lista está vazia;");
            System.out.println("4. Buscar um elemento na Lista;");
            System.out.println("5. Ver o comprimento da Lista;");
            System.out.println("6. Ver o último elemento da Lista;");
            System.out.println("7. Retirar um elemento da Lista;");
            System.out.println("8. Apaga a Lista;");
            System.out.println("9. Insere elemento no final da Lista;");
            System.out.println("0. Sair;");
            System.out.println("100. Trocar a lista a ser usada;");//não precisa demonstrar o igual, só testar se funciona;
            opMenu=teclado.nextInt();
            switch (opMenu) {
                case 1:
                    System.out.println("Digite o valor:");
                    num=teclado.nextInt();
                    trocaDeLista.insere(num);
                    break;
                case 2:
                    System.out.println("A lista é:");
                    trocaDeLista.imprime();
                    break;
                case 3:
                    System.out.println("A lista está vazia:");
                    System.out.println(trocaDeLista.vazia());
                    break;
                case 4:
                    System.out.println("Digite o número a ser pesquisado:");
                    num=teclado.nextInt();
                    System.out.println(trocaDeLista.busca(num));
                    break;
                case 5:
                    System.out.println("O comprimento da lista é:");
                    System.out.println(trocaDeLista.comprimento());
                    break;
                case 6:
                    System.out.println("O último elemento da lista é:");
                    System.out.println(trocaDeLista.ultimo());
                    break;
                case 7:
                    System.out.println("Digite um número:");
                    num=teclado.nextInt();
                    trocaDeLista.retira(num);
                    break;
                case 8:
                    trocaDeLista.libera();
                    break;
                case 9:
                    System.out.println("Digite o valor:");
                    num=teclado.nextInt();
                    trocaDeLista.insereFim(num);
                    break;
                case 100:
                    if (trocaDeLista==lista1){
                        trocaDeLista=lista2;
                    }else{
                        trocaDeLista=lista1;
                    }
                case 0:
                    aux=false;
                    break;
                default:
                    break;
            }
        }
        teclado.close();
    }
}
