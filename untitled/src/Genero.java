public class Genero {
    private String nome;
    private String descricao;
    private String artista;

    public Genero(String nome, String descricao, String artista) {
        this.nome = nome;
        this.descricao = descricao;
        this.artista = artista;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtistas(String artistas) {
        this.artista = artista;
    }
    public void ListarGeneros(){
        System.out.println("Genero: "+getNome()+" cantor principal "+getArtista());
    }
}
