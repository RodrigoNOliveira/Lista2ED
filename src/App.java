import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        


        
        // ################### QUESTÃO 3 #######################
                    //Classes Usadas: FilaComPrioridade e Contato

/*
        FilaComPrioridade<Contato> fila = new FilaComPrioridade<>();

        int opcao = 0;

        do {
            System.out.println();
            System.out.println("###############################");
            System.out.println();
            System.out.println("Agenda de contatos");
            System.out.println();
            System.out.println("-------MENU-------");
            System.out.println("1- Adicionar Contato");
            System.out.println("2- Ver lista de contatos");
            System.out.println("3- Remover primeiro contato");
            System.out.println("4- Ver primeiro contato da lista");
            System.out.println("0- Sair da agenda");
            System.out.println();
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.println("#######################");
                    System.out.println();
                    System.out.println("Adicionar contato");
                    System.out.println();
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o telefone: ");
                    String telefone = scanner.nextLine();
                    fila.enfileirar(new Contato(nome, telefone));
                    System.out.println();
                    System.out.println("Contato inserido");
                    break;

                case 2:
                    System.out.println();
                    System.out.println("#######################");
                    System.out.println();
                    System.out.println("Lista de contatos: ");
                    System.out.println();
                    System.out.println(fila.toString());
                    break;

                case 3:
                    System.out.println();
                    System.out.println("#######################");
                    System.out.println();
                    System.out.println("Contato removido: \n" + fila.desenfileirar());
                    break;

                case 4:
                    System.out.println();
                    System.out.println("#######################");
                    System.out.println();
                    System.out.println("Primeiro contato:  \n" + fila.espiar());
                    break;

                case 0:
                    System.out.println();
                    System.out.println("#######################");
                    System.out.println();
                    System.out.println("Agenda encerrada");
                    System.out.println();
                    System.out.println("#######################");
                    break;

                default:
                    System.out.println();
                    System.out.println("#######################");
                    System.out.println();
                    System.out.println("Opção inválida!");

            }
        } while (opcao != 0);
*/


        // ################### QUESTÃO 4 #######################
                    //Classes Usadas: Pilha e Livro

/* 
        Pilha<Livro> pilha = new Pilha<Livro>(20);
            
           for (int i = 0; i < 3; i++) {
            System.out.println();
             System.out.print("Nome do livro: ");
             String nome = scanner.nextLine();
             System.out.print("isbn: ");
             String isbn = scanner.nextLine();
             System.out.print("Digite o ano de lançamento: ");
             int ano = scanner.nextInt();
             scanner.nextLine();
             System.out.print("Digite o nome do autor: ");
             String autor = scanner.nextLine();
             Livro l= new Livro(nome, isbn, ano, autor);
             System.out.println();
             pilha.empilha(l);
           }
            System.out.println();
            System.out.println("LIVROS DA PILHA: \n" + pilha);
            System.out.println();
            System.out.println("A PILHA ESTÁ VAZIA: " + pilha.estaVazia());
            System.out.println();
            System.out.println("TAMANHO DA PILHA: "+ pilha.tamanho());
            System.out.println();
            System.out.println("LIVRO DO TOPO: " + pilha.topo());
            System.out.println();
            System.out.println("LIVRO DESEMPILHADO: " + pilha.desempilha());
            System.out.println();
            System.out.println("LIVROS DA PILHA: \n" + pilha);
            System.out.println();
            
*/

        // ################### CODIGO PARA QUESTÕES 5 #######################
                   //Classes Usadas: No e ListaLigada


/* 
        ListaLigada lista = new ListaLigada();
        No novoElemento = new No("A", null);
        lista.adicionar(novoElemento);
        lista.adicionar(new No("B", null));
        lista.adicionar(new No("C", null));
        lista.adicionar(new No("D", null));
        novoElemento = new No("E", null);
        lista.adicionar(2, novoElemento);
        lista.imprimir();
        lista.remove(4);
        lista.imprimir();
        lista.adicionar(new No("Z", null));
        System.out.println(lista.contem(novoElemento));
        lista.remove(2);
        System.out.println(lista.contem(novoElemento));
        novoElemento = new No("E", null);
        lista.adicionar(2, novoElemento);
        System.out.println(lista.contem(novoElemento));
        lista.imprimir();
*/



        // ######### TESTE QUESTÃO 6 ###########


           //Classes Usadas: Nos e ListaDuplamenteLigada

/*
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
        Nos novoElemento = new Nos("A", null, null);
        lista.adicionar(novoElemento);
        lista.adicionar(new Nos("B", null, null));
        lista.adicionar(new Nos("C", null, null));
        lista.adicionar(new Nos("D", null, null));
        novoElemento = new Nos("E", null, null);
        lista.adicionar(novoElemento);
        lista.adicionar(2, new Nos("Z", null, null));
        lista.print();
        System.out.println();
        System.out.println("teste questão");
        System.out.println();
        lista.print();
        lista.removerUltimo();
        lista.print();
        lista.adicionar(new Nos("OLOKO", null, null));
        lista.print();

*/
        
        // ######### TESTE QUESTÃO 7 ###########
                    //Classes Usadas: FilaDinamica e NoFila

        FilaDinamica fila = new FilaDinamica();
        NoFila novoElemento = new NoFila("A");
        fila.enfileirar(novoElemento);
        novoElemento = new NoFila("B", null, null);
        fila.enfileirar(novoElemento);
        fila.enfileirar(new NoFila("C"));
        fila.enfileirar(new NoFila("D", null, null));
        fila.enfileirar(new NoFila("E"));
        fila.imprimir();
        // NoFila removido = fila.desenfileirar();
        // //fila.imprimir();
        // System.out.println("Elemento removida da fila foi: " + removido.getData());
        // removido = fila.desenfileirar();
        // System.out.println("Elemento removida da fila foi: " + removido.getData());
        fila.inverterOrdem();



           // ################## QUESTÃO 8 ####################
                    //Classes Usadas: No6 e PilhaDinamica6



        //    PilhaDinamica6 pilha = new PilhaDinamica6();

        //    System.out.println("Digite seu nome: ");
        //    String palavra = scanner.nextLine();
        //    for (int i = 0; i < palavra.length(); i++) {
        //        char letra = palavra.charAt(i);
        //        pilha.empilhar(new No6(letra));
              
        //    }
        //    String inverso = "";
           
        //    while (pilha.getTopo() != null){
        //        // char x = pilha.getTopo();
           
        //         inverso = inverso + pilha.desempilhar().getData();
               
               
        //    }
        //    System.out.println("Seu nome é: " + palavra);
        //    System.out.println("Seu nome ao contrario é: " + inverso);





    }
}
