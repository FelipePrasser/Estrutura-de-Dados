public class Lista{
    private NoLista primeiro;

    public Lista(){
        this.primeiro=null;
    }

    public void insere(int v){
        NoLista no=new NoLista(v);
        no.setInfo(v);
        no.setProx(primeiro);
        primeiro=no;
    }

    public void imprime(){
        NoLista noAtual=this.primeiro;
        while (noAtual!=null) {
            System.out.println(noAtual.getInfo()); 
            noAtual=noAtual.getProx();     
        }
    }
    
    public boolean vazia(){
        if(primeiro==null){
            return true;
        }else{
            return false;
        }
    }
   
    public NoLista busca(int v){
        NoLista no=primeiro;
        while (no!=null) {
            if (no.getInfo()==v){
                break;
            }else{
                no=no.getProx();
            }
        }
        return no;
    }

    public int comprimento(){
        int tamanho=1;
        if(vazia()==true){
            return 0;
        }
        NoLista no=primeiro;
        while (no.getProx()!=null) {
            no=no.getProx();
            tamanho++;
        }
        return tamanho;
    }

    public NoLista ultimo(){
        NoLista no=primeiro;
        boolean aux=true;
        while (aux==true){
            if(no.getProx()==null){
                aux=false;
            }else{
                no=no.getProx();
            }
        }
        return no;
    }

    public void retira(int v){
        NoLista anterior=null;
        NoLista elemento=primeiro;
        while (elemento!=null && elemento.getInfo()!=v) {
            anterior=elemento;
            elemento=elemento.getProx();
        }
        if (elemento==null){
            return;
        }
        if (anterior==null){
            this.primeiro=elemento.getProx();
        }else{
            anterior.setProx(elemento.getProx());
        }
    }

    public void libera(){
        primeiro=null;
    }

    public void insereFim(int v){
        ultimo().setProx(new NoLista(v)); 
    }
}