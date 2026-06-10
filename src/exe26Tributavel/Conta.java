package exe26Tributavel;

import java.util.Locale;

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
    public double obterSaldo() {
        return this.saldo;
    }

    public void sacar(double valorSaque) {
        if (valorSaque > 0){
            double aux = getSaldo();
            aux -= valorSaque;
            setSaldo(aux);
            imprimirOperacao(OP_SAQUE, valorSaque);
        }        
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0){
            double aux = getSaldo();
            aux += valorDeposito;
            setSaldo(aux);
            imprimirOperacao(OP_DEPOSITO, valorDeposito);
        }
    }

    public void imprimirOperacao(int op, double valor) {
        if (op == 1) {
            System.out.println("Saque:\t\t" + formatarValor(valor));
        }
        if (op == 2) {
            System.out.println("Deposito:\t" + formatarValor(valor));
        }
    }

    public String formatarValor(double valor){
        return String.format(Locale.forLanguageTag("pt-BR"), "R$ %.2f", valor);
    }

}
