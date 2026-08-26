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
 *  [?] Implemente uma funcionalidade que torne a estrutura de dados dinâmica.
 *      Ou seja, se o usuário tentar incluir um dado com o vetor em sua capacidade máxima,
 *      o sistema deve comportar essa necessidade, aumentando automaticamente
 *      a capacidade de armazenamento do array em 50% do tamanho anterior.
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
public class Main {
    public static void main(String[] args) {
        
        ItemPedido item1 = new ItemPedido("Xis Salada", 24.90);
        ItemPedido item2 = new ItemPedido("Hot Dog", 18.90);
        ItemPedido item3 = new ItemPedido("Batata Frita", 14.90);
        ItemPedido item4 = new ItemPedido("Refrigerante", 6.20);
        ItemPedido item5 = new ItemPedido("Agua", 3.50);
        
//
        FilaPedidos f1 = new FilaPedidos(4);

        System.out.println("\nIniciar Pedidos:\n--------------------");

        Pedido p1 = new Pedido("Cris");
        p1.adicinarItemPedido(item1);
        p1.adicinarItemPedido(item2);
        p1.adicinarItemPedido(item3);
        p1.adicinarItemPedido(item4);
        System.out.println(p1.mostrarPedido());

//        f1.receberPedido(p1);
        
//
//        Pedido p2 = new Pedido("Carlos");
//        p2.adicinarItemPedido(item2);
//        p2.adicinarItemPedido(item3);
//        p2.adicinarItemPedido(item4);
//        f1.receberPedido(p2);
//
//        Pedido p3 = new Pedido("Maria");
//        p3.adicinarItemPedido(item3);
//        p3.adicinarItemPedido(item5);
//        f1.receberPedido(p3);
//
//        Pedido p4 = new Pedido("Joao");
//        p4.adicinarItemPedido(item1);
//        p4.adicinarItemPedido(item2);
//        p4.adicinarItemPedido(item3);
//        p4.adicinarItemPedido(item4);
//        p4.adicinarItemPedido(item5);
//        f1.receberPedido(p4);
//
//        System.out.println("\nFILA PEDIDOS\n=======================\n" + f1.mostrarFilaPedidos());
//
//        f1.realizarPedido();
//        f1.realizarPedido();
//
//        System.out.println(
//                "\nFILA PEDIDOS"
//                        + "\n=======================\n"
//                        + f1.mostrarFilaPedidos());
//
//        Pedido p5 = new Pedido("Lucas");
//        p5.adicinarItemPedido(item1);
//        p5.adicinarItemPedido(item2);
//        f1.receberPedido(p5);
//
//        Pedido p6 = new Pedido("Sara");
//        p6.adicinarItemPedido(item1);
//        p6.adicinarItemPedido(item2);
//        p6.adicinarItemPedido(item4);
//        f1.receberPedido(p6);
//
//        Pedido p7 = new Pedido("Jessica");
//        p7.adicinarItemPedido(item3);
//        p7.adicinarItemPedido(item5);
//        f1.receberPedido(p7);

    }
}
