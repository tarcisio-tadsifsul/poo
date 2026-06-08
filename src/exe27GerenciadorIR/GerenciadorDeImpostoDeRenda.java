package exe27GerenciadorIR;

public class GerenciadorDeImpostoDeRenda {

    private double totalTributos = 0.0;

    public double getTotalTributos() {
        return this.totalTributos;
    }

    public void adicionar(Tributavel bem) {
        this.totalTributos += bem.calculaTributos();
    }
}
