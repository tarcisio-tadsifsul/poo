# Instruções da Linguagem Java

O básico da linguagem Java inclui regras de nomenclatura, modificadores de acesso, tipos de retorno, estrutura de classes e objetos, herança e implementação de interfaces. A seguir estão algumas das principais regras e convenções para escrever código Java.

    // Atributos

    // Leitura | Escrita

    // Construtores

    // Metodos

## Regra para nome de pacotes, classes, métodos e variáveis:

- **Pacotes**: devem ser escritos em letras minúsculas e usar pontos para separar os níveis (ex: `com.exemplo.pacote`);

- **Classes**: devem começar com letra maiúscula e usar camel case (ex: `MinhaClasse`);

- **Atributos e variáveis**: devem começar com letra minúscula e usar camel case (ex: `minhaVariavel`, `meuAtributo`);

- **Construtores**: devem ter o mesmo nome da classe e não possuem tipo de retorno (ex: `public MinhaClasse() { }`);

- **Métodos**: devem começar com letra minúscula e usar camel case (ex: `meuMetodo`);

- **Constantes**: devem ser escritas em letras maiúsculas e usar underscores para separar as palavras (ex: `MINHA_CONSTANTE`);

- **getters e setters**: devem seguir a convenção de nomeação `getNomeDoAtributo` para getters e `setNomeDoAtributo` para setters (ex: `getNome()`, `setNome(String nome)`);

- Evite usar palavras reservadas do Java como nomes de pacotes, classes, métodos ou variáveis (ex: `int`, `class`, `public`, etc.);

---

## Modificador de Acesso:

- `public`: método ou atributo pode ser acessado de qualquer lugar.
- `private`: método ou atributo só pode ser acessado dentro da própria classe.
- `abstract`: usado para indicar que uma classe ou um método está incompleto por definição, servindo como um "molde" ou "modelo" para outras classes herdarem.
- `protected`: método ou atributo pode ser acessado dentro do mesmo pacote e por subclasses.

## Tipo de Retorno:

- `void`: método não retorna nenhum valor.
- `int`: método retorna um valor inteiro.
- `double`: método retorna um valor de ponto flutuante.
- `String`: método retorna uma sequência de caracteres.
- `boolean`: método retorna um valor booleano (true ou false).

---

## Para criar uma classe em Java, você pode usar a seguinte estrutura básica:

    ```java
    public class NomeDaClasse {
        // Atributos (variáveis de instância)
        private TipoDoAtributo nomeDoAtributo;

        // Construtor
        public NomeDaClasse(TipoDoAtributo nomeDoAtributo) {
            this.nomeDoAtributo = nomeDoAtributo;
        }

        // Getters e Setters
        public TipoDoAtributo getNomeDoAtributo() {
            return nomeDoAtributo;
        }
        public void setNomeDoAtributo(TipoDoAtributo nomeDoAtributo) {
            this.nomeDoAtributo = nomeDoAtributo;
        }

        // Métodos (funções)
        public void nomeDoMetodo() {
            // Código do método
        }

        // Método sobreescrito (exemplo de toString)
        @Override
        public String toString() {
            return "NomeDaClasse{" +
                    "nomeDoAtributo=" + nomeDoAtributo +
                    '}';
    }
    ```

---

## Para instaciar um objeto de uma classe, você pode usar a seguinte sintaxe:

    ```java
    NomeDaClasse nomeDoObjeto = new NomeDaClasse(parametrosDoConstrutor);
    ```

## Para criar um método que retorna um valor, você pode usar a seguinte sintaxe:

    ```java
    public TipoDeRetorno nomeDoMetodo() {
        // Código do método
        return valorDeRetorno;
    }
    ```

## Para vetores em Java, de um tipo específico de classe, você pode usar a seguinte sintaxe:

    ```java
    TipoDaClasse[] nomeDoVetor = new TipoDaClasse[tamanhoDoVetor];
    ```

---

## Para extender uma classe, você pode usar a palavra-chave `extends`:

    ```java
    public class SubClasse extends SuperClasse {
        // Código da subclasse
    }
    ```

## Para criar interfaces em Java, você pode usar a seguinte sintaxe:

    ```java
    public interface NomeDaInterface {
        // Métodos da interface (sem corpo)
        TipoDeRetorno nomeDoMetodo();
    }
    ```

## Para implementar uma interface, você pode usar a palavra-chave `implements`:

    ```java
    public class NomeDaClasse implements NomeDaInterface {
        // Código da classe
    }
    ```

## Tipos de Relacionamentos em Java

A estrutura dos relacionamentos funciona como uma árvore hierárquica na UML (Linguagem de Modelagem Unificada).

### 1. Os Tipos de Associação

A Associação é o relacionamento genérico "um objeto usa/conhece outro". Ela se divide em dois tipos específicos com base no nível de acoplamento (dependência de vida) entre os objetos:

- `Agregação` ("Tem um"): É uma associação fraca. Os objetos existem de forma independente. Se a classe "pai" for destruída, o objeto "filho" continua existindo.

Exemplo: Departamento e Funcionario. Se o departamento de TI fechar, os funcionários continuam existindo no sistema.

- `Composição` ("É composto por"): É uma associação forte. Existe uma relação de dependência existencial. Se o objeto "pai" for destruído, o objeto "filho" é destruído junto.

Exemplo: Pedido e ItemPedido. Se você deletar o pedido, os itens dentro dele deixam de fazer sentido e são deletados junto.

### 2. Generalização (Herança)

É o famoso relacionamento de "É um". É usado quando uma classe filha herda atributos e métodos de uma superclasse (mãe/pai).

Exemplo: Gerente é um Funcionario. Cachorro é um Animal.Em Java, implementamos isso usando a palavra-chave extends.

### 3. Dependência

É o relacionamento mais fraco de todos. Acontece quando uma classe usa temporariamente outra classe, mas não a guarda como um atributo fixo.

Exemplo: Um método de relatório que recebe um Scanner ou uma Data como parâmetro para fazer um cálculo rápido dentro do método e depois "descarta".

Em Java: A classe B é usada apenas como parâmetro de método ou variável local dentro da classe A.

### Resumo dos Relacionamentos em POO

| Relacionamento      | Conceito                               | Nível de Ligação          | Como identificar em Java            |
| :------------------ | :------------------------------------- | :------------------------ | :---------------------------------- |
| **Generalização**   | `"É um"`                               | `Muito Forte (Estrutural)`| `class Gerente extends Funcionario` |
| **Composição**      | `"É parte de" (dono do ciclo de vida)` | `forte`                   | `Atributo instanciado dentro da própria classe`|
| **Agregação**       | `"Tem um" (vida independente)`         | `média`                   | `Atributo recebido via parâmetro/setter`|
| **Dependência**     | `"Usa um" (temporário)`                | `fraca`                   | `Parâmetro de método ou variável local`|
