# Comandos git via CMD

## **Para clonar repositorio do github:**

`git clone https://github.com/tarcisio-tadsifsul/poo.git`

---

## **Para adicionar arquivos para o stage:**

`git add .`
ou
`git add nome-do-arquivo`
ou
`git add -A` (para adicionar todas as alterações, incluindo arquivos deletados)

## `git commit -am "Mensagem do commit"` (para adicionar e commitar em um único comando, apenas para arquivos já rastreados)

## **Para commitar as alterações:**

`git commit -m "Mensagem do commit"`

OBSERVAÇÃO: A mensagem do commit no CMD deve ser escrita entre aspas duplas!

---

## **Para enviar as alterações para o repositório remoto:**

`git push`
ou
`git push origin master` dependendo do nome da branch principal do repositório.

---

## **Para verificar o status do repositório:**

`git status`

---

---

---

Para verificar o histórico de commits:

`git log`

---

Para criar uma nova branch:

`git checkout -b nome-da-branch`

---

Para mudar para uma branch existente:

`git checkout nome-da-branch`

---

Para mesclar uma branch com a branch principal:

`git merge nome-da-branch`

---

Para excluir uma branch:

`git branch -d nome-da-branch`

---

Para listar as branches existentes:

`git branch`

---

Para verificar as alterações feitas em um arquivo:

`git diff nome-do-arquivo`

---

Para desfazer as alterações em um arquivo:

`git checkout -- nome-do-arquivo`

---

Para desfazer um commit:

`git reset --soft HEAD~1` (mantém as alterações no stage)

`git reset --hard HEAD~1` (descarta as alterações)

---

Para criar um repositório local:

`git init`

---

Para configurar o nome de usuário e email:

`git config --global user.name "Seu Nome"`

`git config --global user.email "email@email.com"`

---

Esses são alguns dos comandos básicos do Git para trabalhar com repositórios. Existem muitos outros comandos e opções disponíveis, dependendo das necessidades do seu projeto.

# **Diferenças entre Bash e CMD/PowerShell**

Diferenças mais importantes que afetam o uso diário do Git e de outras ferramentas de desenvolvimento:

1. Aspas e Espaços:
   - Bash: Aceita tanto aspas simples ('text') quanto aspas duplas ("text"). As simples mantêm o texto literal, enquanto as duplas permitem ler variáveis.
   - CMD: Só aceita aspas duplas ("text"). Aspas simples são tratadas como texto comum, quebrando comandos com espaços.PowerShell: Aceita ambas, mas tem regras complexas com o Git, preferindo aspas duplas para argumentos externos.

2. Barras de Caminho (Path)
   - Bash: Usa barras para frente (/).
     Exemplo: `cd pasta/subpasta/projeto`
   - CMD / PowerShell: Usam barras invertidas (\).
     O CMD aceita algumas barras para frente, mas o comportamento pode falhar em scripts.
     Exemplo: `cd pasta\subpasta\projeto`

3. Conectores de Comandos (Executar vários em sequência)

Se você quiser rodar um comando logo após o outro na mesma linha:

    - Bash: Usa ; (roda independente do resultado) ou && (só roda o segundo se o primeiro der certo).
    Exemplo:
    ```bash
        git add . && git commit -m "Fim"
    ```

    - CMD: Usa & (independente do resultado) ou && (apenas se o primeiro der certo).

    - PowerShell: Usa ; ou && (este último apenas nas versões mais recentes, do PowerShell 7 em diante).

4. Variáveis de Ambiente

Como criar e acessar uma variável temporária no terminal:

    - Bash:
        - Criar: NOME="João"
        - Chamar: echo $NOME

    - CMD:
        - Criar: set NOME=João
        - Chamar: echo %NOME%

    - PowerShell:
        - Criar: $NOME="João"
        - Chamar: echo $NOME

5. Comandos Básicos de Navegação e Sistema

Muitos comandos nativos do Bash não existem no CMD (embora o PowerShell crie "apelidos" para simular alguns deles):

| Ação                        | Bash                    | CMD                       | PowerShell                     |
| :-------------------------- | :---------------------- | :------------------------ | :----------------------------- |
| **Listar arquivos**         | `ls`                    | `dir`                     | `ls` ou `dir`                  |
| **Criar pasta**             | `mkdir`                 | `mkdir` ou `md`           | `mkdir`                        |
| **Criar arquivo vazio**     | `touch index.html`      | `type nul > index.html`   | `New-Item index.html`          |
| **Apagar arquivo**          | `rm foto.png`           | `del foto.png`            | `rm foto.png` ou `del`         |
| **Ver conteúdo do arquivo** | `cat log.txt`           | `type log.txt`            | `cat log.txt` ou `type`        |
| **Limpar a tela**           | `clear`                 | `cls`                     | `clear` ou `cls`               |
| **Mover/renomear**          | `mv arquivo.txt pasta/` | `move arquivo.txt pasta\` | `Move-Item arquivo.txt pasta\` |
| **Copiar**                  | `cp arquivo.txt pasta/` | `copy arquivo.txt pasta\` | `Copy-Item arquivo.txt pasta\` |
| **Apagar pasta**            | `rm -r pasta/`          | `rmdir /s pasta\`         | `Remove-Item -Recurse pasta\`  |
