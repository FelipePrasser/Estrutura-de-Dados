package Atividade9;

public class ArvoreBinariaBusca {
    private NoArvoreBinaria raiz;

    public ArvoreBinariaBusca() {
        raiz=null;
    }

    public NoArvoreBinaria busca(int v){
        return busca(raiz, v);
    }

    private NoArvoreBinaria busca(NoArvoreBinaria a, int v){
        if (a==null){
            return null;
        }else{
            if (v<a.getInfo()){
                return busca(a.getEsq(), v);
            }else{
                if (v>a.getInfo()){
                    return busca(a.getDir(), v);
                }else{
                    return a;
                }
            }
        }
    }

    public void insere(int v){
        raiz=insere(raiz, v);
    }

    private NoArvoreBinaria insere(NoArvoreBinaria a, int v){
        if (a==null){
            a=new NoArvoreBinaria(v);
            a.setInfo(v);
            a.setEsq(null);
            a.setDir(null);
        }else{
            if (v<a.getInfo()){
                a.setEsq(insere(a.getEsq(), v));
            }else{
                a.setDir(insere(a.getDir(), v));
            }
        }
        return a;
    }

    public void retira(int v){
        raiz=retira(raiz, v);
    }

    private NoArvoreBinaria retira(NoArvoreBinaria a, int v){
        if (a==null){
            return null;
        }else{
            if (v<a.getInfo()){
                a.setEsq(retira(a.getEsq(), v));
            }else{
                if (v>a.getInfo()){
                    a.setDir(retira(a.getDir(), v));
                }else{
                    if(a.getEsq()==null && a.getDir()==null){
                        a=null;
                    }else{
                        if(a.getEsq()==null){
                            a=a.getDir();
                        }else{
                            if(a.getDir()==null){
                                a=a.getEsq();
                            }else{
                                NoArvoreBinaria p=a.getEsq();
                                while(p.getDir()!=null){
                                    p=p.getDir();
                                }
                                a.setInfo(p.getInfo());
                                p.setInfo(v);
                                a.setEsq(retira(a.getEsq(), v));
                            }
                        }
                    }
                }
            }
        }
        return a;
    }

    @Override
    public String toString() {
        return ordenadorCrescente(raiz);
    }

    private String ordenadorCrescente(NoArvoreBinaria raiz){
        String str="";
        if(raiz!=null){
            str=str+ordenadorCrescente(raiz.getEsq());
            str=str+raiz.getInfo()+" ";
            str=str+ordenadorCrescente(raiz.getDir());
        }
        return str;
    }

    public String toStringDecrescente(){
        return ordenadorDecrescente(raiz);
    }

    private String ordenadorDecrescente(NoArvoreBinaria raiz){
        String str="";
        if(raiz!=null){
            str=str+ordenadorDecrescente(raiz.getDir());
            str=str+raiz.getInfo()+" ";
            str=str+ordenadorDecrescente(raiz.getEsq());
        }
        return str;
    }

    public int somaFolhas(){
        return somaFolhas(raiz);
    }

    private int somaFolhas(NoArvoreBinaria raiz){
        int ladoEsq, ladoDir;
        if(raiz==null){
            return 0;
        }if(raiz.getEsq()==null && raiz.getDir()==null){
            return 1;
        }
        ladoEsq=somaFolhas(raiz.getEsq());
        ladoDir=somaFolhas(raiz.getDir());
        return (ladoEsq+ladoDir);
    }

    
}
