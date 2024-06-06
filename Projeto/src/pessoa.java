public class pessoa {
    private String nome;
    private int idade;
    private String dep;

    public pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void insereDepartamento(String dep){
        this.dep = dep;
    }

    public void mostraPessoa(){
        System.out.println("Dados: "+getNome()+" - "+getIdade()+" - "+getDep());
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getDep(){
        return dep;
    }
}
