import java.lang.reflect.Array;
import java.time.LocalDate;
public class Musica {
    private String nome;
    private String cantor;
    private String genero;

    public Musica(String nome, String cantor) {
        this.nome = nome;
        this.cantor = cantor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCantor() {
        return cantor;
    }
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void ListarMusicas(){
        System.out.println("Musica: "+getNome()+" do cantor "+getCantor()+" do genero "+getGenero());
    }
}
