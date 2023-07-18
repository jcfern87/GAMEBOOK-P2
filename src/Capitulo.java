import java.util.Scanner;

public class Capitulo {
    //Cria uma scanner
    Scanner escane = new Scanner(System.in);
    //Define os atributos String Nome, Texto, Escolha1 e Escolha2
    String nome;
    String texto;
    String opçoes;
    Escolha[] escolhas;
    String edmessage;
    //Define o atributo Personagem
    Personagem personagem;
    Personagem alteravida;
    //Define a variável int ateracaoEnergia e a variável ganhar ou perder
    int alteracaoEnergia;
    int gop;
    //Define o nome como parâmetro
    public Capitulo(String nome){
        this.nome = nome;
    }
    //Define métodos para associar resto dos valores para os atributos
    public void setTexto(String texto){
        this.texto = texto;
    }
    public void setOp(String opçoes){
        this.opçoes = opçoes;
    }
    public void setPerde(Personagem alteravida){
        this.alteravida = alteravida;
    }
    public void setEdMessage(String edmessage){
        this.edmessage = edmessage;
    }
    public void setEsc(Escolha[] escolhas){
        this.escolhas = escolhas;
    }
    public void setAltEn(int gop, int alteracaoEnergia){
        this.alteracaoEnergia = alteracaoEnergia;
        this.gop = gop;
    }
    public void persoVida(){
        alteravida.alterarSaude(gop, alteracaoEnergia);
    }
    //Define o(s) personagem(s)
    public Personagem setChar(String nome, int saude){
       this.personagem = new Personagem(nome, saude);
       return personagem;       
    }
    //Cria método para mostrar todas as Strings e altera a energia de um ou mais personagens
    public void mostrar(){
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
    public Capitulo escolher(){
        Capitulo qual = null;
        Boolean check = false;
        while(check == false){
            String resposta = escane.nextLine(); 
            if(resposta.equalsIgnoreCase(escolhas[0].texto)){
                check = true;
                qual = escolhas[0].próximo;}    
            else if(resposta.equalsIgnoreCase(escolhas[1].texto)){
                check = true;
                qual = escolhas[1].próximo;}
            else{System.out.println("Eu não sei como '"+ resposta +"'.");}}
        return qual;
    }
    public void executar(){
        mostrar();
        if(escolhas != null){
            Capitulo x = escolher();
            x.executar();}
    }
}
