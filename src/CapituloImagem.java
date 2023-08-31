import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CapituloImagem extends Capitulo{
    
    private String imagem; 
    private ArrayList<Escolha> escolhas;
    public CapituloImagem(HashMap<String, Capitulo> capitulos,
                                  HashMap<String, Personagem> personagens,
                                  Scanner escaneadorArquivoCapitulos)
    {                
        super(capitulos, personagens, escaneadorArquivoCapitulos);
        String imagemCapitulo = lerImg(escaneadorArquivoCapitulos);
        setImagem(imagemCapitulo);
    }
    public void setImagem(String imagem){
        this.imagem = imagem;
    }
    public String getCapituloImagem(){
        return this.nome;
    }
    public String getText(){
        return super.getText();
    }
    public void setEsc()
    {
        escolhas = new ArrayList<>();  
    }
    public ArrayList<Escolha> getEsc()
    {
        return escolhas; 
    }
    public String getImg(){
        return this.imagem;
    }
    //Cria método para mostrar todas as Strings e altera a energia de um ou mais personagens
    protected void mostrar(){
        System.out.println(imagem);
        System.out.println();
        super.mostrar();
    }
    //Lê uma imagem num txt
    protected String lerImg(Scanner escaneadorArquivoCapitulos)
    {
                String imagem = "";
                String linha = escaneadorArquivoCapitulos.nextLine();
                while(!linha.equals("IMG_END")){
                    linha = escaneadorArquivoCapitulos.nextLine();
                    if(!linha.equals("IMG_END")){
                        linha += "\n";
                        imagem += linha;
                    } 
                }
                return imagem;
    }
    
}
