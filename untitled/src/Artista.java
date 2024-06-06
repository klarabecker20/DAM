public class Artista {
    private String nome;
    private String generoPrincipal;

    public Artista(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGeneroPrincipal() {
        return generoPrincipal;
    }
    public void setGeneroPrincipal(String generoPrincipal) {
        this.generoPrincipal = generoPrincipal;
    }
    public void ListarAristas(){
        System.out.println("Artista: "+getNome()+" seu genero principal e o "+getGeneroPrincipal());
    }
}