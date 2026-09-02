package dadosEstruturados;

public class Pedido {

    // Atributos
    static int idAux;
    private int idPedido;
    private String cliente;
    private double valorTotal;
    private int maxItens;
    private int totalItens;
    private ItemPedido itens[];
    private ItemPedido auxItens[];
    static String nomeObj;

    // Construtores
    public Pedido() {
        this.idPedido = idAux++;
        this.cliente = "N/A";
        this.valorTotal = 0.0;
        this.maxItens = 3;
        this.totalItens = 0;
        this.itens = new ItemPedido[maxItens];
    }

    public Pedido(String nomeCliente, int id) {
        this.idPedido = id;
        this.cliente = nomeCliente;
        this.valorTotal = 0.0;
        this.maxItens = 2;
        this.totalItens = 0;
        this.itens = new ItemPedido[maxItens];
    }

    // Getters
    public int getIdPedido() {
        return idPedido;
    }

    public String getCliente() {
        return cliente;
    }

    // Metodos
    
    /**
     * Metodo para criar o pedido
     * 
     */
    public void criarPedido(String nomeCliente){
        if (!nomeCliente.equalsIgnoreCase("")){
            ++idAux;
            nomeObj = "PED00" + idAux;
            Pedido nomeObj = new Pedido(nomeCliente, idAux);            
        } else {
            System.out.println("[ERRO] O PEDIDO PARA ESSE CLIENTE JÁ EXISTE!");
        }
    }
    
    /**
     * Adiciona um item no final do vetor itens e retorna uma uma String
     * (mensagem sucesso/erro)
     *
     * @param item
     * @return String com mensagem de sucesso/erro
     */
    public void adicinarItemPedido(ItemPedido item) {
        boolean itemAdicionado = false;

        if (totalItens == maxItens) {
            this.aumentaVetorItens();
        }

        if (totalItens < maxItens) {
            itens[totalItens] = item;
            totalItens++;
            this.valorTotal = somaTotalPedido();
            itemAdicionado = true;           
        } else {
            itemAdicionado = false;
        }

        // Mensagem Sucesso|Erro
        if (itemAdicionado) {
            System.out.println("Item adicionado no Pedido #" + idPedido);
        } else {
            System.out.println("Item " + item.getNome() + " não adicionado no Pedido #" + idPedido);
        }

    }

    /**
     * Aumenta a dimensão do vetor de itens
     * 
     */
    private void aumentaVetorItens() {
        //int aumentaMaxItens = maxItens * 2;
        int aumentaMaxItens = maxItens + Math.round(maxItens * 1.5f);
        auxItens = new ItemPedido[aumentaMaxItens];
        
        for (int i = 0; i < maxItens; i++) {
            if (itens[i] != null){
                auxItens[i] = itens[i];                
            }
        }
        maxItens = aumentaMaxItens;
        itens = auxItens;
    }

    /**
     * Remove um item no pedido, reordena o vetor para não ter posições null no
     * meio do vetor e retorna uma uma String (mensagem sucesso/erro)
     *
     * @param nomeItem
     */
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

    /**
     * Calcula o valor total do pedido quando um item é adicionado ao pedido
     *
     * @return double
     */
    private double somaTotalPedido() {
        double somaValor = 0;
        for (ItemPedido item : itens) {
            if (item != null) {
                somaValor += item.getValorUnitario();
            }
        }
        return somaValor;
    }

    /**
     * Calcula o valor total do pedido quando um item é removido do pedido
     *
     * @param valor
     * @return double
     */
    private double deduzTotalPedido(double valor) {
        double deduzValor = valor;
        this.valorTotal -= deduzValor;
        return this.valorTotal;
    }

    /**
     * Mostra pedido com itens
     *
     * @return String
     */
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
