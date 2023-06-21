package Atividade10;

public class Teste {
    public static void main(String[] args) {
        TabelaHash tabela=new TabelaHash(5);
        tabela.set("Felipe", 2585, 7);
        tabela.set("João", 9874, 8);
        tabela.set("Igor", 7496, 4);
        tabela.set("Hugo", 8741, 6);
        tabela.set("Vítor",7241, 8);
        System.out.println(tabela.toString());
        System.out.println(tabela.get(7496));
        tabela.remove(7496);
        System.out.println(tabela.toString());
    }
}
