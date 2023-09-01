import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Capitulo {
    //Define os atributos String Nome, Texto, Opções, Array de Escolhas e String edmessage
    protected String nome;
    protected String texto;
    protected String opçoes;
    protected ArrayList<Escolha> escolhas;
    protected String edmessage;
    protected Personagem alteravida;//Usado para indicar qual personagem terá a vida alterada em cada capt.
    //Define a variável int ateracaoEnergia e a variável ganhar ou perder
    protected int alteracaoEnergia;
    protected int gop;
    public Capitulo(HashMap<String, Capitulo> capitulos,
     HashMap<String, Personagem> personagens, Scanner escaneadorArquivoCapitulos)
     {
        escaneadorArquivoCapitulos.nextLine(); //NOME
        String nomeCapitulo = escaneadorArquivoCapitulos.nextLine();
        escaneadorArquivoCapitulos.nextLine();//TEXTO
        String textoCapitulo = escaneadorArquivoCapitulos.nextLine();
        escaneadorArquivoCapitulos.nextLine();//OPÇOES
        String opçoesCapitulo = escaneadorArquivoCapitulos.nextLine();
        escaneadorArquivoCapitulos.nextLine();//PERSONAGEM
        String personagemCapitulo = escaneadorArquivoCapitulos.nextLine();
        escaneadorArquivoCapitulos.nextLine();//EDMESSAGE
        String edMessageCapitulo = escaneadorArquivoCapitulos.nextLine();
        escaneadorArquivoCapitulos.nextLine();//GANHA OU PERDE 
        int gopCapitulo = Integer.parseInt(escaneadorArquivoCapitulos.nextLine());
        escaneadorArquivoCapitulos.nextLine();//ALTERA ENERGIA
        int alteraEnergiaCapitulo = Integer.parseInt(escaneadorArquivoCapitulos.nextLine());
        setCapitulo(nomeCapitulo, textoCapitulo, opçoesCapitulo,
         personagens.get(personagemCapitulo), edMessageCapitulo, gopCapitulo,
         alteraEnergiaCapitulo);
    }
    public String getCapitulo(){
        return this.nome;
    }
    public String getText(){
        return this.texto;
    }
    public String getEdMessage(){
        return this.edmessage;
    }
    public int getalteracaoEnergia(){
        return this.alteracaoEnergia;
    }
    public String getOpcoes()
    {
        return this.opçoes;
    }
    public String getImg(){
        return null;
    }
    //Define o capitulo e todos os atributos
    public void setCapitulo(String nome, String texto, String opçoes, Personagem alteravida,
     String edmessage, int gop, int alteracaoEnergia){
        this.nome = nome;
        this.texto = texto;
        this.opçoes = opçoes;
        this.alteravida = alteravida;
        this.edmessage = edmessage;
        this.gop = gop;
        this.alteracaoEnergia = alteracaoEnergia;

    }
    public void setEsc()
    {
        escolhas = new ArrayList<>();  
    }
    public ArrayList<Escolha> getEsc()
    {
        return escolhas; 
    }
    //Método que altera a vida de um personagem
    public String persoVida()
    {
        String perdeuOuGanhou = alteravida.alterarSaude(gop, alteracaoEnergia);

        return perdeuOuGanhou;
    }
}
