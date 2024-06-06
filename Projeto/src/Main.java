public class Main {
    public static void main(String[] args) {
        pessoa p1 = new pessoa("Fábio", 39);
        pessoa p2 = new pessoa("João",25);

        departamento d1 = new departamento("Informática", "Prédio 20");
        departamento d2 = new departamento("Administrativo", "Prédio 15");

        p1.insereDepartamento(d1.getNome());
        p1.mostraPessoa();
        // System.out.println("Hello world!");

    }
}