import java.util.ArrayList;
import java.util.Scanner;

public class CapituloImagem extends Capitulo{
    
    public CapituloImagem(String imagem, String nome, String texto, String opçoes, Personagem alteravida, String edmessage, int gop,
            int alteracaoEnergia)
    {
        super(nome, texto, opçoes, alteravida, edmessage, gop, alteracaoEnergia);
        this.imagem = imagem;
        
    }
    private String imagem; 
    private Scanner escane = new Scanner(System.in);
    private ArrayList<Escolha> escolhas;
    public void setEsc()
    {
        escolhas = new ArrayList<>();  
    }
    public ArrayList<Escolha> getEsc()
    {
        return escolhas; 
    }
    //Cria método para mostrar todas as Strings e altera a energia de um ou mais personagens
    protected void mostrar(){
        System.out.println(imagem);
        System.out.println();
        super.mostrar();
    }
    /*Cria método que detecta a palavra/frase que o jogador digitou
    e retorna como variável int 1 ou 2*/
    protected Capitulo escolher(){
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
