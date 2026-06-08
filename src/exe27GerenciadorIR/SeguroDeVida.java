package exe27GerenciadorIR;

public class SeguroDeVida implements Tributavel {

    // Atributos
    private static final double TAXA_TRIBUTO = 42.00;

    // Construtor
    public SeguroDeVida() {
    }

    // Metodos
    @Override
    public double calculaTributos() {
        return TAXA_TRIBUTO;
    }

}
