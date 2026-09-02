package dadosEstruturados;

/**
 * ---
 * REQUISITOS - PARTE 1
 * 
 * [✓] Implemente uma estrutura de dados do tipo Fila
 * (política FIFO) em Java.
 *
 * [✓] Utilize como dado um objeto que você deve criar, contendo alguns
 * atributos devidamente encapsulados.
 *
 * [✓] A estrutura deve conter obrigatoriamente os métodos: - enqueue para
 * inserção no fim da fila - dequeue para remoção do início da fila - printQueue
 * para exibição linear dos dados armazenados.
 *
 * ---
 * REQUISITOS - PARTE 2
 * 
 * [✓] Implemente uma funcionalidade que torne a estrutura de dados dinâmica.
 * Ou seja, se o usuário tentar incluir um dado com o vetor em sua capacidade máxima,
 * o sistema deve comportar essa necessidade, aumentando automaticamente
 * a capacidade de armazenamento do array em 50% do tamanho anterior.
 *
 * [?] No método principal, crie um menu para testar a implementação.
 *
 * ---
 * REQUISITOS - PARTE 3
 * 
 * [] Implemente uma funcionalidade que verifique duplicidade na estrutura de dados
 * impedindo novas inserções em caso de dados repetidos.
 * 
 * [] Acrescente ao menu do usuário uma opção que exiba uma mensagem para a pesquisa
 * de um determinado elemento (se está presente ou ausente na estrutura).
 * 
 * [] Adicione uma funcionalidade que retorne o index para um elemento pesquisado. 
 * 
 * ---
 * TESTES:
 * 
 * [?] Teste a implementação dentro do método main da classe principal,
 * realizando todas as operações disponibilizadas.
 *
 * DICA:
 * # Utilize o método de impressão a cada operação para analisar o resultado.
 * # Siga as convenções de código, nomenclatura e sintaxe padrão da linguagem Java.
 *
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ItemPedido item1 = new ItemPedido("Xis Salada", 24.90);
        ItemPedido item2 = new ItemPedido("Hot Dog", 18.90);
        ItemPedido item3 = new ItemPedido("Batata Frita", 14.90);
        ItemPedido item4 = new ItemPedido("Refrigerante", 6.20);
        ItemPedido item5 = new ItemPedido("Agua", 3.50);
        
//
        FilaPedidos f1 = new FilaPedidos();

        System.out.println("\nIniciar Pedidos:\n--------------------");
        
        System.out.println("| Informe o nome do cliente:");
        String nomeCliente = sc.next();
        if (f1.verificarPedidoJaExiste(nomeCliente)){
            // aqui agora precisa instanciar o pedido
        }

    }
}
