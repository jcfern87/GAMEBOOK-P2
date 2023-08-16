import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    //Cria uma scanner
    private Scanner escane = new Scanner(System.in);
    //Define os atributos String Nome, Texto, Opções, Array de Escolhas e String edmessage
    private String nome;
    private String texto;
    private String opçoes;
    private ArrayList<Escolha> escolhas;
    private String edmessage;
    private Personagem alteravida;//Usado para indicar qual personagem terá a vida alterada em cada capt.
    //Define a variável int ateracaoEnergia e a variável ganhar ou perder
    private int alteracaoEnergia;
    private int gop;
    //Define o capitulo e todos os atributos
    public Capitulo(String nome, String texto, String opçoes, Personagem alteravida, String edmessage,
     int gop, int alteracaoEnergia){
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
    private void persoVida()
    {
        alteravida.alterarSaude(gop, alteracaoEnergia);
    }
    //Cria método para mostrar todas as Strings e altera a energia de um ou mais personagens
    private void mostrar(){
        System.out.println();
        System.out.println(nome);
        System.out.println();
        System.out.println(texto);
        System.out.println();
        if(alteracaoEnergia != 0){
            persoVida();
            System.out.println();
        }
        if(opçoes != null){
            System.out.println(opçoes);
            System.out.println();
        }
        if(edmessage != null){
            System.out.println(edmessage);
            System.out.println();
        }    
    }
    /*Cria método que detecta a palavra/frase que o jogador digitou
    e retorna como variável int 1 ou 2*/
    private Capitulo escolher(){
        Capitulo qual = null;
        Boolean check = false;
        while(check == false){
            String resposta = escane.nextLine(); 
            if(resposta.equalsIgnoreCase(escolhas.get(0).getTextoEsc())){
                check = true;
                qual = escolhas.get(0).getProximoEsc();}    
            else if(resposta.equalsIgnoreCase(escolhas.get(1).getTextoEsc())){
                check = true;
                qual = escolhas.get(1).getProximoEsc();}
            else{System.out.println("Eu não sei como '"+ resposta +"'.");}}
        return qual;
    }
    //Método principal que executa o código
    public void executar(){
        mostrar();
        if(opçoes != null){
            Capitulo x = escolher();
            x.executar();}
    }
}
