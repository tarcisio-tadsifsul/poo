package exe017PublicacaoLivros;

public class Livro extends Publicacao {

    // atributos
    private String isbn;
    private int numeroPaginas;

    // Leitura / Escrita
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // construtores
    public Livro() {
        this.isbn = "N/A";
        this.numeroPaginas = 0;
    }

    public Livro(
            String isbn,
            int numeroPaginas,
            int id,
            String titulo,
            String autor
    ) {
        super(id, titulo, autor);
        setIsbn(isbn);
        setNumeroPaginas(numeroPaginas);
    }

    // Metodos
    @Override
    public String exibirFicha() {
        return super.exibirFicha()
                + "\n| ISBN: \t" + this.getIsbn()
                + "\n| Paginas: \t" + this.getNumeroPaginas();
    }

// end class    
}
