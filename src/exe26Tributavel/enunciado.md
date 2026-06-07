Nosso banco precisa tributar dinheiro de alguns bens que nossos clientes
possuem. Para isso, vamos criar um sistema para isso.

                     +----------------------+"
                     | <<interface>>        |"
                     | Tributavel           |"
                     +----------------------+"
                     | + calcularTributos() |"
                     +----------------------+"
                                ^
                                : (implements)
                 +--------------+-------------------+
                 |                                  |
                 v                                  v
        +----------------+               +----------------------+"
        | Conta          |               | SeguroDeVida         |"
        +----------------+               +----------------------+"
        | + saldo        |               | + taxa               |"
        +----------------+               +----------------------+"
                 ^
                 |
        +--------+-------+ (herança)
        |                |
        v                v

+---------------+ +---------------+
| ContaPoupanca | | ContaCorrente |
+---------------+ +---------------+

1. Crie uma `interface` Tributavel que possui o método `calculaTributos()`,
   que retorna um `double`.

2. As classes `ContaCorrente` e `ContaPoupanca` herdam de uma classe `Conta`.
   Essa classe `Conta` possu:
   - Atributo: `saldo` do tipo double;
   - Métodos:
     - `sacar(double)` que alteram o saldo da conta.
     - `depositar(double)` que alteram o saldo da conta.
     - `obterSaldo()` que retorna o saldo da conta.

3. Alguns bens são tributáveis e outros não:
   - `ContaPoupanca` não é tributável,
   - `ContaCorrente` precisa pagar 1% da conta
   - `SeguroDeVida` tem uma taxa fixa de 42 reais.

4. Vamos criar uma classe `TestaTributavel` com um método `main`
   para testar o nosso exemplo.
