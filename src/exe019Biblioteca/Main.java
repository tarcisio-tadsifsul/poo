package exe019Biblioteca;

public class Main {
    public static void main(String[] args) {
        Usuario user01 = new Usuario(
                "Fulano Silva",
                "111.222.333-00");

        System.out.println(user01.exibirDados());

        // Livro
        Livro livroT = new Livro(
                "Programando em Java",
                "Codando Jarvis");

        System.out.println(livroT.exibirDados());

    }
}
