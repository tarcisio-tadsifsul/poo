package DadosEstruturados;

public class Pedido {

    // Atributos
    static int idAux = 0;
    private int idPedido;
    private String cliente;
    private double valorTotal;
    private int maxItens;
    private int totalItens;
    private ItemPedido itens[];

    // Construtor
    public Pedido(){
        this.idPedido = idAux++;
        this.cliente = "N/A";
        this.valorTotal = 0.0;
        this.maxItens = 0;
        this.totalItens = 0;
        this.itens = new ItemPedido[maxItens];
    };

    public Pedido(String nomeCliente, int maxItens){
        this.idPedido = idAux++;
        this.cliente = nomeCliente;
        this.valorTotal = calcularTotalPedido();
        this.maxItens = maxItens;
        this.totalItens = 0;
        this.itens = new ItemPedido[maxItens];
    }

    // Metodos
    private double calcularTotalPedido(){
        double somaValor = 0;
        for (ItemPedido item : itens) {
            somaValor += item.getValorUnitario();
        }
        return somaValor;
    }

}
