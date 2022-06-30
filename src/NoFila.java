public class NoFila {

    private String data;
    private NoFila ant;
    private NoFila prox;

    public NoFila(String data) {
        this.data = data;
    }

    public NoFila(String data, NoFila ant, NoFila prox) {
        this.data = data;
        this.ant = ant;
        this.prox = prox;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public NoFila getAnt() {
        return ant;
    }

    public void setAnt(NoFila ant) {
        this.ant = ant;
    }

    public NoFila getProx() {
        return prox;
    }

    public void setProx(NoFila prox) {
        this.prox = prox;
    }
}
