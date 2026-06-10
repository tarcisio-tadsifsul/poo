package exe26Tributavel;

public class TestaTributavel {
    public static void main(String[] args) {

        // Poupança
        ContaPoupanca poupanca = new ContaPoupanca(0);

        System.out.println("\nConta Poupança");
        poupanca.obterSaldo();
        poupanca.depositar(500.62);
        poupanca.obterSaldo();
        poupanca.sacar(200.87);
        poupanca.obterSaldo();

        // Conta Corrente
        ContaCorrente cc = new ContaCorrente(624.87);

        System.out.println("\nConta Corrente");
        cc.obterSaldo();
        cc.depositar(500);
        System.out.println("Tributavel:\t" + cc.calculaTributos());
        cc.sacar(230.80);
        cc.obterSaldo();
        System.out.println("Tributavel:\t" + cc.calculaTributos());

        SeguroDeVida seguro = new SeguroDeVida();
        System.out.println(
                "\nTaxa do Seguro: " +
                        seguro.calculaTributos());
    }
}
