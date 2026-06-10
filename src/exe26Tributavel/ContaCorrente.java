package exe26Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

    // Atributo
    private final double TAXA_TRIBUTO; // Taxa 1%

    // Construtor
    public ContaCorrente(double saldo) {
        super(saldo);
        this.TAXA_TRIBUTO = 0.01;
    }

    // Metodos
    @Override
    public double calculaTributos() {
        if (super.obterSaldo() > 0){
            return super.getSaldo() * TAXA_TRIBUTO;

        }
        return 0.0;
    }
}
