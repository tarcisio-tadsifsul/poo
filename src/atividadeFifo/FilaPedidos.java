package atividadeFifo;

public class FilaPedidos {

    // Atributos
    private Pedido fila[];
    private Pedido auxFila[];
    private int capacidade;
    private int totalPedidos;
    private int idPedidoRecebido;
    private int idPedidoRealizado;

    // Construtor
    public FilaPedidos() {
        this.capacidade = 10;
        this.totalPedidos = 0;
        this.fila = new Pedido[capacidade];
    }

    // Getters | Setters
    public int getTotalPedidos() {
        return this.totalPedidos;
    }

    // Metodos

    /**
     * Verifica se existe pedido para o cliente pelo nome
     * 
     * @param nome
     * @return boolean
     */
    public boolean verificarPedidoJaExiste(String nome) {
        if (!nome.equalsIgnoreCase("") && fila.length > 0) {
            for (int i = 0; i < totalPedidos; i++) {
                if (fila[i] != null && fila[i].getCliente().equalsIgnoreCase(nome)) {
                    return true; // se ja tem pedido com nome do cliente
                }
            }
        }
        return false;
    }

    /**
     * Aumenta a dimensão do vetor de pedidos
     *
     */
    private void aumentaVetorPedidos() {
        int aumentaCapacidade = capacidade + Math.round(capacidade * 1.5f);
        auxFila = new Pedido[aumentaCapacidade];

        for (int i = 0; i < capacidade; i++) {
            if (fila[i] != null) {
                auxFila[i] = fila[i];
            }
        }

        capacidade = aumentaCapacidade;
        fila = auxFila;
    }

    /**
     * Metodo enqueue para inserção no fim da fila
     * 
     * @param pedido
     * @return boolean
     */
    public boolean adicionarPedidoNaFila(Pedido pedido) {
        if (totalPedidos == capacidade) {
            this.aumentaVetorPedidos();
        }

        if (totalPedidos < capacidade) {

            fila[totalPedidos] = pedido;
            // Guarda em `idPedidoRecebido` o id do último item da fila antes de
            // incrementar, para usar nas mensagens
            idPedidoRecebido = fila[totalPedidos].getIdPedido();

            totalPedidos++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo dequeue para remoção do início da fila
     * 
     * @return boolean
     */
    public boolean realizarPedidoDaFila() {

        // Guarda em `idPedidoRealizado` o id do primeiro item da fila antes de remover
        // para usar nas mensagens
        idPedidoRealizado = fila[0].getIdPedido();

        if (totalPedidos > 0) {

            for (int i = 0; i < totalPedidos - 1; i++) {
                fila[i] = fila[i + 1];
            }
            fila[totalPedidos - 1] = null;
            totalPedidos--;

            return true;

        } else {

            return false;
        }
    }

    /**
     * Remove um pedido especifico da fila e reordena pedidos
     * 
     * @return boolean
     */
    // Ideia de recurso para implementar

    /**
     * Pesquisar um pedido pelo ID
     * 
     * @return int
     */

    public int pesquisarPedidoID(int idPesquisado) {

        if (totalPedidos > 0) {

            for (int i = 0; i < totalPedidos; i++) {
                if (fila[i].getIdPedido() == idPesquisado) {
                    return i + 1;
                }
            }
        }
        return -1;
    }

    /**
     * printQueue para mostrar os dados de pedidos
     * 
     * @return String
     */
    public String mostrarFilaPedidos() {
        if (this.totalPedidos == 0) {
            return "0";
        }
        String listaPedidos = "";
        for (Pedido pedido : fila) {
            if (pedido != null) {
                listaPedidos += pedido.mostrarPedidoCompleto() + "\n";
            }
        }
        return listaPedidos;
    }

    public String mostraPedido(int idPedido) {
        return fila[idPedido - 1].mostrarPedidoCompleto();
    }

}
