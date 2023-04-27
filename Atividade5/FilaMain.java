package Atividade5;

import java.util.Scanner;

public class FilaMain {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Insira o tamanho da fila a ser criada:");
        int tam=teclado.nextInt();
        FilaVetor f1=new FilaVetor(tam);
        int menu=1, num;
        while (menu!=0){
            System.out.println("1. Insira um elemento na fila;");
            System.out.println("2. Retire um elemento da Fila;");
            System.out.println("3. Informa se a fila está vazia ou não;");
            System.out.println("4. Reseta a fila;");
            System.out.println("5. Imprime a fila;");
            System.out.println("0. Fechar o Programa;");
            menu=teclado.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Digite o número a ser inserido:");
                    num=teclado.nextInt();
                    f1.enqueue(num);
                    break;
                case 2:
                    f1.dequeue();
                    break;
                case 3:    
                    boolean aux=f1.isEmpty();
                    if (aux==true){
                        System.out.println("A lista está vazia.");
                    }else{
                        System.out.println("A lista não está vazia.");
                    }
                    break;
                case 4:
                    f1.reset();
                    break;
                case 5:
                    f1.imprimir();
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }
        teclado.close();  
    }
}
