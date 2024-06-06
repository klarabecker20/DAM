public class Usuario {
    private String nome;
    private String musica;
    private String playlist;
    public Usuario(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMusica() {
        return musica;
    }
    public void setMusica(String musica) {
        this.musica = musica;
    }
    public String getPlaylist() {
        return playlist;
    }
    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }
    public void usuarioName(){
        System.out.println("o usuario que esta ouvindo e: "+ getNome());
    }
    public void ouvirMusica(String musica){
        System.out.println("o usuario esta ouvindo:"+ musica);
    }
}