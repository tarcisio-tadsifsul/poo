package aula_lista_encadeada;

// MESMA CLASSE MinhaListaEncadeada, MAS COM COMENTARIOS AJUSTADOS:
public class myLinkedList<T> {
    
    // Classe interna representando o Nó
    private static class Node<T>{
        // Atributos
        private T data;             // A informação armazenada. 'T' é um tipo genérico (Generics) que permite parametrizar a classe,
                            // garantindo segurança de tipos em tempo de compilação e eliminando a necessidade de conversões (casts).
        private Node<T> next;       // A referência/ponteiro para o próximo nó.   
                            // Visualmente: [Objeto][P], onde [Objeto] é o dado/informação e [P] é o ponteiro para o próximo nó!
                            // [data][next] -> [data][next] -> null

        // Modificadores de acesso
        public T getData(){
            return data;
        }

        /* public void setData(T data){
            this.data = data;
        } */

        public Node<T> getNext(){
            return next;
        }

        public void setNext(Node<T> next){
            this.next = next;
        }
        
        // Construtor
        Node(T data){
            this.data = data; // Recebe o dado.
            this.next = null; // Por padrão, não há próximo nó ainda.
                              // Quando um Node é instanciado, ele começa com o next (ponteiro) apontando para null, 
                              // pois ele é o último (ou único) elemento naquele momento.
        }
    }

    // Atributos da classe myLinkedList
    private Node<T> head;           // O primeiro nó da lista. Se for null, significa que a lista está vazia.
    private int totalElementos = 0; // Guarda o total de elementos da lista (removido o 'static' para ser independente por lista).
    
    
    /**
     * Adiciona um elemento no final da lista
     * @param data
     */
    public void add(T data){
        Node<T> novoNo = new Node<>(data); // Instancia um novo objeto do tipo Nó. 
                                           // novoNo = [data][next] -> null

        // Se a lista estiver vazia, o novo nó se torna a head.
        if (head == null) {
            head = novoNo;    // A cabeça da lista recebe o novo nó e passa a ter [data][next] -> null
            totalElementos++; // Incrementa o total de elementos.
            return;           // Interrompe a execução, já que o objeto foi adicionado na primeira posição.
        }

        // Caso contrário (poderia ser um else do if acima), "caminhamos" até o último nó.
        Node<T> atual = head;           // `atual` é um ponteiro temporário que auxilia a caminhar pela lista. Ele começa na `head`.
                                        // Não podemos percorrer a lista usando a própria `head`, senão perderíamos o início da lista.
                                        
        while (atual.getNext() != null) {    // Enquanto o ponteiro do nó atual NÃO apontar para null (ou seja, não for o último)...
            atual = atual.getNext();         // ...avança para o próximo nó.
        }                               // Quando chegar no fim da lista (atual.next == null), a condição fica falsa e ele sai do laço.

        // Agora, apontamos o next do último nó para o novo nó.
        atual.setNext(novoNo);   // O nó que antes era o último agora aponta para o `novoNo`.
                                // O `novoNo` já tem seu próprio next apontando para null por causa do construtor.
        totalElementos++;       // Incrementa o total de elementos.
    }
    
    /**
     * Adiciona um elemento no início da lista (operação de tempo constante, muito rápida!)
     * @param data
     */
    public void addFirst(T data){
        Node<T> novoNo = new Node<>(data);  // Instancia um novo objeto do tipo Nó. 
                                            // novoNo = [data][next] -> null
        novoNo.setNext(head);   // O próximo do novo nó passa a apontar para a antiga head.
        head = novoNo;          // A head oficial da lista passa a ser este novo nó.
        totalElementos++;       // Incrementa o total de elementos.
    }

    // remover o último elemento da lista
    public void remove(){}

    // remover o primeiro elemento da lista
    public void removeFirst(){}

    //insere um elemento em posição específica da lista
    public void addMiddle(){}

    //remove um elemento em posição específica da lista
    public void removeMiddle(){}

    //verifica se um elemento esta presente na lista
    public void containsEl(){}

    /**
     * Percorre a lista e imprime os valores
     * @return String contendo os elementos e o tamanho da lista
     */ 
    public String imprimir() {
        Node<T> atual = head;
        String listaDados = "";

        while (atual != null) {
            listaDados += atual.getData() + (atual.getNext() != null ? " -> " : "");
            atual = atual.getNext(); // Pula para o próximo nó.
        }

        return listaDados + "\nTotal: " + totalElementos;
    }
}
