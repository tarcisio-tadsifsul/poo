package aula_lista_encadeada;

public class MyLinkedList<T> {
    
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
    private int totalElementos; // Guarda o total de elementos da lista (removido o 'static' para ser independente por lista).
    
    // Construtor da classe myLinkedList
    public MyLinkedList(){
        this.head = null;
        this.totalElementos = 0;
    }

    // Getter | Setter
    public Node<T> getHead() {
        return head;
    }

    public int getTotalElementos() {
        return totalElementos;
    }
    
//    public void setHead(Node<T> head) {;
//        this.head = head;
//    }

//    public void setTotalElementos(int totalElementos) {
//        this.totalElementos = totalElementos;
//    }
    
    
    
    /**
     * Adiciona um elemento no final da lista
     * @param data
     */
    public void addLast(T data){
        Node<T> novoNo = new Node<>(data); // Instancia um novo objeto do tipo Nó. 
                                           // novoNo = [data][next] -> null

        // Se a lista estiver vazia, o novo nó se torna a head.
        if (head == null) {
            head = novoNo;    // A cabeça da lista recebe o novo nó e passa a ter [data][next] -> null
            totalElementos++; // Incrementa o total de elementos.
            return;           // Interrompe a execução, já que o objeto foi adicionado na primeira posição.
        }

        // Aqui poderia ser um else do if acima, para "caminharmos" até o último nó.
        
        Node<T> atual = head;           // `atual` é um ponteiro temporário que recebe o endereço de memória do head e auxilia a caminhar pela lista. Ele começa na `head`.
                                        // Porque isso? porque não podemos percorrer a lista usando a própria `head`, senão perderíamos o início da lista.
                                        
        while (atual.getNext() != null) {    // Enquanto o ponteiro do nó atual NÃO apontar para null (ou seja, não for o último)...
            atual = atual.getNext();         // ...avança para o próximo nó.
        }                                    // Quando chegar no fim da lista (atual.next == null), a condição fica falsa e ele sai do laço.

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

    /**
     * Remove o último elemento da lista
     * 
     */
    public void removeLast(){
        if (head != null){
            if (head.getNext() == null){
                head = null;
            } else {
                Node<T> atual = head;

                while (atual.getNext().getNext() != null){
                    atual = atual.getNext();
                }

                atual.setNext(null);
            }
            totalElementos--;
        }
    }

    // remover o primeiro elemento da lista
    public void removeFirst(){
        if (head != null){
            if (totalElementos == 1){
                head = null;
                totalElementos--;
            } else {
                head = head.getNext();
                totalElementos--;
            }
        }
    }

    //insere um elemento no meio da lista
    public void addMiddle(T data){
        int posicaoMeio = totalElementos / 2;
        
        if (head != null){
            Node<T> novoNo = new Node<>(data);
            Node<T> atual = head;
            int index = 1;
            
            while ( (atual.getNext() != null) && (index < posicaoMeio) ) {
                atual = atual.getNext();
                index++;
            }
            
            novoNo.setNext(atual.getNext());
            atual.setNext(novoNo);
            
            totalElementos++;
        }
        
    }
    
    // insere um elemento em posição específica da lista
    public void addPosicaoEspecifica(int posicao, T data){
        if (head != null){
            Node<T> novoNo = new Node<>(data);
            Node<T> atual = head;
            int index = 1;
            
            while ( (atual.getNext() != null) && (index < posicao - 1) ) {
                atual = atual.getNext();
                index++;
            }
            
            novoNo.setNext(atual.getNext());
            atual.setNext(novoNo);
            
            totalElementos++;
        }
    }

    //remove um elemento do meio da lista
    public void removeMiddle(){
        int posicaoMeio = totalElementos / 2;
        
        if (head != null){
            
            if (totalElementos <= 2){
                head = null;
                totalElementos--;
                return;
            }
            
            Node<T> atual = head;
            Node<T> anterior = atual;
            
            int index = 1;
            
            while ( (index < posicaoMeio) && (atual.getNext() != null) ){
                anterior = atual;
                atual = atual.getNext();
                index++;
            }
            
            anterior.setNext(atual.getNext());
            atual = null;
            totalElementos--;
        }
    }
    
    //remove um elemento em posição específica da lista
    public void removePosicaoEspecifica(int posicao){                               
            
        if (head == null){
            return;
        }

        if (posicao > totalElementos){
            return;
        }

        Node<T> atual = head;
        Node<T> anterior = atual;

        int index = 1;

        while ( (index < posicao) && (atual.getNext() != null) ){
            anterior = atual;
            atual = atual.getNext();
            index++;
        }

        anterior.setNext(atual.getNext());
        atual = null;
        totalElementos--;
    }                
    

    //verifica se um elemento esta presente na lista
    public boolean containsEl(T data){
    
        if (head != null){
            if (totalElementos == 1){               
                return data.equals(head.getData());
            }
            
            Node<T> atual = head;
            
            while (atual.getNext() != null){
                if ( data.equals(atual.getData()) ){
                    return true;
                }                
                atual = atual.getNext();
            }
        }
        
        return false;
    }

    /**
     * Percorre a lista e imprime os valores
     * @return String contendo os elementos e o tamanho da lista
     */ 
    public String imprimir() {
        Node<T> atual = head;
        String inicio = "head -> " + atual.getData() + "\n\n";
        String sinal = "";
        String ultimo = "";
        String listaDados = inicio;
        
        while (atual != null) {
            sinal = atual.getNext() != null ? " -> " : "";
            ultimo = atual.getNext() != null ? atual.getNext().getData() + "\n" : " -> null";
            
            listaDados += atual.getData() + sinal + ultimo;
            
            atual = atual.getNext(); // Pula para o próximo nó.
        }

        return listaDados + "\n\nTotal: " + this.getTotalElementos();
    }
}
