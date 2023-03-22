public class Lista{
    private NoLista primeiro;

    public Lista(){
        this.primeiro=null;
    }

    public NoLista getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoLista primeiro) {
        this.primeiro = primeiro;
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
    
    public boolean igual(Lista l){
        NoLista elemento1=primeiro;
        NoLista elemento2=l.getPrimeiro();
        while(elemento1.getProx()!=null || elemento2.getProx()!=null){
            if(elemento1.getInfo()==elemento2.getInfo()){
                elemento1=elemento1.getProx();
                elemento2=elemento2.getProx();
            }else{
                return false;
            }
        }
        return true;
    }

    public void imprimeRecursivo(){
        imprimeRecursivoAux(primeiro);
    }

    private void imprimeRecursivoAux(NoLista l){
        NoLista noAtual=primeiro;
        System.out.println("A lista é:");
        while (noAtual!=null) {
            System.out.println(noAtual.getInfo()); 
            noAtual=noAtual.getProx();     
        }
    }

    public void retiraRecursivo(int v){
        retiraRecursivoAux(primeiro, v);
    }

    private NoLista retiraRecursivoAux(NoLista l, int v){
        NoLista anterior=null;
        NoLista elemento=primeiro;
        while (elemento!=null && elemento.getInfo()!=v) {
            anterior=elemento;
            elemento=elemento.getProx();
        }
        if (elemento==null){
            String info="Não foi encontrado o elemento para retirar";
            System.out.println(info);
            return null;
        }
        if (anterior==null){
            this.primeiro=elemento.getProx();
        }else{
            anterior.setProx(elemento.getProx());
        }
        System.out.println("Foi retirado o valor da lista;");
        return null;
    }

    public boolean igualRecursivo(Lista l){
        return igualRecursivoAux(primeiro, l.getPrimeiro());
    }

    private boolean igualRecursivoAux(NoLista l1, NoLista l2){
        NoLista elemento1=l1;
        NoLista elemento2=l2;
        while(elemento1.getProx()!=null || elemento2.getProx()!=null){
            if(elemento1.getInfo()==elemento2.getInfo()){
                elemento1=elemento1.getProx();
                elemento2=elemento2.getProx();
            }else{
                return false;
            }
        }
        return true;
    }
}