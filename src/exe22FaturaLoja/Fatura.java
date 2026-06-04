package exe22FaturaLoja;

public class Fatura {

    // Atributos
    private String numero; // numero/id do item
    private String descricao;
    private int qtdComprada; // quantidade comprada de um item
    private double preco; // preço por item
    // private int[] totalItems;

    // Construtores
    public Fatura() {
        this.numero = "0000";
        this.descricao = "Sem descricao";
        this.qtdComprada = 0;
        this.preco = 0.0;
    }

    public Fatura(String numero, String descricao, int qtdComprada, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.qtdComprada = qtdComprada;
        this.preco = preco;
    }

    // Leitura | Escrita
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Metodos
    /**
     * getTotalFatura que calcula o valor da fatura e retorna o valor como um
     * double.
     * Se o valor não for positivo, ele deve ser configurado como 0.
     * Se o preço por item não for positivo, ele deve ser configurado como 0.0.
     */
    public double getTotalFatura() {

    }

}
