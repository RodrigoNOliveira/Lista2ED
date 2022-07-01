public class PilhaDinamica6 {

    private No6 topo;
    private int tamanho; //o tamanho da pilha;

    //adiciona um elemento ao topo da pilha (push)
    public void empilhar(No6 novoElemento){
        if(topo == null){
            topo = novoElemento;
        }else{
            novoElemento.setProx(topo);
            topo = novoElemento;
        }
        tamanho++;
    }

    public No6 getTopo() {
        return topo;
    }

    public void setTopo(No6 topo) {
        this.topo = topo;
    }

    //remove o topo da pilha
    public No6 desempilhar(){
        if(topo == null){
            return null;
        }
        No6 aux = topo;
        topo = topo.getProx();
        aux.setProx(null);
        tamanho--;
        return aux;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void imprimir(){

        No6 aux = topo;
        while(aux != null){
            System.out.print(aux.getData() + " -> ");
            aux = aux.getProx();
        }
        System.out.println("Fim\n\n\n");
    }
}
