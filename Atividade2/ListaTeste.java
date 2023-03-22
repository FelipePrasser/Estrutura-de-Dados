import java.util.Scanner;

public class ListaTeste {
    public static void main(String[] args) {
        Lista lista1=new Lista();
        Lista lista2=new Lista();
        Scanner teclado=new Scanner(System.in);
        System.out.println(lista1.igual(lista2)); 
        System.out.println(lista1.igualRecursivo(lista2));
        int opMenu, num;
        boolean aux=true;
        while (aux==true){
            System.out.println("1. Inserir um elemento na Lista;");
            System.out.println("2. Imprimir os elemento da Lista;");
            System.out.println("3. Ver se a Lista está vazia;");
            System.out.println("4. Buscar um elemento na Lista;");
            System.out.println("5. Ver o comprimento da Lista;");
            System.out.println("6. Ver o último elemento da Lista;");
            System.out.println("7. Retirar um elemento da Lista;");
            System.out.println("8. Apaga a Lista;");
            System.out.println("9. Insere elemento no final da Lista;");
            System.out.println("21. Imprime os elementos da Lista;");
            System.out.println("71. Imprime os elementos da Lista;");

            System.out.println("0. Sair;");
            opMenu=teclado.nextInt();
            switch (opMenu) {
                case 1:
                    System.out.println("Digite o valor:");
                    num=teclado.nextInt();
                    lista1.insere(num);
                    break;
                case 2:
                    System.out.println("A lista é:");
                    lista1.imprime();
                    break;
                case 3:
                    System.out.println("A lista está vazia:");
                    System.out.println(lista1.vazia());
                    break;
                case 4:
                    System.out.println("Digite o número a ser pesquisado:");
                    num=teclado.nextInt();
                    System.out.println(lista1.busca(num));
                    break;
                case 5:
                    System.out.println("O comprimento da lista é:");
                    System.out.println(lista1.comprimento());
                    break;
                case 6:
                    System.out.println("O último elemento da lista é:");
                    System.out.println(lista1.ultimo());
                    break;
                case 7:
                    System.out.println("Digite um número:");
                    num=teclado.nextInt();
                    lista1.retira(num);
                    break;
                case 8:
                    lista1.libera();
                    break;
                case 9:
                    System.out.println("Digite o valor:");
                    num=teclado.nextInt();
                    lista1.insereFim(num);
                    break;
                case 21:
                    lista1.imprimeRecursivo();
                    break;
                case 71:
                    System.out.println("Digite um número:");
                    num=teclado.nextInt();
                    lista1.retiraRecursivo(num);
                    break;
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
