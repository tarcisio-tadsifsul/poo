package exe011MusicasPlaylist;

public class Musicas {
    
    // atributos
    private String titulo;
    private String artista;
    private int duracaoSegundos;    

    // Construtor padrão
    public Musicas(){
        this.titulo = "Sem Título";
        this.artista = "Sem Artista";
        this.duracaoSegundos = 0;
    }
    
    // Construtor
    public Musicas(String titulo, String artista, int duracao){
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracao;
    }
    
    // Get / Set
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String titulo){
        if (titulo.equals("")){
            this.titulo = "Sem Nome";
        } else {
            this.titulo = titulo;
        }
    }
    
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        if (artista.equals("")){
            this.artista = "Sem Nome";
        } else {
            this.artista = artista;            
        }
    }
    
    public int getDuracaoSegundos(){
        return this.duracaoSegundos;
    }
    
    public void setDuracaoSegundos(int duracao){
        if (duracao > 0) {
            this.duracaoSegundos = duracao;                        
        } else {
            System.out.println("Duração Inválida!"); 
        }        
    }
    
    public void imprimirDadosMusica(){
        System.out.print(
            "\n| Titulo: " + this.titulo +
            "\n| Artista: " + this.artista +
            "\n| Duracao: " + (this.duracaoSegundos / 60) + "min " + (this.duracaoSegundos % 60) + "seg" +
            "\n");
    }
    
// fim class    
}
