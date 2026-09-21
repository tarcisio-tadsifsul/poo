# Desafio: Locadora de Veículos

## Crie uma superclasse Veiculo

- Atributos: marca (String), modelo (String), diaria (double).

- Construtor padrão e completo.

- Método toString().

## Crie uma subclasse Carro (que herda de Veiculo)

- Atributos:
  - static int auxId,
  - id (int, auto-incrementado),
  - categoria (String - ex: SUV, Sedan),
  - vetor acessorios (String[]) que suporta no máximo 3 acessórios (ex: "Ar Condicionado", "GPS").

- Métodos:
  - adicionarAcessorio(String acessorio): boolean
  - removerAcessorio(String nomeAcessorio): boolean (lembre-se de puxar a fila e tratar os nulls!).

Crie a classe Main para testar a criação de 2 carros, adicionar acessórios, remover e exibir os dados.
