package exe017PublicacaoLivros;

public class Publicacao {
    
    // Atributos
    private int id;
    private String titulo;
    private String autor;    
    
    // Construtores
    public Publicacao(){
        this.id = 000;
        this.titulo = "ND";
        this.autor = "ND";
    }
    
    public Publicacao(int id, String titulo, String autor){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }
    
    // Acesso / Leitura
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
    public String exibirFicha(){
        return "Ficha Livro: " +
                "\n| Titulo:\t" + this.getTitulo() + 
                "\n| Autor: \t" + this.getAutor() + 
                "\n| ID: \t\t" + this.getId();
    }
    
    
//end class    
}
