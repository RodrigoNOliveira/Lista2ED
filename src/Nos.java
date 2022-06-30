public class Nos {

    private String dado;

    private Nos ant;

    private Nos prox;

    public Nos(String dado, Nos ant, Nos prox) {
        this.dado = dado;
        this.ant = ant;
        this.prox = prox;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public Nos getAnt() {
        return ant;
    }

    public void setAnt(Nos ant) {
        this.ant = ant;
    }

    public Nos getProx() {
        return prox;
    }

    public void setProx(Nos prox) {
        this.prox = prox;
    }
}
