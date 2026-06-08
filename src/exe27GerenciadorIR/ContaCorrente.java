package exe27GerenciadorIR;

public class ContaCorrente extends Conta implements Tributavel {

    // Atributo
    private static final double TAXA_TRIBUTO = 0.01; // Taxa 1%

    // Construtor
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    // Metodos
    @Override
    public double calculaTributos() {
        return super.getSaldo() * TAXA_TRIBUTO;
    }
}
