package aula_lista_encadeada;

public class MinhaListaEncadeada<T> {
    
    // Atributos
    private Node<T> head;   // O primeiro nó da lista do tipo Node. Se for null, a lista está vazia.
    private static int totalElementos = 0;
    
    // Classe interna representando o Nó
    private static class Node<T>{
        // Atributos
        T data;             // A informação armazenada
        Node<T> next;       // A referência para o próximo nó
        
        // Construtor
        Node(T data){
            this.data = data;
            this.next = null; // Por padrão, não há próximo nó ainda
        }
    }
    
    /**
     * Método Adiciona um elemento no final da lista
     * @param data
     */
    public void add(T data){
        Node<T> novoNo = new Node<>(data);

        // Se a lista estiver vazia, o novo nó se torna a head
        if (head == null) {
            head = novoNo;
            totalElementos++;
            return;
        }

        // Caso contrário, "caminhamos" até o último nó
        Node<T> atual = head;           // head é o primeiro nó da lista
        while (atual.next != null) {
            atual = atual.next;
        }

        // Apontamos o next do último nó para o novo nó
        atual.next = novoNo; // 
        totalElementos++;
    }
    
    /**
     * Metodo Adiciona um elemento no início da lista (muito rápido!)
     * @param data
     */
    public void addFirst(T data){
        Node<T> novoNo = new Node<>(data);
        novoNo.next = head;     // O próximo do novo nó passa a ser a antiga head
        head = novoNo;          // head passa a ser o novo nó
        totalElementos++;
    }

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
