package provaetapa1;

public class Disciplina {

    // Atributos
    private String nome;
    private double cargaHoraria;
    private String professor;

    // Construtores
    public Disciplina() {
        this.nome = "S/N";
        this.cargaHoraria = 0.0;
        this.professor = "Sem professor definido";
    }

    public Disciplina(String nome, double cargaHoraria, String professor) {
        this.nome = nome;
        this.cargaHoraria = validaCargaHoraria(cargaHoraria);
        this.professor = professor;
    }

    // Leitura | Escrita
    public String getNome() {
        return nome;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public String getProfessor() {
        return professor;
    }

    private double validaCargaHoraria(double cargaHoraria) {
        if (cargaHoraria <= 0) {
            System.out.println("Carga Horária deve ser maior que zero!");
            return 20.0; // 20.00 como valor padrão de carga horaria para disciplina
        }

        return cargaHoraria;
    }

    // Metodos
    @Override
    public String toString() {
        return "Disciplina: " + this.nome + "\nCarga Horaria: " + this.cargaHoraria + "\nProfessor: " + this.professor;
    }
}
