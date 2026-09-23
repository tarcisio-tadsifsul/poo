# Prova Etapa 1 - Programação Orientada a Objetos

Construa uma `superclasse` denominada `Pessoa`, que atenda aos seguintes atributos e métodos:

- string nome
- string cpf
- string email

- toString() : string

Em seguida, crie uma `subclasse` denominada `Aluno`, que *especializa* uma `Pessoa`, incluindo os seguintes atributos e métodos:

- static int auxId
- int id
- string curso
- string numeroMatricula
- Disciplinas[] disciplinas

- matricular(Disciplina disciplina): boolean
- desmatricular(string nomeDisciplina): boolean
- calcularCargaHoraria(): double
- exibirDados() : string // retorna dados gerais do aluno
- exibirRelatorio() : string // retorna dados completos, incluindo disciplinas cursadas

obs.: Um `Aluno` pode cursar no máximo 5 `disciplinas`.
O atributo id deve ser auto incrementado a cada novo objeto instanciado.

Na sequência, construa a `classe` `Disciplina`, que atuará apenas como objeto passivo na relação associativa unidirecional gerenciada pelo aluno:

- string nome
- double cargaHoraria
- string professor

- toString() : string

Por fim, teste a codificação na classe `Main`, a partir da criação de um objeto aluno que deve conseguir executar todos os métodos públicos disponíveis. Crie um segundo objeto do tipo aluno e imprima seus dados gerais, a fim de validar a implementação do atributo estático.

A implementação deve considerar encapsulamento em nível máximo, disponibilizando acesso somente àquilo que é estritamente necessário. Visão do sistema: portal do estudante.
