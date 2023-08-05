public class Escolha {
    //Define os atributos da classe Escolha que servirá para fazer as listas ligadas
    private String texto; //Armazena o texto da escolha
    private Capitulo proximo; /*Caso o jogador opte por esta escolha, este atributo indicará qual capítulo virá como
    consequência dessa escolha*/
    
    Escolha(String texto, Capitulo proximo){ //define o construtor do objeto escolha
        this.texto = texto;
        this.proximo = proximo;
    }
    public String getTextoEsc(){
        String textoParaCapitulo = texto;
        return textoParaCapitulo;
}
    public Capitulo getProximoEsc(){
        Capitulo proximoParaCapitulo = proximo;
        return proximoParaCapitulo;
}
}
