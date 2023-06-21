public class Personagem {

    // define os atributos vida(string) e saude(int)
    private String nome;
    private int saude;

    // recebe a string nome
    public String getNome() {
        return nome;
    }

    // atribui a string ao atributo
    public void setNome(String nome) {
        this.nome = nome;
    }

    // recebe int saúde
    public int getSaude() {
        return saude;
    }

    // atribui int ao atributo
    public void setSaude(int saude) {
        this.saude = saude;
    }

    // define o método para perder vida
    public int perderSaude(int x) {
        saude = saude - x;
        System.out.println(nome + " perdeu " + x + " pontos de vida.");
        return saude;
    }

    // define o método para ganhar vida
    public int ganharSaude(int x) {
        saude = saude + x;
        System.out.println(nome + " ganhou " + x + " pontos de vida.");
        return saude;
    }

}