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

## Modificador de Comportamento (não-acesso):

- `static`: liga um membro diretamente à classe, e não aos objetos criados por ela.
    - Em **Variáveis**: cria uma única variável para a classe inteira. Todos os objetos compartilham essa mesma variável. Se um objeto mudar o valor, muda para todos.
    - Em **Métodos**: permite chamar o método direto pelo nome da classe. Você não precisa usar o comando new para criar um objeto antes de usar o método.

- `final`: final serve para impedir alterações. O comportamento muda dependendo de onde você a usa:
    - Em **Variáveis**: Transforma a variável em uma constante. O valor só pode ser definido uma vez e nunca mais alterado.
    - Em **Métodos**: Impede que o método seja reescrito (sobrescrito) por classes filhas.
    - Em **Classes**: Impede que a classe seja herdada por outra classe.

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


## Data Strutures (Estrutura de Dados)

### Java Collections Framework

O Java Collections Framework (JCF) fornece um conjunto de **interfaces** (como `List`, `Set`e `Map`) e um conjunto de **classes** ( `ArrayList`, `HashSet`, `HashMap`, etc.) que implementam essas interfaces.
Tudo isso faz parte do pacote _java.util_.

São utilizados para armazenar, pesquisar, classificar e organizar dados com mais facilidade, tudo isso utilizando métodos e padrões padronizados.

**Dica**: Pense no JCF como uma caixa de ferramentas. As **interfaces** como `List` definem o que as ferramentas podem fazer, e **classes** como `ArrayList` são as ferramentas reais que realizam o trabalho.

### Visão Geral

| Estrutura          | Armazena                       | Mantem ordem?               | Permite duplicados?          | Ideal para
| :----------------- | :----------------------------- | :-------------------------- | :--------------------------- | :---------------------------
| **ArrayList**      | `Elementos ordenados`          | `Sim`                       | `Sim`                        | `Lista redimensionável com acesso aleatório rápido`
| **LinkedList**     | `lista duplamente encadeada`   | ``                          | `Sim`                        | `Lista com operações rápidas de inserção e remoção`
| **HashSet**        | `Elementos únicos`             | `Não`                       | `Não`                        | `Evitando duplicados, verificações rápidas`
| **TreeSet**        | `Elementos ordenados`          | `Sim`                       | `Não`                        | `Conjunto ordenado de elementos únicos (ordem natural)`
| **LinkedHashSet**  | `Elementos ordenados`          | `Sim`                       | `Não`                        | `Mantém a ordem em que os elementos foram inseridos`
| **HashMap**        | `Pares chave-valor`            | `Não`                       | `Sim (as chaves são únicas)` | `Pesquisa rápida por chave`
| **TreeMap**        | `Pares chave-valor`            | `Sim, com base nas chaves`  | ``                           | `Mapa ordenado com base na ordem natural das chaves`
| **LinkedHashMap**  | `Pares chave-valor`            | `Sim, com base nas chaves`  | ``                           | `Mantém a ordem em que as chaves foram inseridas`
| **Queue**          | ``                             | ``                          | ``                           | ``
| **Stack**          | ``                             | ``                          | ``                           | ``


| Interface      | Classes                            | Descrição               
| :------------- | :--------------------------------- | :-------------------------- 
| **List**       | `ArrayList, LinkedList`            | `Coleção ordenada que permite duplicados`                       
| **Set**        | `HashSet, TreeSet, LinkedHashSet`  | `Coleção de elementos únicos`                          
| **Map**        | `HashMap, TreeMap, LinkedHashMap`  | `Armazena pares de chave-valor com chaves únicas`                       

**Dicas**: para o uso de cada classe, siga regras simples:
- Classes `List` quando a ordem for importante, quando houver duplicatas e quando quiser acessar os elementos por índice.
- Classes `Set` quando precisar armazenar apenas valores únicos.
- Classes `Map` quando precisar armazenar pares de chaves e valores, como um nome e seu número de telefone.

### Métodos

- `add()` e `remove()` (Base) são métodos pertencem à interface mãe **Collection**. Portanto, quase todas as estruturas padrão (`Lists`, `Sets` e `Queues`) os possuem.
- `get()` e `set()` (Exclusivos de quem tem Índice) esses métodos exigem que a estrutura tenha posições numeradas (índices). Por isso, eles são exclusivos da **interface** `List`.

| Estrutura          | Inserir              | Acessar (Ler)                         | Atualizar (Modificar)                   | Remover
| :----------------- | :------------------- | :------------------------------------ | :-------------------------------------- | :---------------------------
| **List**           | `add(item)`          | `get(índice)`                         | `set(índice, item)`                     | `remove(índice) ou remove(item)`
| **Set**            | `add(item)`          | `Não possui (use contains ou loop)`   | `Não possui (remova e adicione outro)`  | `remove(item)`
| **Map**            | `put(chave, valor)`  | `get(chave)`                          | `put(chave, novoValor)`                 | `remove(chave)`
| **Queue**          | `add(item)`          | `peek() (lê apenas o próximo a sair)` | `Não possui`                            | `remove() ou poll()`

Mais métodos:
- `clear()` para remover todos os elementos do **ArrayList**.
- `size()` para retornar quantos elementos possui um **ArrayList**. útil em _loop for_ para especificar quantas vezes o loop deve ser executado.
- `Collections.sort()` para ordenar listas alfabeticamente ou numericamente. Para ordem decrescente, use `Collections.reverseOrder()` como segundo argumento em `sort()` .


### Iteradores

Um iterador é uma forma de percorrer os elementos de uma estrutura de dados. É chamado de "iterador" porque "iterar" é o termo técnico para repetição em loop.

Exemplo de iterador com ArrayList:

```Java
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    // Cria um ArrayList de Strings
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Obtem um Iterador para ArrayList
    Iterator<String> it = cars.iterator();

    // Percorra a lista usando o iterador
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
```

### Exemplos

#### Sintaxe de criação

A partir do Java 7, você não precisa repetir o tipo de dado no lado direito do `=` (na hora de dar o `new`). O Java é inteligente o suficiente para inferir o tipo pelo que você declarou no lado esquerdo.
Você pode usar apenas `<>`, conhecido como _operador diamante_.

```Java
// Como era:
ArrayList<String> nomes = new ArrayList<String>();

// Forma moderna:
Interface<Tipo> nomeConjunto = new ClasseConcreta<>();
```

```Java
// O tipo da variável é List (Interface), mas o objeto real é ArrayList (Classe)
List<String> listaDeCompras = new ArrayList<>();

// Tipos primitivos (int, double) não podem ser usados nos <>. 
// Você deve usar as classes "Wrapper" (Integer, Double, etc.)
List<Integer> idades = new LinkedList<>();
```

```Java
// Para conjuntos
Set<String> cpfsUnicos = new HashSet<>();
```

```Java
// Mapas exigem dois tipos, um para a Chave e outro para o Valor.
Map<String, Integer> idadePorNome = new HashMap<>();
```

#### ArrayList
```Java
// Import da classe ArrayList
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // Cria o objeto ArrayList chamado cars
    ArrayList<String> cars = new ArrayList<String>();

    // Adiciona elementos no objeto cars
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```

#### HashSet

```Java
// Import da classe HashSet
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    // Cria o objeto HashSet chamado cars
    HashSet<String> cars = new HashSet<String>();

    // Adiciona elementos no objeto cars
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");  // Duplicate
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```

#### HashMap

```Java
// Import da classe HashMap
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    // Cria o objeto HashMap chamado capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Adiciona chave e valor (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
  }
}
```

