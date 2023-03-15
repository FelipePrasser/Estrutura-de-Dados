import java.util.IdentityHashMap;

public class NoLista {
    private int info;
    private NoLista prox;
    
    public NoLista(int info) {
        this.info = info;
    }
    public NoLista(int info, NoLista prox) {
        this.info = info;
        this.prox = prox;
    }

    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    public NoLista getProx() {
        return prox;
    }
    public void setProx(NoLista prox) {
        this.prox = prox;
    }
}
