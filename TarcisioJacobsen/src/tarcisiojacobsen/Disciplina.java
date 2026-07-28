
package tarcisiojacobsen;

public class Disciplina {
    
    private String nome;
    private double cargaHoraria;
    private String professor;

    public Disciplina() {
        this.nome = "Disciplina Sem Nome";
        this.cargaHoraria = 0;
        this.professor = "Sem Professor";
    }
    
    public Disciplina(String nome, int cargaHoraria, String professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
    
    @Override
    public String toString(){
        return "| Nome: " + this.nome
             + "| Carga Horaria: " + this.cargaHoraria
             + "| Professor: " + this.professor;
    }
    
    
    
}
