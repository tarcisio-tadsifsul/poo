package tarcisiojacobsen;

public class Aluno extends Pessoa {
    
    static int auxId;
    private int id;
    private String curso;
    private String matricula;
    private Disciplina disciplinas[];
    
    public Aluno(){
        this.id = autoIncrementarId();
        this.curso = "Sem Curso";
        this.matricula = "Sem Matricula";
        this.disciplinas = null; // A PROVA INTEIRA PARA DESCOBRIR QUE MEU ERRO FOI AQUI. MERDA!
    }

    public Aluno(String nome, String cpf, String email, String curso, String matricula) {
        super(nome, cpf, email);
        this.id = autoIncrementarId();
        this.curso = curso;
        this.matricula = matricula;
        this.disciplinas = new Disciplina[5];
    }    
    
    public int getId() {
        return id;
    }

    public String getCurso() {
        return curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }
    
    
    // Metodos
    private int autoIncrementarId(){
        Aluno.auxId++;
        this.id = Aluno.auxId;
        return this.id;
    }   
    
    
    
    
    public boolean matricular(Disciplina disciplina){
           
        return false;
    }
    
    public boolean desmatricular(String nomeDisciplina){
        
        return false;
    }
    
    public double calcularCargaHoraria(){
        return 0.0;
    }       
    
    public String exibirDados(){
        return "";
    }
    
    public String exibirRelatorio(){
        return "";
    }
    
}
