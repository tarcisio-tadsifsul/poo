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

---

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
