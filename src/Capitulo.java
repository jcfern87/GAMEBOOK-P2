import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    //Cria uma scanner
    Scanner escane = new Scanner(System.in);
    //Define os atributos String Nome, Texto, Escolha1 e Escolha2
    String nome;
    String texto;
    ArrayList<String> escolhas;
    ArrayList<String> recebes;
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
    public void setEsc(ArrayList<String> escolhas, ArrayList<String> recebes){
        this.escolhas = escolhas;
        this.recebes = recebes;
    }
    public void addEsc(String escolha, String recebe){
        escolhas.add(escolha);
        recebes.add(recebe);
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
        if(escolhas != null){
            for(int i = 0; i < escolhas.size(); i++)
                System.out.println(escolhas.get(i));}
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
            if(resposta.equalsIgnoreCase(recebes.get(0))){
                check = true;
                proceed = 0;
            }    
            else if(resposta.equalsIgnoreCase(recebes.get(1))){
                check = true;
                proceed = 1;
            }
            else{
                System.out.println("Eu não sei como '"+ resposta +"'.");
                
            }            
        }
        return proceed;
    }
}
