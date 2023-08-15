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
            while(escaneadorArquivoPersonagens.hasNextLine()){
                String linhaEscaneada = escaneadorArquivoPersonagens.nextLine();
                if(linhaEscaneada.equals("PERSONAGEM")){
                    linhaEscaneada = escaneadorArquivoPersonagens.nextLine();//NOME
                    String nomePerso = escaneadorArquivoPersonagens.nextLine();
                    linhaEscaneada = escaneadorArquivoPersonagens.nextLine();//VIDA
                    int vidaPerso = Integer.parseInt(escaneadorArquivoPersonagens.nextLine()); 
                    personagens.put(nomePerso, new Personagem(nomePerso, vidaPerso));
                }
            }        
            escaneadorArquivoPersonagens.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return personagens;
    }

    HashMap<String, Capitulo> lerCap(String caminhoArquivoCapitulos, HashMap<String, Personagem> personagens)
    {
        HashMap<String, Capitulo> capitulos = new HashMap<String, Capitulo>();
        File arquivoCapitulos = new File(caminhoArquivoCapitulos);

        try {
            Scanner escaneadorArquivoCapitulos = new Scanner(arquivoCapitulos, "UTF-8");
            while(escaneadorArquivoCapitulos.hasNextLine())
            {
                String linhaEscaneada = escaneadorArquivoCapitulos.nextLine();
                if(linhaEscaneada.equals("CAPITULO"))
                {
                    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();//NOME
                    String nomeCapitulo = escaneadorArquivoCapitulos.nextLine();
                    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();//TEXTO
                    String textoCapitulo = escaneadorArquivoCapitulos.nextLine();
                    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();//OPÇOES
                    String opçoesCapitulo = escaneadorArquivoCapitulos.nextLine();
                    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();//PERSONAGEM
                    String personagemCapitulo = escaneadorArquivoCapitulos.nextLine();
                    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();//EDMESSAGE
                    String edMessageCapitulo = escaneadorArquivoCapitulos.nextLine();
                    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();//ALTERA ENERGIA
                    int alteraEnergiaCapitulo = Integer.parseInt(escaneadorArquivoCapitulos.nextLine());
                    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();//GANHA OU PERDE
                    int gopCapitulo = Integer.parseInt(escaneadorArquivoCapitulos.nextLine());
                    if(edMessageCapitulo.equals("null"))
                    {
                        edMessageCapitulo = null;
                    }
                    if(opçoesCapitulo.equals("null"))
                    {
                        opçoesCapitulo = null;
                    }
                    capitulos.put(nomeCapitulo, new Capitulo(nomeCapitulo, textoCapitulo, opçoesCapitulo, 
                       personagens.get(personagemCapitulo), edMessageCapitulo, gopCapitulo, alteraEnergiaCapitulo));
                    capitulos.get(nomeCapitulo).setEsc();     
                }
                else if(linhaEscaneada.equals("ESCOLHA"))
                {   
                    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();//ORIGEM
                    String origemEscolha = escaneadorArquivoCapitulos.nextLine();
                    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();//TEXTO
                    String textoEscolha = escaneadorArquivoCapitulos.nextLine();
                    linhaEscaneada = escaneadorArquivoCapitulos.nextLine();//PROXIMO
                    String proximoEscolha = escaneadorArquivoCapitulos.nextLine();
                    capitulos.get(origemEscolha).getEsc().add(new Escolha(textoEscolha, capitulos.get(proximoEscolha)));

                }
                
            }        
            escaneadorArquivoCapitulos.close();
        }
        
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return capitulos;
    }
}
