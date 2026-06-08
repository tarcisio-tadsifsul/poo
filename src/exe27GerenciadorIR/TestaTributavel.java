package exe27GerenciadorIR;

public class TestaTributavel {
    public static void main(String[] args) {
        // Gerenciado
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

        // Poupança
        ContaPoupanca poupanca = new ContaPoupanca(0);

        System.out.println("\nConta Poupança");
        poupanca.obterSaldo();
        poupanca.depositar(500.62);
        poupanca.obterSaldo();
        poupanca.sacar(200.87);
        poupanca.obterSaldo();

        // Conta Corrente 01
        ContaCorrente cc01 = new ContaCorrente(0);

        System.out.println("\nConta Corrente");
        cc01.obterSaldo();
        cc01.depositar(500);
        cc01.sacar(230.80);
        cc01.obterSaldo();
        System.out.println("Tributavel:\tR$ " + cc01.calculaTributos());
        gerenciador.adicionar(cc01);

        // Conta Corrente 02
        ContaCorrente cc02 = new ContaCorrente(2000);

        System.out.println("\nConta Corrente");
        cc02.obterSaldo();
        cc02.depositar(500);
        cc02.sacar(627.60);
        cc02.obterSaldo();
        System.out.println("Tributavel:\tR$ " + cc02.calculaTributos());
        gerenciador.adicionar(cc02);

        // Seguro
        SeguroDeVida seguro = new SeguroDeVida();
        System.out.println(
                "\nTaxa do Seguro: R$ " +
                        seguro.calculaTributos());
        gerenciador.adicionar(seguro);

        // Tributos
        System.out.println("\n\nTotal Tributos:\t R$" + gerenciador.getTotalTributos());
    }
}
