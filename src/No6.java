public class No6 {

    private Character data;
    private No6 prox;

    public No6 (char data){
        this.data = data;
    }
    public No6 (char data, No6 prox){
        this.data = data;
        this.prox = prox;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public No6 getProx() {
        return prox;
    }

    public void setProx(No6 prox) {
        this.prox = prox;
    }
}

