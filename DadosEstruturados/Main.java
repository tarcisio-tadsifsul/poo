package DadosEstruturados;

/**
 * Implemente uma estrutura de dados do tipo Fila (política FIFO) em Java.
 * Utilize como dado um objeto que você deve criar, contendo alguns atributos devidamente encapsulados.
 * 
 * A estrutura deve conter obrigatoriamente os métodos:
 * - enqueue para inserção no fim da fila,
 * - dequeue para remoção do início da fila e printQueue para exibição linear dos dados armazenados.
 * 
 * Teste a implementação dentro do método main da classe principal, realizando todas as operações disponibilizadas.
 * 
 * DICA: utilize o método de impressão a cada operação para analisar o resultado.
 * Siga as convenções de código, nomenclatura e sintaxe padrão da linguagem Java.
 * 
 */

public class Main {
    public static void main(String[] args) {

        ItemPedido item1 = new ItemPedido("Xis Salada", 24.90);
        ItemPedido item2 = new ItemPedido("Hot Dog", 18.90);
        ItemPedido item3 = new ItemPedido("Batata Frita", 14.90);

        System.out.println(item1.imprimirItem());
        System.out.println(item2.imprimirItem());
        System.out.println(item3.imprimirItem());
        
    }
}
