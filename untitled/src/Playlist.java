public class Playlist {
    private String nome;
    private String musica1;
    private String musica2;
    private String musica3;
    private String user;

    public Playlist(String nome, String user) {
        this.nome = nome;
        this.user = user;
    }

    public String getNome() {
        return nome;
    }

    public String getMusica1() {
        return musica1;
    }

    public String getMusica2() {
        return musica2;
    }

    public String getMusica3() {
        return musica3;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMusica1(String musica1) {
        this.musica1 = musica1;
    }

    public void setMusica2(String musica2) {
        this.musica2 = musica2;
    }

    public void setMusica3(String musica3) {
        this.musica3 = musica3;
    }

    public void TocarMusica(String musica1, String musica2, String musica3) {
        System.out.println("o nome do criador e: " + user);
        System.out.println("o nome da pLaylist e: " + nome + " e ela contem: " + musica1 + ", " + musica2 + " e " + musica3);
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("O " + user + " esta ouvindo a musica: " + musica1);
            }
            if (i == 1) {
                System.out.println("O " + user + " esta ouvindo a musica: " + musica2);
            }
            if (i == 2) {
                System.out.println("O " + user + " esta ouvindo a musica: " + musica3);
            }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
