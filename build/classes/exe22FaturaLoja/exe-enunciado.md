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
