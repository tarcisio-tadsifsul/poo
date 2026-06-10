# Resolucao do exercicio 26 - Tributavel

## interface Tributavel

```java
package exe26Tributavel;

public interface Tributavel {

    double calculaTributos();

}
```

## Classe Abstrata Conta

```java
package exe26Tributavel;

public abstract class Conta {

    // Atributos
    private double saldo;

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
    public String obterSaldo() {
        return "Saldo Atual:\tR$ " + getSaldo();
    }

    public void sacar(double valorSaque) {
        double aux = getSaldo();
        aux -= valorSaque;
        setSaldo(aux);
        System.out.println("Saque:\t\tR$ " + aux);
    }

    public void depositar(double valorDeposito) {
        double aux = getSaldo();
        aux += valorDeposito;
        setSaldo(aux);
        System.out.println("Deposito:\tR$ " + aux);
    }

}
```

## Classe Concreta ContaCorrente

```java
package exe26Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

    // Atributo
    private double taxa = 0.01; // Taxa 1%

    // Construtor
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    // Metodos
    @Override
    public double calculaTributos() {
        return super.getSaldo() * this.taxa;
    }
}
```

## Classe Concreta ContaPoupanca

```java
package exe26Tributavel;

public class ContaPoupanca extends Conta {

    // Construtor
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

}
```

## Classe SeguroDeVida

```java
package exe26Tributavel;

public class SeguroDeVida implements Tributavel {

    // Atributos
    private double taxa = 42.00;

    // Construtor
    public SeguroDeVida() {
    }

    // Metodos
    @Override
    public double calculaTributos() {
        return taxa;
    }

}
```
