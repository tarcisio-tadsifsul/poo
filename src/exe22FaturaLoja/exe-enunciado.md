# Fatura Loja de Suprimentos de Informática

## Enunciado

- Crie uma classe em Java chamada `Fatura` para uma loja de suprimentos de informática.

---

- A classe deve conter quatro variáveis:
  - número (String),
  - descrição (String),
  - quantidade comprada de um item (int)
  - preço por item (double).

---

- A classe deve ter um construtor e um método get e set para cada variável de instância.

---

- Forneça um método chamado getTotalFatura que:
  - calcula o valor da fatura e depois retorna o valor como um double.
  - Se o valor não for positivo, ele deve ser configurado como 0.
  - Se o preço por item não for positivo, ele deve ser configurado como 0.0.

---

- Escreva um aplicativo de teste chamado `FaturaTeste` (em outro arquivo) que demonstra as capacidades da classe `Fatura`.

## Adicional

Até agora, a sua classe Fatura estava se comportando, na verdade, como um "Item da Fatura" (ou ItemFatura), porque ela guarda o preço e a quantidade de um único produto (ex: Memória RAM).

Agora, para criar uma fatura com vários produtos, precisamos separar as responsabilidades em duas classes:

- `ItemFatura` (Antiga classe Fatura): representa o produto, a quantidade dele e o preço unitário.

- `Fatura` (A nova classe agregadora): não tem mais preço nem quantidade próprios. Possui um vetor (ou lista) de ItemFatura, o número da fatura, o cliente e calcula o total somando todos os itens.

## Exemplo de implementação:

### Classe ItemFatura

```java
package exe22FaturaLoja;

public class ItemFatura {

    // Atributos
    private String nome; // nome do item
    private String descricao;
    private int qtdComprada; // quantidade comprada de um item
    private double preco; // preço por item

    // Construtores
    public ItemFatura() {
        this.nome = "Sem Nome";
        this.descricao = "Sem Descricao";
        this.qtdComprada = 0;
        this.preco = 0.0;
    }

    public ItemFatura(String nome, String descricao, int qtdComprada, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        // setters para garantir que a validação funcione no construtor
        setQtdComprada(qtdComprada);
        setPreco(preco);
    }

    // Leitura | Escrita
    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        if (qtdComprada > 0) {
            this.qtdComprada = qtdComprada;
        } else {
            this.qtdComprada = 0;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            this.preco = 0.0;
        }
    }

    // Metodos
    public double calcularTotalItem() {
        return getPreco() * getQtdComprada();
    }

    public String mostrarItem() {
        return "\n| " + getnome() +
                " | " + getPreco() +
                " | " + getQtdComprada() +
                " | " + calcularTotalItem();
    }
}
```

### Classe Fatura

```java
package exe22FaturaLoja;

public class Fatura {

    // Atributos
    private String numeroFatura;
    private ItemFatura[] itens; // O vetor de objetos!
    private int contadorItens; // Controla quantos itens já foram adicionados

    // Construtores
    public Fatura() {
        this.numeroFatura = "0000";
        this.contadorItens = 0;
        this.itens = new ItemFatura[10];
    }

    public Fatura(String numeroFatura, int maxItens) {
        this.numeroFatura = numeroFatura;
        this.itens = new ItemFatura[maxItens]; // Inicializa o vetor com o tamanho máximo
        this.contadorItens = 0;
    }

    // Leitura | Escrita
    public String getNumeroFatura() {
        return numeroFatura;
    }

    public void setNumeroFatura(String numeroFatura) {
        this.numeroFatura = numeroFatura;
    }

    // Metodos
    public void adicionarItem(ItemFatura item) {
        if (contadorItens < itens.length) {
            this.itens[contadorItens] = item;
            contadorItens++;
        } else {
            System.out.println("[ERRO] Atingido numero máximo de itens para essa fatura!");
        }
    }

    public double calculaTotalFatura() {
        double totalFatura = 0.0;
        for (int i = 0; i < contadorItens; i++) {
            totalFatura += itens[i].calcularTotalItem();
        }
        return totalFatura;
    }

    public String agruparItens() {
        String itensDaFatura = "";
        for (int i = 0; i < itens.length; i++) {
            if (itens[i] != null) {
                itensDaFatura += itens[i].mostrarItem();
            }
        }
        return itensDaFatura;
    }

    public String gerarFatura() {
        return "\n-------------------------------"
                + "\n| FATURA LOJA XYZ"
                + "\n| Numero: " + getNumeroFatura()
                + "\n|------------------------------"
                + "\n| ITENS DA FATURA"
                + this.agruparItens()
                + "\n| -----------------------------"
                + "\n| TOTAL FATURA:\tR$ " + calculaTotalFatura()
                + "\n-------------------------------";
    }

}
```

### Classe FaturaTeste

```java
package exe22FaturaLoja;

public class FaturaTeste {
    public static void main(String[] args) {

        Fatura fatura1 = new Fatura("0001", 10);

        ItemFatura item1 = new ItemFatura(
                "Mouse",
                "Mouse Gamer",
                1,
                59.99);

        fatura1.adicionarItem(item1);

        ItemFatura item2 = new ItemFatura(
                "Teclado",
                "Teclado Mecanico",
                1,
                89.99);

        fatura1.adicionarItem(item2);

        System.out.println(fatura1.gerarFatura());
    }
}
```
