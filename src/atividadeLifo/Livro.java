public class Livro {
    private String nome;
    private String autor;
    private int idLivro;
    static int auxId;

    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
        this.idLivro = ++auxId;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public String getNomeLivro() {
        return nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String imprimirLivro() {
        return "[ID-" + this.idLivro + "] | Livro: " + this.nome + " | Autor: " + this.autor;
    }
}
