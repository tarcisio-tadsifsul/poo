package provaetapa1;

public class Main {
    public static void main(String[] args) {

        Disciplina matematica = new Disciplina("Matematica", 120, "Profª M");
        Disciplina portugues = new Disciplina("Portugues", 120, "Profº P");
        Disciplina biologia = new Disciplina("Biologia", 80, "Profª B");
        Disciplina fisica = new Disciplina("Fisica", 80, "Profº F");
        Disciplina historia = new Disciplina("Historia", 80, "Profº H");
        Disciplina quimica = new Disciplina("Quimica", 80, "Profº Q");

        Aluno aluno1 = new Aluno("Jose Campos", "111.222.333-44", "josecampos@gmail.com", "TADS");

        System.out.println(aluno1.exibirDados());

        aluno1.matricular(historia);
        aluno1.matricular(matematica);
        aluno1.matricular(portugues);
        aluno1.matricular(fisica);
        aluno1.matricular(biologia);

        aluno1.matricular(quimica);
        aluno1.desmatricular("biologia");
        aluno1.desmatricular("quimica");
        aluno1.matricular(quimica);

        System.out.println(aluno1.retornaCargaHorariaTotal());

        System.out.println(aluno1.exibirRelatorio());

        Aluno aluno2 = new Aluno("Maria Fagundes", "555.666.777-88", "mariafagundes@gmail.com", "TAC");
        System.out.println(aluno2.exibirRelatorio());

    }
}
