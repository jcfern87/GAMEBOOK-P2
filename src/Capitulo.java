import java.util.Scanner;

public class Capitulo {
    //Cria uma scanner
    private Scanner escane = new Scanner(System.in);
    //Define os atributos String Nome, Texto, Opções, Array de Escolhas e String edmessage
    private String nome;
    private String texto;
    private String opçoes;
    private Escolha[] escolhas;
    private String edmessage;
    private Personagem alteravida;//Usado para indicar qual personagem terá a vida alterada em cada capt.
    //Define a variável int ateracaoEnergia e a variável ganhar ou perder
    private int alteracaoEnergia;
    private int gop;
    //Define o capitulo e t
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
    public void setEsc(String texto1, Capitulo proximo1, String texto2, Capitulo proximo2){
        escolhas = new Escolha[]{new Escolha(texto1, proximo1),
         new Escolha(texto2, proximo2)};
    //Escolhas são definidas depois pois dependem de que todos os caps e finais estejam definidos     
    }
    //Método que altera a vida de um personagem
    private void persoVida(){
        alteravida.alterarSaude(gop, alteracaoEnergia);
    }
    //Cria método para mostrar todas as Strings e altera a energia de um ou mais personagens
    private void mostrar(){
        System.out.println(nome);
        System.out.println(texto);
        if(alteracaoEnergia != 0){
            persoVida();}
        if(escolhas != null){
            System.out.println(opçoes);}
        if(edmessage != null){
            System.out.println(edmessage);
        }    
    }
    /*Cria método que detecta a palavra/frase que o jogador digitou
    e retorna como variável int 1 ou 2*/
    private Capitulo escolher(){
        Capitulo qual = null;
        Boolean check = false;
        while(check == false){
            String resposta = escane.nextLine(); 
            if(resposta.equalsIgnoreCase(escolhas[0].getTextoEsc())){
                check = true;
                qual = escolhas[0].getProximoEsc();}    
            else if(resposta.equalsIgnoreCase(escolhas[1].getTextoEsc())){
                check = true;
                qual = escolhas[1].getProximoEsc();}
            else{System.out.println("Eu não sei como '"+ resposta +"'.");}}
        return qual;
    }
    //Método principal que executa o código
    public void executar(){
        mostrar();
        if(escolhas != null){
            Capitulo x = escolher();
            x.executar();}
    }
}
