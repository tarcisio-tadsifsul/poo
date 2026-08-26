package dadosEstruturados;

/**
 * REQUISITOS - PARTE 1
 *  [✓] Implemente uma estrutura de dados do tipo Fila (política FIFO) em Java.
 * 
 *  [✓] Utilize como dado um objeto que você deve criar, contendo alguns atributos
 *      devidamente encapsulados.
 * 
 *  [✓] A estrutura deve conter obrigatoriamente os métodos:
 *      - enqueue para inserção no fim da fila
 *      - dequeue para remoção do início da fila
 *      - printQueue para exibição linear dos dados armazenados.
 * 
 * REQUISITOS - PARTE 2
 *  [?] Implemente uma funcionalidade que torne a estrutura de dados dinâmica. Ou seja, se o usuário tentar incluir um dado com o vetor em sua capacidade máxima,
 *      o sistema deve comportar essa necessidade, aumentando automaticamente a capacidade de armazenamento do array em 50% do tamanho anterior.
 * 
 *  [?] No método principal, crie um menu para testar a implementação.
 * 
 * TESTES:
 *  [✓] Teste a implementação dentro do método main da classe principal,
 *      realizando todas as operações disponibilizadas.
 * 
 * DICA:
 *  # Utilize o método de impressão a cada operação para analisar o resultado.
 *  # Siga as convenções de código, nomenclatura e sintaxe padrão da linguagem Java.
 * 
 */


public class ItemPedido {

    // Atributos
    private String nome;
    private double valorUnitario;

    // Construtores
    public ItemPedido() {
        this.nome = "N/D";
        this.valorUnitario = 0.0;
    }

    public ItemPedido(String nome, double valorUnt) {
        this.nome = nome;
        this.valorUnitario = valorUnt;
    }

    // Getters | Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nomeItem) {
        this.nome = nomeItem;
    }

    public double getValorUnitario() {
        return this.valorUnitario;
    }

    public void setvalorUnitario(String valor) {
        this.nome = valor;
    }

    // Metodos
    public String imprimirItem() {
        return "Item: " + this.nome + " R$ " + this.valorUnitario;
    }

}
