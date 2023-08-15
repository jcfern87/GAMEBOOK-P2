import java.util.HashMap;

public class Historia {
    public static void main(String[] args) throws Exception {

        Leitor leitor = new Leitor();
        HashMap<String, Personagem> personagens = leitor.lerPerso("rsc/personagens.txt");
        HashMap<String, Capitulo> capitulos = leitor.lerCap("rsc/capitulos.txt", personagens);
        //Define o capítulo raiz(primeiro capítulo)
        Capitulo raiz = capitulos.get("CAPÍTULO 1~~~~~~~~~~~~~~~~~~");
        //Inicia a história e organiza os capítulos
        raiz.executar();
    }
}