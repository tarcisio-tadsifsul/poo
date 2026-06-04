package exe22FaturaLoja;

public class Fatura {

    // Atributos
    private String numeroFatura;
    private ItemFatura[] itens; // O vetor de objetos!
    private int contadorItens; // Controla quantos itens já foram adicionados

    // Construtores
    public Fatura() {
        this.numeroFatura = "0000";
        this.contadorItens = 0;
        this.itens = new ItemFatura[10];
    }

    public Fatura(String numeroFatura, int maxItens) {
        this.numeroFatura = numeroFatura;
        this.itens = new ItemFatura[maxItens]; // Inicializa o vetor com o tamanho máximo
        this.contadorItens = 0;
    }

    // Leitura | Escrita
    public String getNumeroFatura() {
        return numeroFatura;
    }

    public void setNumeroFatura(String numeroFatura) {
        this.numeroFatura = numeroFatura;
    }

    // Metodos
    public void adicionarItem(ItemFatura item) {
        if (contadorItens < itens.length) {
            this.itens[contadorItens] = item;
            contadorItens++;
        } else {
            System.out.println("[ERRO] Atingido numero máximo de itens para essa fatura!");
        }
    }

    public double calculaTotalFatura() {
        double totalFatura = 0.0;
        for (int i = 0; i < contadorItens; i++) {
            totalFatura += itens[i].calcularTotalItem();
        }
        return totalFatura;
    }

    public String agruparItens() {
        String itensDaFatura = "";
        for (int i = 0; i < contadorItens; i++) {
            itensDaFatura += itens[i].mostrarItem();
        }
        return itensDaFatura;
    }

    public String gerarFatura() {
        return "\n-------------------------------"
                + "\n| FATURA LOJA XYZ"
                + "\n| Numero: " + getNumeroFatura()
                + "\n|------------------------------"
                + "\n| ITENS DA FATURA"
                + this.agruparItens()
                + "\n| -----------------------------"
                + "\n| TOTAL FATURA:\tR$ " + calculaTotalFatura()
                + "\n-------------------------------";
    }

}
