package dadosEstruturados;

public class FilaPedidos {

    // Atributos
    private Pedido fila[];
    private Pedido auxFila[];
    private int capacidade;
    private int totalPedidos;

    // Construtor
    public FilaPedidos() {
        this.capacidade = 2;
        this.totalPedidos = 0;
        this.fila = new Pedido[capacidade];
    }

    // Metodos
    public boolean verificarPedidoJaExiste(String nome){
        if (!nome.equalsIgnoreCase("") && fila.length > 0){
            for (int i = 0; i < totalPedidos; i++) {                
                if (fila[i] != null){
                    return fila[i].getCliente().equalsIgnoreCase(nome); // retorna true ou false
                }                
            }
        }
        return false;
    }

    /**
     * Metodo enqueue para inserção no fim da fila
     * @param pedido
     * @return
     */
    public boolean adicionarPedidoNaFila(Pedido pedido) {
        if (totalPedidos == capacidade){
            this.aumentaVetorPedidos();
        }

        if (totalPedidos < capacidade) {
            fila[totalPedidos] = pedido;
            int idPedidoRecebido = fila[totalPedidos].getIdPedido(); // Guarda em `idPedidoRecebido` o id do último item da fila antes de incrementar, para usar nas mensagens
            totalPedidos++;

            System.out.println("[OK] Pedido #" + idPedidoRecebido + " Recebido com Sucesso!");
            return true;
        } else {
            System.out.println("\n[ATENCAO] Pedido #" + pedido.getIdPedido() + " Não Recebido!");
            return false;
        }
    }
    
    /**
     * Aumenta a dimensão do vetor de pedidos
     *
     */
    private void aumentaVetorPedidos(){
        int aumentaCapacidade = capacidade + Math.round(capacidade * 1.5f);
        auxFila = new Pedido[aumentaCapacidade];
        
        for (int i = 0; i < capacidade; i++) {
            if (fila[i] != null){
                auxFila[i] = fila[i];
            }
        }
        
        capacidade = aumentaCapacidade;
        fila = auxFila;
    }

    /**
     * Metodo dequeue para remoção do início da fila
     * @return boolean
     */
    public boolean removerPedidoDaFila() {

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
        if (this.totalPedidos == 0){
            return "\n[AVISO] Nenhum pedido na Fila";
        }
        String listaPedidos = "";
        for (Pedido pedido : fila) {
            if (pedido != null) {
                listaPedidos += pedido.mostrarPedido() + "\n";
            }
        }
        return listaPedidos;
    }

}
