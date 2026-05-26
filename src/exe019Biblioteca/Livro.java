package exe019Biblioteca;

public class Livro {
    // Atributos
    private String titulo;
    private String autor;

    // Construtor
    public Livro() {
        this.titulo = "Sem Titulo";
        this.autor = "Sem Autor";
    }

    public Livro(String titulo, String autor) {
        setTitulo(titulo);
        setAutor(autor);
    }

    // Leitura / Escrita
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Metodos
    public String exibirDados() {
        return "\nLivro:"
                + "\n| Titulo: " + getTitulo()
                + "\n| Autor:  " + getAutor();
    }
}
