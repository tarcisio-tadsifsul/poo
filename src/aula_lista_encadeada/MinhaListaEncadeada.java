package aula_lista_encadeada;

public class MinhaListaEncadeada<T> {
    
    // Classe interna representando o Nó
    private static class Node<T>{
        // Atributos
        T data;             // A informação armazenada, T é uma generics que permite parametrizar o tipos em classes,
                            // garantindo segurança de tipos em tempo de compilação e eliminando a necessidade de conversões (casts
        Node<T> next;       // A referência/ponteito para o próximo nó   
                            // [Objeto][P] onde [objeto] é o dado/informação e [P] é o ponteiro/referência para o próximo objeto!
                            // [Objeto][P] -> [data][next]
        
        // Construtor
        Node(T data){
            this.data = data; // dado
            this.next = null; // Por padrão, não há próximo nó ainda
                              // Quando uma classe do tipo Node for instanciada ela vai começar com next (ponteiro/referencia) como null, visto que só existe um dado/objeto na lista
        }
    }

    // Atributos da classe MinhaListaEncadeada
    private Node<T> head;   // O primeiro nó da lista do tipo Node. Se for null, a lista está vazia.
    private int totalElementos = 0; // variavel que guarda total de elementos
    
    
    /**
     * Método Adiciona um elemento no final da lista
     * @param data
     */
    public void add(T data){
        Node<T> novoNo = new Node<>(data); // Instacia um novo objeto do tipo Nó

        // Se a lista estiver vazia, o novo nó se torna a head
        if (head == null) {
            head = novoNo;    // o primeiro elemento recebe o novo dado, head é o primeiro da lista
            totalElementos++; // incrementa o total de elementor
            return;           // return depois de add objeto na primeira posição, que é o head
        }

        // Caso contrário, "caminhamos" até o último nó
        Node<T> atual = head;           // `atual` é um objeto temporário que auxilia caminhar pela lista. Ele recebe a referência do inicio da lista, o head
                                        // Porque não se pode percorrer a lista com head, caso contrario perdemos a referência do primeiro elementos
                                        // Nesse momento head e atual está apontando paara a primeira posicao da lista
                                        
        while (atual.next != null) {    // Enquanto atual.next (que é ponteiro para o próximo elemento) for for diferente de null (verdadeiro), ou seja,
                                        // enquanto ele NÃO for o último da lista
            atual = atual.next;         // percorra a lista recebendo a referência do próximo objeto da lista
        }                               // Quando chegar no fim da lista (atual.next != null é false) sai do laço while

        // Apontamos o next do último nó para o novo nó
        atual.next = novoNo;    // atual.next que agora está no ultimo objeto da lista (depois de percorrer a lista com while) recebe o novo objeto (novoNo)
                                // novoNo.next = null e novoNo.data = data 
        totalElementos++;       // incrementa o total de elementos
    }
    
    /**
     * Metodo Adiciona um elemento no início da lista (muito rápido!)
     * @param data
     */
    public void addFirst(T data){
        Node<T> novoNo = new Node<>(data);
        novoNo.next = head;     // O próximo do novo nó passa a ser a antiga head
        head = novoNo;          // head passa a ser o novo nó
        totalElementos++;       // incrementa o total de elementos
    }

    // remover o último elemento da lista
    public void remove(){}

    // remover o primeiro elemento da lista
    public void removeFirst(){}

    /**
     * Metodo Percorre a lista e imprime os valores
     * @return String
     */ 
    public String imprimir() {
        Node<T> atual = head;
        String listaDados = "";

        while (atual != null) {
            listaDados += atual.data + (atual.next != null ? " -> " : "");
            atual = atual.next; // Pula para o próximo nó
        }

        return listaDados += "\nTotal: " + totalElementos;
        // System.out.println("null");
    }
    
}
