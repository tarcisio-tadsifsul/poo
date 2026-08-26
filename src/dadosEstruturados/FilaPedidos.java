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


package dadosEstruturados;

public class FilaPedidos {

    // Atributos
    private Pedido fila[];
    private int capacidade;
    private int totalPedidos;

    // Construtor
    public FilaPedidos(int capacidade) {
        this.capacidade = capacidade;
        this.totalPedidos = 0;
        this.fila = new Pedido[capacidade];
    }

    // Metodos

    /**
     * Metodo enqueue para inserção no fim da fila
     * @param pedido
     * @return
     */
    public boolean receberPedido(Pedido pedido) {

        if (totalPedidos < capacidade) {
            fila[totalPedidos] = pedido;
            int idPedidoRecebido = fila[totalPedidos].getIdPedido(); // Guarda em `idPedidoRecebido` o id do último item da fila antes de incrementar, para usar nas mensagens
            totalPedidos++;

            System.out.println("[OK] Pedido #" + idPedidoRecebido + " Recebido com Sucesso!");
            return true;
        } else {
            System.out.println(
                    "\n[ATENCAO] Pedido #" + pedido.getIdPedido() + " Não Recebido!" +
                            "\n[AVISO] Capacidade Maxima de " + capacidade + " Pedidos Atingida!");
            return false;
        }
    }

    /**
     * Metodo dequeue para remoção do início da fila
     * @return boolean
     */
    public boolean realizarPedido() {

        // Guarda em `idPedidoRealizado` o id do primeiro item da fila antes de remover para usar nas mensagens
        int idPedidoRealizado = fila[0].getIdPedido(); 

        if (totalPedidos > 0) {

            for (int i = 0; i < totalPedidos - 1; i++) {
                fila[i] = fila[i + 1];
            }
            fila[totalPedidos - 1] = null;
            totalPedidos--;

            System.out.println("[OK] Pedido #" + idPedidoRealizado + " realizado!");
            return true;

        } else {
            System.out.println("[AVISO] Nenhum pedido na Fila");
            return false;
        }
    }

    /**
     * printQueue para exibição linear dos dados armazenados
     * @return String
     */
    public String mostrarFilaPedidos() {
        String listaPedidos = "";
        for (Pedido pedido : fila) {
            if (pedido != null) {
                listaPedidos += pedido.mostrarPedido() + "\n";
            }
        }
        return listaPedidos;
    }

}
