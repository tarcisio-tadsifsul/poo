package fifo;

public class Turma {

    // Atributos
    private String alunos[];
    private int max;
    private int total;

    // Construtor
    public Turma(int max){
        this.max = max;
        this.total = 0;
        this.alunos = new String[max];
    }

    // Metodos
    // remover inicio
    public boolean removerInicio(String nomeAluno){
        if(total > 0){
            for (int i = 0; i < this.total - 1; i++) { // (total - 1) para ir até o última posição com dados. 
                alunos[i] = alunos[i+1];
            }
            alunos[total - 1] = null; // coloca null na última posição do vetor
            total--; // decremento de total
            return true;
        }
        return false;
    }

    // inserir no fim
    public boolean inserirFim(String nomeAluno){
        if (this.total < this.max){
            alunos[total] = nomeAluno; // Add item no primeiro item com espaço vazio.
            total++; // incrementa total
            return true;
        } else {
            System.out.println("Aluno " + nomeAluno + " não cadastrado.\nTurma completa!");
            return false;
        }

    }


    public String imprimir(){
        if (this.total == 0){
            return "Sem alunos(as) cadastrados!";
        }

        String aux = "";
        for (String a : alunos){            
            aux += a != null ? (a + "\n") : "---\n";
        }
        return aux;

    }

     
}
