import java.util.Scanner;

public class ListaTeste {
    public static void main(String[] args) {
        Lista lista=new Lista();
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
            System.out.println("0. Sair;");
            opMenu=teclado.nextInt();
            switch (opMenu) {
                case 1:
                    System.out.println("Digite o valor:");
                    num=teclado.nextInt();
                    lista.insere(num);
                    break;
                case 2:
                    System.out.println("A lista é:");
                    lista.imprime();
                    break;
                case 3:
                    System.out.println("A lista está vazia:");
                    System.out.println(lista.vazia());
                    break;
                case 4:
                    System.out.println("Digite o número a ser pesquisado:");
                    num=teclado.nextInt();
                    System.out.println(lista.busca(num));
                    break;
                case 5:
                    System.out.println("O comprimento da lista é:");
                    System.out.println(lista.comprimento());
                    break;
                case 6:
                    System.out.println("O último elemento da lista é:");
                    System.out.println(lista.ultimo());
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
