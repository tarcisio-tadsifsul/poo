package DadosEstruturados;

public class Pedido {

    // Atributos
    static int idAux;
    private int idPedido;
    private String cliente;
    private double valorTotal;
    private int maxItens;
    private int totalItens;
    private ItemPedido itens[];

    // Construtor
    public Pedido() {
        this.idPedido = idAux++;
        this.cliente = "N/A";
        this.valorTotal = 0.0;
        this.maxItens = 0;
        this.totalItens = 0;
        this.itens = new ItemPedido[maxItens];
    };

    public Pedido(String nomeCliente, int maxItens) {
        this.idPedido = ++idAux;
        this.cliente = nomeCliente;
        this.valorTotal = 0.0;
        this.maxItens = maxItens;
        this.totalItens = 0;
        this.itens = new ItemPedido[maxItens];
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getCliente() {
        return cliente;
    }

    // Metodos
    public String adicinarItemPedido(ItemPedido item) {
        boolean itemAdicionado = false;
        if (totalItens < maxItens) {
            itens[totalItens] = item;
            totalItens++;
            itemAdicionado = true;
            this.valorTotal = somaTotalPedido();
        } else {
            itemAdicionado = false;
        }

        if (itemAdicionado) {
            return "Item adicionado no Pedido " + idPedido;
        } else {
            return "Item " + item.getNome() + " não adicionado no Pedido " + idPedido;
        }

    }

    public void removerItemPedido(String nomeItem) {
        if (totalItens > 0) {
            // loop para encontrar item no vetor
            for (int i = 0; i < totalItens - 1; i++) {
                if (itens[i].getNome().compareToIgnoreCase(nomeItem) > 0) {
                    deduzTotalPedido(itens[i].getValorUnitario());
                    itens[i] = null;
                }
            }
            // loop para reordenar itens no vetor
            for (int i = 0; i < totalItens - 1; i++) {
                if (itens[i] == null && itens[i + 1] != null) {
                    itens[i] = itens[i + 1];
                    itens[i + 1] = null;
                }
            }
            totalItens--;
            System.out.printf("Item removido do Pedido #%d!\n", idPedido);
        } else {
            System.out.printf("Item não removido o Pedido #%d!\n", idPedido);
        }

    }

    private double somaTotalPedido() {
        double somaValor = 0;
        for (ItemPedido item : itens) {
            if (item != null) {
                somaValor += item.getValorUnitario();
            }
        }
        return somaValor;
    }

    private double deduzTotalPedido(double valor) {
        double deduzValor = valor;
        this.valorTotal -= deduzValor;
        return this.valorTotal;
    }

    public String mostrarPedido() {
        String listaItens = "";
        for (ItemPedido item : itens) {
            if (item != null) {
                listaItens += item.imprimirItem() + "\n";
            }
        }
        return "\n--------------------"
                + "\nPEDIDO #" + this.idPedido + " | Cliente: " + this.cliente
                + "\n--------------------"
                + "\n" + listaItens
                + "--------------------"
                + "\nTotal Pedido: R$ " + this.valorTotal
                + "\n";
    }

}
