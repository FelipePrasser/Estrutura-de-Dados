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

    public int folhas(NoArvoreBinaria no){
        if (no==null){
            return 0;
        }if (no.getEsq()==null && no.getDir()==null){
            return 1;
        }else{
            return folhas(no.getEsq())+folhas(no.getDir());
        }
    }

    public String imprimePre(){
        return toString();
    }

    public String imprimeSim(NoArvoreBinaria no){
        String string=new String("");
        if (no==null)
            return string="";
        string=string+'<';
        if(no!=null){
            string=string+imprimeSim(no.getEsq());
            string=string+no.getInfo();
            string=string+imprimeSim(no.getDir());
        }
        string=string+'>';
        return string;
    }

    public String imprimePos(NoArvoreBinaria no){
        String string=new String("");
        string=string+'<';
        if(no!=null){
            string=string+imprimePos(no.getEsq());
            string=string+imprimePos(no.getDir());
            string=string+no.getInfo();
        }
        string=string+'>';
        return string;
    }

    public NoArvoreBinaria getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvoreBinaria raiz) {
        this.raiz = raiz;
    }

    public int numNos(NoArvoreBinaria no){
        if(no == null){
            return 0;
        }
        else {
            return( 1 + numNos(no.getEsq()) + numNos(no.getDir()));
        }
    }

    public int altura(NoArvoreBinaria no){
        if (no==null || (no.getEsq()==null && no.getDir()==null)){
            return 0;
        }
        else{
            if (altura(no.getEsq())>=altura(no.getDir())){
                return (1+altura(no.getEsq()));
            }else{
                return (1+altura(no.getDir()));
            }
        }
    }

}
