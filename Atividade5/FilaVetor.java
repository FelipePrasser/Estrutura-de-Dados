package Atividade5;

public class FilaVetor implements Fila{
    private int n, ini, tam;
    private int[] vet;
    
    public FilaVetor(int tam) {
        this.n=0;
        this.ini=0;
        this.vet=new int[tam];
        this.tam = tam;
    }

    public void enqueue(int v) throws Exception{
        int fim;
        fim=(ini+n)%tam;
        this.vet[fim]=v;
        this.n++;
    }

    public float dequeue(){
        int v;
        v=this.vet[ini];
        ini=(ini+n)%tam;
        this.n--;
        return v;
    }

    public boolean isEmpty(){
        if (n==0){
            return true;
        }else{
            return false;
        }
    }

    public void reset(){
        n=0;
        ini=0;
    }

    public FilaVetor concatena(FilaVetor f2){
        FilaVetor f3=new FilaVetor(tam+f2.tam);
        int iniF1=ini;
        int iniF2=f2.ini;
        while(iniF1<ini+n){
            f3.enqueue(vet[iniF1%tam]);
            iniF1++;
        }
        while(iniF2<f2.ini+f2.n){
            f3.enqueue(f2.vet[iniF2%f2.tam]);
            iniF2++;
        }
        return f3;
    }

    @Override
    public String toString() {
        return "FilaVetor []";
    }   

}