import java.lang.reflect.Array;
public class Main {
    public static void main(String[] args) {
        Artista artista1 = new Artista ("Rita Lee");
        Artista artista2 = new Artista("Gabriel o pensador");
        Artista artista3 = new Artista("Raul Seixas");

        Musica musica1 = new Musica ("papai me empresta o carro", artista1.getNome());
        Musica musica2 = new Musica ("Mania de voce", artista1.getNome());
        Musica musica3 = new Musica ("Tudo vira bosta", artista1.getNome());

        Genero genero1 = new Genero("pop-rock", "musicas com a mistura perfeita entre o melhor do pop e do rock brasileiro", artista1.getNome());
        Genero genero2 = new Genero("Rap", "musicas de rap", artista2.getNome());
        Genero genero3 = new Genero("Rock Br", "musicas com o melhor do rock brasileiro", artista3.getNome());

        musica1.setGenero(genero1.getNome());
        musica2.setGenero(genero1.getNome());
        musica3.setGenero(genero1.getNome());
        musica3.ListarMusicas();
        musica1.ListarMusicas();
        musica2.ListarMusicas();
        System.out.println("");

        artista1.setGeneroPrincipal(genero1.getNome());
        artista2.setGeneroPrincipal(genero2.getNome());
        artista3.setGeneroPrincipal(genero3.getNome());
        artista1.ListarAristas();
        artista2.ListarAristas();
        artista3.ListarAristas();
        System.out.println("");

        genero1.ListarGeneros();
        genero2.ListarGeneros();
        genero3.ListarGeneros();
        System.out.println("");

        Usuario user = new Usuario("Claudo");
        Usuario user2 = new Usuario("jujubis");

        user2.usuarioName();
        System.out.println("");

        user2.ouvirMusica(musica2.getNome());
        System.out.println("");

        Playlist p1 = new Playlist("Rita",user.getNome());


        p1.TocarMusica(musica1.getNome(), musica2.getNome(), musica3.getNome());
        System.out.println("");
    }
}