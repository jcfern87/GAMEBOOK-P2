public class Personagem {

    // define os atributos vida(string) e saude(int)
    private String nomechar;
    private int saude;
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
    // define o método para alterar vida
    public int alterarSaude(int x, int y) {
        if(x == 1){
            if(saude < 50){
                saude = saude + y;
                if(saude > 50){
                    saude = 50;
                }
                System.out.println(nomechar + " ganhou " + y + " pontos de vida.");
            }
            else{
                System.out.println(nomechar + " já está com a saúde cheia.");
            }}
        else if(x == 2){
            saude = saude - y;
            System.out.println(nomechar + " perdeu " + y + " pontos de vida.");
            if(saude <= 0){
                System.out.println(getNome()+" perdeu todos os pontos de vida.");
            }
        }     
        return saude;    
    }

}