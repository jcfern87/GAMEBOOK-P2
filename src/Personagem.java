public class Personagem {

    // define os atributos vida(string) e saude(int)
    String nomechar;
    int saude;
    public Personagem(String nomechar, int saude){
        this.nomechar = nomechar;
        this.saude = saude;
    }
    // recebe a string nome
    public String getNome() {
        return nomechar;
    }
    // recebe int saúde
    public int getSaude() {
        return saude;
    }
    // define o método para perder vida
    public int perderSaude(int x) {
        saude = saude - x;
        System.out.println(nomechar + " perdeu " + x + " pontos de vida.");
        if(saude <= 0){
            System.out.println(getNome()+" perdeu todos os pontos de vida.");
        }
        return saude;
    }

    // define o método para ganhar vida
    public int ganharSaude(int x) {
        if(saude < 50){
            saude = saude + x;
            if(saude > 50){
                saude = 50;
            }
            System.out.println(nomechar + " ganhou " + x + " pontos de vida.");
        }
        else{
            System.out.println(nomechar + " já está com a saúde cheia.");
        }
        return saude;    
    }

}