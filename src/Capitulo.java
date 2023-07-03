import java.util.Scanner;

public class Capitulo {
    //Cria uma scanner
    Scanner escane = new Scanner(System.in);
    //Define os atributos String Nome, Texto, Escolha1 e Escolha2
    String nome;
    String texto;
    String escolha1;
    String recebe1;
    String escolha2;
    String recebe2;
    String edmessage;
    //Define o atributo Personagem
    Personagem personagem;
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
    public void setEdMessage(String edmessage){
        this.edmessage = edmessage;
    }
    public void setEsc1(String escolha1, String recebe1){
        this.escolha1 = escolha1;
        this.recebe1 = recebe1;
    }
    public void setEsc2(String escolha2, String recebe2){
        this.escolha2 = escolha2;
        this.recebe2 = recebe2;
    }
    public void setAltEn(int gop, int alteracaoEnergia){
        this.alteracaoEnergia = alteracaoEnergia;
        this.gop = gop;
    }
    //Define o(s) personagem(s)
    public Personagem setPerso(String nome, int saude){
       this.personagem = new Personagem(nome, saude);
       return personagem;       
    }
    //Cria método para mostrar todas as Strings e altera a energia de um ou mais personagens
    public void mostrar(Personagem personagem){
        System.out.println(nome);
        System.out.println(texto);
        if(alteracaoEnergia != 0){
            personagem.alterarSaude(gop, alteracaoEnergia);}
        if(escolha1 != null){
            System.out.println(escolha1);}
        if(escolha2 != null){    
            System.out.println(escolha2);}
        if(edmessage != null){
            System.out.println(edmessage);
        }    
    }
    /*Cria método que detecta a palavra/frase que o jogador digitou
    e retorna como variável int 1 ou 2*/
    public int escolher(){
        Boolean check = false;
        int proceed = 0;
        while(check == false){
            String resposta = escane.nextLine(); 
            if(resposta.equalsIgnoreCase(recebe1)){
                check = true;
                proceed = 1;
            }    
            else if(resposta.equalsIgnoreCase(recebe2)){
                check = true;
                proceed = 2;
            }
            else{
                System.out.println("Eu não sei como '"+ resposta +"'.");
            }            
        }
        return proceed;
    }
}
