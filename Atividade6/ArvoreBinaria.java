package Atividade6;

public class ArvoreBinaria {
    //vamo ver se vai dar certo
    private NoArvoreBinaria raiz=null;

    public ArvoreBinaria() {
    }

    public NoArvoreBinaria insere(int v, NoArvoreBinaria esq, NoArvoreBinaria dir){
        NoArvoreBinaria no=new NoArvoreBinaria(v, esq, dir);
        raiz=no;
        return no;
    }
    
    public boolean vazia(){
        return (raiz==null);
    }

    @Override
    public String toString() {
        return toStringAux(raiz);
    }

    private String toStringAux(NoArvoreBinaria no) {
        String string=new String("");
        string=string+'<';
        if (no!=null){
            string=string+no.getInfo();
            string=string+toStringAux(no.getEsq());
            string=string+toStringAux(no.getDir());
        }
        string=string+'>';
        return string;
    }

    public boolean pertence(int info){
        return pertence(raiz, info);
    }
    
    private boolean pertence(NoArvoreBinaria no, int info){
        if (no==null){
            return false;
        }else{
            return((no.getInfo()==info)||pertence(no.getEsq(),info)||pertence(no.getDir(),info));
        }
    }

    public int pares(){

        return 0;
    }

    public int folhas(){

        return 0;
    }

    public String imprimePre(){
        return toString();
    }

    public String imprimeSim(){
        if()
    }

    public String imprimePos(){

    }

     public int numNos(){
        
     }
}
