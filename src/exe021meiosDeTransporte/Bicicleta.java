package exe021meiosDeTransporte;

public class Bicicleta extends Veiculo {

    // Atributo
    private int numMarchas;
    private boolean bagageiro;

    // Construtor
    public Bicicleta() {
        this.numMarchas = 1;
        this.bagageiro = false;
    }

    public Bicicleta(
            String marca,
            String modelo,
            int qtdRodas,
            int velocidade,
            int numMarchas,
            boolean bagageiro) {
        super(marca, modelo, qtdRodas, velocidade);
        this.numMarchas = numMarchas;
        this.bagageiro = bagageiro;
    }

    // Leitura | Escrita
    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public boolean isBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }

    // Metodos
    public String toString() {
        return super.toString() +
                "\n| QTD Marchas:\t\t" + getNumMarchas() +
                "\n| Bagageiro:\t\t" + (isBagageiro() ? "Sim" : "Não");
    }

}
