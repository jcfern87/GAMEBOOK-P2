import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Leitor {
    HashMap<String, Personagem> lerPerso(String caminhoArquivoPersonagens){
        HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();
        File arquivoPersonagens = new File(caminhoArquivoPersonagens);

        try {
            Scanner escaneadorArquivoPersonagens = new Scanner(arquivoPersonagens, "UTF-8");
            
            String nomePerso = "";
            int vidaPerso = 0;
            String linhaEscaneada = "";
            while(escaneadorArquivoPersonagens.hasNextLine()){
                while (!linhaEscaneada.equals("PERSONAGEM")) {
                    linhaEscaneada = escaneadorArquivoPersonagens.nextLine();
                }
                linhaEscaneada = escaneadorArquivoPersonagens.nextLine();//NOME
                nomePerso = escaneadorArquivoPersonagens.nextLine();
                linhaEscaneada = escaneadorArquivoPersonagens.nextLine();//VIDA
                vidaPerso = Integer.parseInt(escaneadorArquivoPersonagens.nextLine()); 
                personagens.put(nomePerso, new Personagem(nomePerso, vidaPerso));
            }        
            escaneadorArquivoPersonagens.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return personagens;
    }
}
