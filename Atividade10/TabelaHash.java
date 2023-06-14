package Atividade10;

public class TabelaHash {
    private Aluno[] tabela;

    public TabelaHash(int N) {
        this.tabela=new Aluno [N];
    }
    
    private int hash(int k){
        return (k%this.tabela.length);
    }
    
    public Aluno get(int k){
        int h=hash(k);
        while (tabela[h]!=null){
            if (tabela[h].getMatricula()==k){
                return tabela[h];
            }
            h=(h+1)%tabela.length;
        }
        return null;
    }

    public void set(String nome, int matricula, float mediaGeral){
        int h=hash(matricula);
        while(tabela[h]!=null){
            if(tabela[h].getMatricula()==matricula){
                break;
            }
            h=(h+1)%tabela.length;
        }
        if (tabela[h]==null){
            tabela[h]=new Aluno();
            tabela[h].setMatricula(matricula);
        }
        tabela[h].setNome(nome);
        tabela[h].setMediaGeral(mediaGeral);
    }
}
