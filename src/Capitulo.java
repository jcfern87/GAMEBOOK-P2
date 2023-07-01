public class Capitulo {
    //Define os atributos String Nome, Texto, Escolha1 e Escolha2
    String nome;
    String texto;
    String escolha1;
    String escolha2;
    //Define o atributo Personagem
    Personagem personagem;
    //Define a variável int ateracaoEnergia
    int alteracaoEnergia;
    //Define o nome como parâmetro
    public Capitulo(String nome){
        this.nome = nome;
    }
    //Define métodos para associar resto dos valores para os atributos
    public void setTexto(String texto){
        this.texto = texto;
    }
    public void setEsc1(String escolha1){
        this.escolha1 = escolha1;
    }
    public void setEsc2(String escolha2){
        this.escolha2 = escolha2;
    }
    public void setAltEn(int alteracaoEnergia){
        this.alteracaoEnergia = alteracaoEnergia;
    }
    //Define o(s) personagem(s)
    public void setPerso(Personagem personagem){
       this.personagem = personagem;        
    }
    //Cria método para mostrar todas as Strings e altera a energia de um ou mais personagens
    public void mostrar(){
        System.out.println(nome);
        System.out.println(texto);
        personagem.perderSaude(alteracaoEnergia);
        System.out.println(escolha1);
        System.out.println(escolha2);
    }

}
