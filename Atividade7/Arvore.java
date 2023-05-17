package Atividade7;

public class Arvore {
    private NoArvore raiz;

    
    public Arvore() {
    }

    public NoArvore criaNo(int info){
        NoArvore novoNo=new NoArvore(info);
        raiz=novoNo;
        return novoNo;
    }

    public void insereFilho(NoArvore no, NoArvore sa){
        sa.setProx(no.getPrim());
        no.setPrim(sa);
        raiz=no;
    }

    @Override
    public String toString() {
        return imprime(raiz);
    }

    private String imprime(NoArvore no) {
        String string=new String("");
        string=string+'<';
        string=string+no.getInfo();
        NoArvore p=new NoArvore();
        p=no.getPrim();
        while (p!=null) {
            string=string+imprime(p);
            p=p.getProx();
        }
        string=string+'>';
        return string;
    }

    public boolean pertence(int info){
        return pertence(raiz, info);
    }

    private boolean pertence (NoArvore no, int info){
        if (no.getInfo()==info){
            return true;
        }
        else{
            NoArvore p=new NoArvore();
            p=no.getPrim();
            while (p!=null){
                if (pertence(p, info)){
                    return true;
                }
                p=p.getProx();
            }
        }
        return false;
    }

    public int altura (){
        return altura (raiz);
    }

    private int altura (NoArvore no){
        int altMax=-1;
        NoArvore p=new NoArvore();
        p=no.getPrim();
        while (p!=null){
            int alt=altura(p);
            if(alt>altMax){
                altMax=alt;
            }
            p=p.getProx();
        }
        return (altMax+1);
    }

    public int pares(){
        return pares(raiz);
    }

    private int pares(NoArvore no){
        int qtdPares=0;
        if (no.getInfo()%2==0){
            qtdPares++;
        }
        pares(no.getProx());
        return qtdPares;
    }
}