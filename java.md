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

## Para implementar uma interface, você pode usar a palavra-chave `implements`:

    ```java
    public class NomeDaClasse implements NomeDaInterface {
        // Código da classe
    }
    ```
