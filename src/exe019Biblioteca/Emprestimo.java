
package exe019Biblioteca;

import java.time.LocalDate;

public class Emprestimo {
    
    // Atributos
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;    
    
    
    // Construtor    
    public Emprestimo(
            Usuario usuario,
            Livro livro,
            LocalDate dataEmprestimo,
            LocalDate dataDevolucao
        ){
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = dataDevolucao;
    }

    // Metodo    
    public String exibirEmprestimo(){
        return "\nEmprestimo:" 
                + "\n| Usuario: " + this.usuario.getNome()
                + "\n| Livro: " + this.livro.getTitulo()
                + "\n| Data Emprestimo: " + this.dataEmprestimo
                + "\n| Data Devolucao: " + this.dataDevolucao;   
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    
}
