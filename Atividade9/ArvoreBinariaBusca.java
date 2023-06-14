package Atividade9;

public class ArvoreBinariaBusca {
    private NoArvoreBinaria raiz;

    public ArvoreBinariaBusca() {
    }

    public NoArvoreBinaria busca(int v){
        return busca(raiz, v);
    }

    private NoArvoreBinaria busca(NoArvoreBinaria a, int v){
        if (a==null){
            return null;
        }else{
            if (v<raiz.getInfo()){
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
        insere(raiz, v);
    }

    private NoArvoreBinaria insere(NoArvoreBinaria a, int v){
        if (a==null){
            a=new NoArvoreBinaria(v);
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
        String str=new String("");
        return ordenadorCrescente(raiz, str);
    }

    private String ordenadorCrescente(NoArvoreBinaria raiz, String str){
        if(raiz!=null){
            System.out.println("oi");
            ordenadorCrescente(raiz.getEsq(), str);
            str=str+" ";
            ordenadorCrescente(raiz.getDir(), str);
        }
        return str;
    }

}
