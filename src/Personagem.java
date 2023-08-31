import java.util.HashMap;
import java.util.Scanner;

public class Personagem {

    // define os atributos vida(string) e saude(int)
    private String nomechar;
    private int saude;
    public void setPersonagem(String nomechar, int saude){
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
    public String alterarSaude(int x, int y) {
        String resultado = ""; 
        if(x == 1){
            if(saude < 50){
                saude = saude + y;
                if(saude > 50){
                    saude = 50;
                }
                resultado = nomechar + " ganhou " + y + " pontos de vida.";
            }
            else{
                resultado = nomechar + " já está com a saúde cheia.";
            }}
        else if(x == 2){
            saude = saude - y;
            resultado = nomechar + " perdeu " + y + " pontos de vida.";
            if(saude <= 0){
                resultado = getNome() + " perdeu todos os pontos de vida.";
            }
        }
        else if(x == 0){
            resultado = nomechar + " não perdeu nem ganhou pontos de vida.";
        }     
        return resultado;    
    }
    public void lerPersonagem(HashMap<String, Personagem> personagens,
                              String linhaEscaneada, Personagem personagem, 
                              Scanner escaneadorArquivoPersonagens){
        linhaEscaneada = escaneadorArquivoPersonagens.nextLine();//NOME
        String nomePerso = escaneadorArquivoPersonagens.nextLine();
        linhaEscaneada = escaneadorArquivoPersonagens.nextLine();//VIDA
        int vidaPerso = Integer.parseInt(escaneadorArquivoPersonagens.nextLine());
        personagem.setPersonagem(nomePerso, vidaPerso); 
        personagens.put(nomePerso, personagem);
    }

}