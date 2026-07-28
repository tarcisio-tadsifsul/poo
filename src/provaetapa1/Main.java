package provaetapa1;

public class Main {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Fulano de Tal", "111.222.333-44", "fulano@gmail.com", "TADS"); // Aluno 1  criado
        Aluno aluno2 = new Aluno("Siclano de Tal", "555.666.777-88", "siclano@gmail.com", "TAC"); // Aluno 2 criado
        
        System.out.println(aluno1.exibirDados()); // Exibi dados do aluno
        System.out.println(aluno2.exibirDados()); // Exibi dados do aluno

        Disciplina matematica = new Disciplina("Matematica", 120, "Profª M");
        Disciplina portugues = new Disciplina("Portugues", 120, "Profº P");
        Disciplina biologia = new Disciplina("Biologia", 80, "Profª B");
        Disciplina fisica = new Disciplina("Fisica", 80, "Profº F");
        Disciplina historia = new Disciplina("Historia", 80, "Profº H");
        Disciplina quimica = new Disciplina("Quimica", 80, "Profº Q");
        Disciplina d0 = null;

        System.out.println(matematica.toString()); // Metodo toString que imprimi dados da disciplinas

        aluno1.matricular(historia);
        aluno1.matricular(matematica);
        aluno1.matricular(portugues);
        aluno1.matricular(fisica);
        aluno1.matricular(biologia); //  Matriculas realizadas com sucesso!

        aluno1.matricular(quimica); // Erro de numero maximo de disciplinas
        aluno1.desmatricular("biologia"); // Matricula cancelada com sucesso
        aluno1.desmatricular("quimica"); // Erro ao tentar desmatricular uma disciplina que não existe nas disciplinas do aluno
        aluno1.matricular(d0); // Erro ao tentar matricular de disciplina nula
        aluno1.desmatricular("");

        System.out.println(aluno1.retornaCargaHorariaTotal()); // Retorna carga horaria total

        System.out.println(aluno1.exibirRelatorio()); // Retorna relatorio completo com dados do aluno

        System.out.println(aluno2.exibirRelatorio()); // Relatorio completo com dados do aluno 2 sem disciplinas pois nenhuma foi matriculada.

    }
}
