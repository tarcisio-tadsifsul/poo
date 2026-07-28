package provaetapa1;

import java.text.DecimalFormat;

public class Aluno extends Pessoa {

    // Atributos
    private static int auxId;
    private int id;
    private String curso;
    private String numeroMatricula;
    private Disciplina[] disciplinas;
    DecimalFormat df = new DecimalFormat("0");

    // Construtores
    public Aluno() {
        super();  // super() sem parametros vai usar o construtor padrão criado na classe pessoa, no qual já recebe valores N/D
        this.id = 0;
        this.curso = "N/D";
        this.numeroMatricula = "N/D";
        this.disciplinas = new Disciplina[5];
    }

    public Aluno(String nome, String cpf, String email, String curso) {
        super(nome, cpf, email);
        this.id = autoIncrementarId();
        this.curso = curso;
        this.numeroMatricula = curso.toUpperCase() + "202600" + this.id;
        this.disciplinas = new Disciplina[5];
    }

    // Leitura | Escrita
    public int getId() {
        return id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    /**
     * Metodo auto incremento de ID Aluno
     * 
     * @return int
     */
    private int autoIncrementarId() {
        this.id = ++auxId; // pre incremento
        return this.id;
    }

    /**
     * Metodo para matricular na disciplina
     * 
     * @param disciplina
     * @return boolean
     */
    public boolean matricular(Disciplina paramDisciplina) {
        if (paramDisciplina == null){
            System.out.println("\n[ERRO] Disciplina nula!");
            return false;
        }

        for (int i = 0; i < this.disciplinas.length; i++) {
            if (this.disciplinas[i] == null) {
                this.disciplinas[i] = paramDisciplina;
                System.out.printf("\n\n[OK] Matricula realizada na disciplina de %s", paramDisciplina.getNome());
                return true;
            }
        }
        System.out.println("\n\n[ERRO] Atingido máximo de disciplinas por aluno!");
        return false;
    }

    /**
     * Metodo para desmatricular na disciplina
     * 
     * @param disciplina
     * @return boolean
     */
    public boolean desmatricular(String nomeDisciplina) {

        if (nomeDisciplina == null || nomeDisciplina == ""){
            System.out.print("\n\n[ERRO] Nome da disciplina inválido!");
            return false;
        }

        // validar se a disciplina a ser desmatriculada existe no vetor disciplinas do

        for (int i = 0; i < this.disciplinas.length; i++) {

            if (this.disciplinas[i] != null && this.disciplinas[i].getNome().equalsIgnoreCase(nomeDisciplina)) {

                System.out.printf("\n\n[OK] Cancelada matricula na disciplina de %s", nomeDisciplina);
                this.disciplinas[i] = null;

                for (int j = i; j < this.disciplinas.length; j++) {
                    if (this.disciplinas[j] == null) {

                        if ((j + 1) < this.disciplinas.length) {
                            this.disciplinas[j] = this.disciplinas[j + 1];
                            this.disciplinas[j + 1] = null;
                        }

                    }
                }
                return true;
            }

        }
        System.out.printf("\n\n[ERRO] Disciplina de %s Não Encontrada nas Disciplinas do Aluno!",
                nomeDisciplina);
        return false;
    }

    /**
     * Metodo para calcular carga horária total
     * 
     * @return double
     */
    public double calcularCargaHoraria() {
        double auxCargaHoraria = 0.0;
        for (Disciplina disciplina : disciplinas) {
            if (disciplina != null) {
                auxCargaHoraria += disciplina.getCargaHoraria();
            }
        }
        return auxCargaHoraria;
    }

    public String retornaCargaHorariaTotal() {
        return "\n\n| Carga Horaria Total: " + df.format(this.calcularCargaHoraria()) + "h";
    }

    /**
     * Metodo que retorna String formatada com dados de Aluno
     * 
     * @return String
     */
    public String exibirDados() {
        return "\n| DADOS DO ALUNO" +
                "\n| --------------------" +
                "\n| ID: " + this.getId() +
                "\n| Matricula: " + this.getNumeroMatricula() +
                "\n| Curso: " + this.getCurso() +
                "\n" + super.toString();
    }

    /**
     * Método que retorna lista de disciplinas / carga horaria
     * 
     * @return String
     */
    private String listarDisciplinas() {
        String nomeECarga = "";
        String listaDisciplinas = "";
        for (int i = 0; i < this.disciplinas.length; i++) {
            if (this.disciplinas[i] != null) {
                nomeECarga = this.disciplinas[i].getNome() + " - " + df.format(this.disciplinas[i].getCargaHoraria()) + "h";
            } else {
                nomeECarga = "(disponivel para matricula)";
            }
            listaDisciplinas += "\n| [" + (i + 1) + "] " + nomeECarga;
        }
        return listaDisciplinas;
    }

    /**
     * Metodo que retorna dados completos do Aluno
     * 
     * @return String
     */
    public String exibirRelatorio() {

        return "\n\n| RELATORIO DE MATRICULA" +
                "\n| --------------------" +
                this.exibirDados() +
                "\n| --------------------" +
                "\n| DISCIPLINAS MATRICULADAS" +
                this.listarDisciplinas() +
                "\n| --------------------" +
                "\n| Carga Horária Total: " + df.format(this.calcularCargaHoraria()) + 'h';
    }

}
