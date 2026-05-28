# 📚 Programação Orientada a Objetos (POO)

Repositório contendo exercícios práticos de **Programação Orientada a Objetos** em Java. Este projeto faz parte do curso **TADS 2N-2026** (Análise e Desenvolvimento de Sistemas) do **Instituto Federal Sul-Rio-Grandense (IFSul)**.

## 🎯 Objetivo

Consolidar os conceitos fundamentais de POO através de exercícios progressivos, partindo de conceitos básicos até tópicos mais avançados como herança, polimorfismo e interfaces.

## 📂 Estrutura do Projeto

## 📖 Tópicos Abordados

### Conceitos Básicos

- ✅ Classes e Objetos
- ✅ Atributos e Métodos
- ✅ Construtores
- ✅ Encapsulamento (private/public)
- ✅ Métodos Get e Set

### Conceitos Intermediários

- ✅ Herança
- ✅ Sobrescrita de Métodos
- ✅ Polimorfismo
- ✅ Relacionamento entre Classes
- ✅ Composição e Agregação
- ✅ Arrays e Vetores

### Conceitos Avançados

- ✅ Classes Abstratas
- ✅ Interfaces
- ✅ Validação de Dados
- ✅ Estruturas de Dados

## 🛠️ Requisitos

- **Java**: JDK 8 ou superior
- **IDE**: NetBeans (recomendado) ou VS Code
- **Build**: Apache Ant (incluso no projeto)

## 🚀 Como Executar

### Compilar o Projeto

```bash
ant build
```

### Compilar e Executar um Exercício Específico

```bash
# Exemplo: Executar exe001aluno
java -cp build/classes exe001aluno.Principal
```

### Executar no NetBeans

1. Abra o projeto no NetBeans
2. Clique em **Run** ou pressione `F6`

## 📝 Estrutura de Arquivos

```
poo/
├── README.md                  # Este arquivo
├── build.xml                  # Configuração Ant
├── nbproject/                 # Configurações NetBeans
├── src/                       # Código fonte
│   ├── aulaspoo/             # Material de aulas
│   ├── exe001aluno/          # Exercício 1
│   ├── exe003produto/        # Exercício 3
│   └── ...                   # Demais exercícios
├── build/                    # Arquivos compilados
└── test/                     # Testes
```

## 📚 Recursos Adicionais

- **[git.md](git.md)** - Guia de versionamento com Git
- **[java.md](java.md)** - Referência de sintaxe Java
- **[notas.txt](notas.txt)** - Anotações de aula e exemplos

## 💡 Dicas para Estudar

1. **Progresso Gradual**: Siga os exercícios em ordem numérica
2. **Entenda o Enunciado**: Leia com atenção o arquivo `Enunciado.html` ou `Descricao*.html` de cada exercício
3. **Implemente do Zero**: Tente resolver antes de consultar soluções
4. **Teste Sempre**: Use a classe `Principal.java` ou `Main.java` para testar suas implementações
5. **Revise Conceitos**: Consulte `java.md` para referência de sintaxe

## 📌 Padrões de Código

Este projeto segue convenções Java padrão:

- **Nomes de Classes**: CamelCase (ex: `Aluno`, `Funcionario`)
- **Nomes de Métodos**: camelCase (ex: `calcularSalario()`, `exibirDados()`)
- **Constantes**: UPPER_CASE (ex: `VALOR_MINIMO`)
- **Atributos Privados**: Acessados via Get/Set públicos

## 👨‍💼 Autor

Exercícios de POO - TADS 2N-2026 - IFSul

## 📄 Licença

Uso exclusivo para fins educacionais

---

**Última atualização**: 27 de maio de 2026
