public class FilaDinamica {

    //Funcionamento da estrutura sempre o primeiro a entrar será o primeiro a sair.
    // FIFO -> First in, First out

    private NoFila cabeca;
    private NoFila cauda;
    private int tamanho; //tamanho da fila


        //################## QUESTÃO 7 ####################

    public void inverterOrdem(){
        NoFila aux = this.cabeca;
        aux = cauda;
        while(aux != null){
            String dado = aux.getData();
            System.out.print(dado);
            if (aux.getAnt()!=null){
                System.out.print("->");
            }
            aux = aux.getAnt();
        }
    }

        //#################################################




    //estrutura de dados sempre insere no final da final, ou seja na cauda
    public void enfileirar(NoFila novoElemento){
        //se a fila estiver vazia
        if(cabeca == null){
            cabeca = novoElemento; //adicionar o elemento na cabeça
            cauda = cabeca;
        }else{
            novoElemento.setProx(cauda.getProx());
            novoElemento.setAnt(cauda);
            cauda.setProx(novoElemento);
            cauda = novoElemento;
        }
        //tamanho = tamanho+1
        tamanho++;
    }

    //pegue o primeiro elemento e remove da fila.
    public NoFila desenfileirar(){
        NoFila aux = cabeca;
        if(aux == null){
            return null;
        }

        cabeca = cabeca.getProx();
        cabeca.setAnt(null);
        aux.setAnt(null);
        aux.setProx(null);
        tamanho--;
        return aux;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void imprimir(){
        System.out.print("Cabeça ");
        NoFila aux = cabeca;
        while (aux != null ){
            System.out.print(aux.getData() + " <- ");
            aux = aux.getProx();
        }
        System.out.print("Cauda\n\n\n");
    }

}
