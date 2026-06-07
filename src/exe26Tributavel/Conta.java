package exe26Tributavel;

public abstract class Conta {

    // Atributos
    private double saldo;
    public static final int OP_SAQUE = 1;
    public static final int OP_DEPOSITO = 2;

    // Leitura | Escrita
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Construtores
    public Conta() {
        this.saldo = 0.0;
    }

    public Conta(double saldo) {
        setSaldo(saldo);
    }

    // Metodos
    public void obterSaldo() {
        System.out.println("Saldo Atual:\tR$ " + getSaldo());
    }

    public void sacar(double valorSaque) {
        double aux = getSaldo();
        aux -= valorSaque;
        setSaldo(aux);
        imprimirOperacao(OP_SAQUE, valorSaque);
    }

    public void depositar(double valorDeposito) {
        double aux = getSaldo();
        aux += valorDeposito;
        setSaldo(aux);
        imprimirOperacao(OP_DEPOSITO, valorDeposito);
    }

    public void imprimirOperacao(int op, double valor) {
        if (op == 1) {
            System.out.println("Saque:\t\tR$ " + valor);
        }
        if (op == 2) {
            System.out.println("Deposito:\tR$ " + valor);
        }
    }

}
