package fifo;

public class Fifo {
    public static void main(String[] args) {
        Turma t1 = new Turma(5);

        t1.inserirFim("Aluno A");
        t1.inserirFim("Aluno B");
        t1.inserirFim("Aluno C");
        t1.inserirFim("Aluno D");
        t1.inserirFim("Aluno E");
        
        System.out.println(t1.imprimir());
        
        t1.inserirFim("Aluno Z");
        
        t1.removerInicio("Aluno A");
        System.out.println("\n" + t1.imprimir());
    }
}
