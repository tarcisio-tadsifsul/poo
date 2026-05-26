package exe011MusicasPlaylist;

public class Main {
    public static void main(String[] args){
        
        Playlists minhasMusicas = new Playlists("Favoritas");
        Musicas music01 = new Musicas(
                "Musica 01",
                "Artista 01",
                175
        );
        
        Musicas music02 = new Musicas(
                "Musica 02",
                "Artista 02",
                275
        );
        
        Musicas music03 = new Musicas(
                "Musica 03",
                "Artista 03",
                213
        );
       
        minhasMusicas.adicionarMusica(music01);
        minhasMusicas.adicionarMusica(music02);
        minhasMusicas.adicionarMusica(music03);
        music01.imprimirDadosMusica();
        music02.imprimirDadosMusica();
        music03.imprimirDadosMusica();
        minhasMusicas.imprimirDadosPlaylist();
        
        
       
        
    }
}
