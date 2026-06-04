package exe22FaturaLoja;

public class ItemFatura {

    // Atributos
    private String nome; // nome do item
    private String descricao;
    private int qtdComprada; // quantidade comprada de um item
    private double preco; // preço por item

    // Construtores
    public ItemFatura() {
        this.nome = "Sem Nome";
        this.descricao = "Sem Descricao";
        this.qtdComprada = 0;
        this.preco = 0.0;
    }

    public ItemFatura(String nome, String descricao, int qtdComprada, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        // setters para garantir que a validação funcione no construtor
        setQtdComprada(qtdComprada);
        setPreco(preco);
    }

    // Leitura | Escrita
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        if (qtdComprada > 0) {
            this.qtdComprada = qtdComprada;
        } else {
            this.qtdComprada = 0;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            this.preco = 0.0;
        }
    }

    // Metodos
    public double calcularTotalItem() {
        return getPreco() * getQtdComprada();
    }

    public String mostrarItem() {
        return "\n| " + getNome() +
                " | " + getPreco() +
                " | " + getQtdComprada() +
                " | " + calcularTotalItem();
    }
}
