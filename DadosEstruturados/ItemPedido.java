package DadosEstruturados;

public class ItemPedido {

    // Atributos
    private String nome;
    private double valorUnitario;
    
    // Construtor
    public ItemPedido(){
        this.nome = "N/D";
        this.valorUnitario = 0.0;
    }

    public ItemPedido(String nome, double valorUnt){
        this.nome = nome;
        this.valorUnitario = valorUnt;
    }

    // Getters | Setters
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nomeItem){
        this.nome = nomeItem;
    }

    public double getValorUnitario(){
        return this.valorUnitario;
    }

    public void setvalorUnitario(String valor){
        this.nome = valor;
    }

    // Metodos
    public String imprimirItem(){
        return "Item: " + this.nome + " | R$ " + this.valorUnitario;
    }

}
