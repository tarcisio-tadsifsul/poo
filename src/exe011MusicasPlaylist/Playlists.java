package exe011MusicasPlaylist;

public class Playlists {
    // Atributos
    // Atributo do tipo vetor que vai guardar musicas
    Musicas[] listaMusicas;
    private int contadorMusicas = 0;
    private String nomePlaylist;
    
    // Outra forma de declarar o atributo do tipo vetor que
    // armazena objetos da classe Musica e inicializar
    // TipoDoObjeto[] nomeDoVetor = new TipoDoObjeto[capacidade];
    // Musicas[] listaMusicas = new Musicas[5];
    
    // Construtor Padrão
    public Playlists(Musicas[] musicas) {
        this.listaMusicas = musicas;
    }
    
    // Construtor
    public Playlists(String nome){
        this.nomePlaylist = nome;
    }
    
    // Get / Set
    public int getContadorMusicas(){
//        for(int i = 0; i < lista.length; i++){
//            if (lista[i] != null){
//                this.contadorMusicas++;
//            }
//        }
        for (Musicas musica : listaMusicas) {
            if (musica != null) {
                this.contadorMusicas++;
            }
        }
        return this.contadorMusicas;
    }
    
    public void adicionarMusica(Musicas m){
        int totalMusicasAdicionadas = getContadorMusicas();
        int posicaoParaAddMusica = (listaMusicas.length - totalMusicasAdicionadas)-1;
        listaMusicas[posicaoParaAddMusica] = m;
    }
    
    public void imprimirDadosPlaylist(){
        System.out.print(
            "\n| Playlist: " + this.nomePlaylist +
            "\n| Total Musicas: " + getContadorMusicas() +
            "\n| Tempo Total: criarFuncao()" +
            "\n");
    }
    
// fim class    
}
