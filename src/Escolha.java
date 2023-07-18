public class Escolha {
    //Define os atributos da classe Escolha que servirá para fazer as listas ligadas
    String texto; //Armazena o texto da escolha
    Capitulo próximo; /*Caso o jogador opte por esta escolha, este atributo indicará qual capítulo virá como
    consequência dessa escolha*/
    
    Escolha(String texto, Capitulo próximo){ //define o construtor do objeto escolha
        this.texto = texto;
        this.próximo = próximo;
    }
}
