public class ListaDuplamenteLigada {

    private Nos cabeca;
    private Nos cauda;

    //metodo que adiciona no final da lista
    public void adicionar(Nos novoElemento){
        if(this.cabeca == null){
            this.cabeca = novoElemento;
            this.cauda = this.cabeca;
        }else{
            this.cauda.setProx(novoElemento);
            novoElemento.setAnt(this.cauda);
            this.cauda = novoElemento;
        }
    }

    // ############# QUESTÃO 6 ############

    public void removerUltimo(){
        Nos aux = this.cabeca;
        while(aux.getProx() != null){
           aux =  aux.getProx();  
            if (aux.getProx().getProx() == null){
                aux.setProx(null);
                cauda = aux;
            } 
        }
    }
     // ####################################

//metodo adiciona onde informamos a posição da inserção
    public void adicionar(int posicao, Nos novoElemento){
        Nos aux = cabeca;
        int i = 0;

        //mova o nó para a posição de inserção
        while(aux.getProx() != null && i < posicao-1){
            aux = aux.getProx();
            i++;
        }

        novoElemento.setProx(aux.getProx());
        aux.setProx(novoElemento);
        novoElemento.setAnt(aux);
        novoElemento.getProx().setAnt(novoElemento);
    }

    public void remove(int posicao){
        Nos aux = cabeca;
        int i = 0;
        //Mova o nó para o nó anterior que deseja excluir
        while (aux.getProx() != null && i <posicao-1){
            aux = aux.getProx();
            i++;
        }

        Nos temp = aux.getProx();
        aux.setProx((aux.getProx()).getProx());
        aux.getProx().setAnt(aux);
        temp.setProx(null);
        temp.setAnt(null);

        if(aux.getProx() == null){
            cauda = aux;
        }
    }

    public void print(){
        Nos aux = this.cabeca;
        //No fim = null;
        //imprimir do início ao fim
        while(aux != null){
            String dado = aux.getDado();
            System.out.print(dado + "->");
            //fim = aux;
            aux = aux.getProx();
        }
        System.out.print("Fim\n\n");
         aux = cauda;
        while(aux != null){
            String dado = aux.getDado();
            System.out.print(dado + "->");
            aux = aux.getAnt();
        }
        System.out.print("Inicio\n\n");

    }

}
