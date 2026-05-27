package exe019Biblioteca;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Instancia Biblioteca
        Biblioteca biblioteca = new Biblioteca();
        
        // Endereco e Usuario
        Endereco enderecoUsuario = new Endereco("Rua Teeste", "123");
        Usuario user01 = new Usuario(
                "Fulano Silva",
                "111.222.333-00",
                enderecoUsuario
        );
        // Livro   
        Livro livroT = new Livro(
                "Programando em Java",
                "Codando Jarvis");
       
        
        // Endereco e Usuario
        Endereco endereco2 = new Endereco("Rua Testando", "123");
        Usuario user02 = new Usuario(
                "Siclano Soares",
                "111.222.333-00",
                endereco2
        );
        // Livro
        Livro livroD = new Livro(
                "Historia da Tecnologia",
                "Reveno Antenor");

//        Emprestimo emprestimo1 = new Emprestimo(
//                    user02,
//                    livroD,
//                    LocalDate.now(),
//                    LocalDate.of(2026, 06, 10)
//        );

        biblioteca.realizarEmprestimo(
                    user01,
                    livroT,
                    LocalDate.now(),
                    LocalDate.of(2026, 06, 10)
        );
        
        biblioteca.realizarEmprestimo(
                    user02,
                    livroD,
                    LocalDate.now(),
                    LocalDate.of(2026, 06, 10)
        );
        
//        System.out.println(emprestimo1.exibirEmprestimo());
        
        System.out.println(biblioteca.imprimirEmprestimos());
    }
}
