package DadosEstruturados;

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

    // inserir no fim
    public boolean receberPedido(Pedido pedido) {

        if (totalPedidos < capacidade) {
            fila[totalPedidos] = pedido;
            int idPedidoRecebido = fila[totalPedidos].getIdPedido();
            totalPedidos++;

            System.out.println("[OK] Pedido #" + idPedidoRecebido + " Recebido com Sucesso!");
            return true;
        } else {
            System.out.println(
                    "\n[ATENÇÃO] Pedido #" + pedido.getIdPedido() + " Não Recebido!" +
                            "\n[AVISO] Capacidade Maxima de " + capacidade + " Pedidos Atingida!");
            return false;
        }
    }

    // remover inicio
    public boolean realizarPedido() {

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
