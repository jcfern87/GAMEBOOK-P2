import java.util.Scanner;

public class Historia {
    public static void main(String[] args) throws Exception {
        /* Defines a Scanner variable to receive data from user */
        Scanner escaneador = new Scanner(System.in);
        // Define os personagens e atribui o nome e saúde a ambos
        Personagem char1 = new Personagem();
        Personagem char2 = new Personagem();
        char1.setNome("Derrick");
        char2.setNome("Morris");
        char1.setSaude(50);
        char2.setSaude(40);
        // Inicia a história
        System.out.println("CAPÍTULO 1 - A FUGA.\n\n\n");
        System.out.println(
            "Era uma noite fria e escura. A lua majestosamente reluzia, e as terras embaixo resplandeciam. Um rapaz\n"
            + "de nome " + char1.getNome()
            + " corria o mais rápido que podia enquanto seus pés afundavam na neve espessa.\n"
            + "Ele usava uma roupa alaranjada, e não tinha quaisquer tipo de calçados. Sua respiração estava ofegante.\n\n"
            + char1.getNome() + ": 'Tenho que fugir, tenho que fugir...'\n\n"
            + "Repetidamente dizia isso para si mesmo. Não muito longe dali ecoavam sirenes, e podia se ver luzes.\n"
            + "Vindo de grandes holofotes, as luzes procuravam por algo, e inúmeros indivíduos de roupa azul escuro corriam com lanternas.\n"
            + "Era uma prisão, e nosso " + char1.getNome() + " havia fugido.\n\n"
            + "Após certo tempo correndo como se não houvesse amanhã, o rapaz eventualmente chega em uma floresta escura, repleta\n"
            + "de árvores que dificultavam o uso de holofotes. Antes de cpnseguir se apoiar em um tronco, o homem\n"
            + "desmaia, e cai de cara na neve fofa. Antes de apagar, ele consegue ver as pernas de alguém, parecia um lenhador.\n\n"
            + "~ QUEBRA DE TEMPO ~\n\n"
            + "Enquanto lentamente recompõe os sentidos, " + char1.getNome()
            + " sente um pequeno calor na sua frente." + "Um tipo de calor confortante.\n"
            + "Ao abrir os olhos, " + char1.getNome()
            + " percebe que é uma vela. Uma vela que foi recentemente acendida.\n"
            + "Uma voz ressoa a sala escura, pois a vela era a única fonte de luz.\n"
            + "\n???: 'Finalmente acordou.'\n\n" + "É uma voz áspera, certamente vinda de um velho.\n\n"
            + "???:'Não tinha certeza de se estava vivo, então te trouxe aqui.'"
            + "\n\nSua aparência era assustadora. Sua boca tinha todos os dentes à mostra, mas nenhum parecia real.\n"
            + "Suas pupilas pareciam as de um gato, e sua pele era enrugada, quase esquelética.\n\n"
            + "Velho: 'Eu ouvi barulhos vindo do oeste, não muito lomge daqui. Um prisioneiro deve ter escapado da penitenciária.'"
            + "\n\nA sua dicção era quase perfeita.\n\n"
            + "Velho: 'Quem é você?'\n\n"+ "O homem pondera por uns momentos sobre se deveria revelar sua identidade para o velho que\n"
            + "'lhe-resgatou' ou se finge ser outro alguém. Eventualmente decide mentir.\n\n"
            + "'Sou um viajante que estava passando, acabei me perdendo da trilha e desmaiei por conta da sede.'"
            + "\n\nO idoso não demonstra nenhuma mudança de humor, e apenas continua julgando o rapaz, silenciosamente.\n\n"
            + "Subitamente, o velho pega um garfo que estava na mesa em que ambos estavam sentados e o usa para perfurar o braço de " 
            + char1.getNome()+".\n");
            
        char1.perderSaude(20);//tira 20 pontos de vida do char1
        System.out.println(char1.getNome()+" agoniza e grita por alguns segundos, e tenta colocar a mão na\n" 
           + "região perfurada, mas não consegue pois seu outro braço está amarrado no braço da cadeira. Sentia muita dor.\""
          +"'Dói, não é? Não gosto de mentirosos.\n\n'"+"O velho diz. Em seguida, ele coloca a mão no mesmo garfo, e começa a\n"
          + "mexê-lo, provocando ainda mais dor.");
        char1.perderSaude(5);
        System.out.println(char1.getNome() + " começa a gemer entre dentes, com o corpo tremendo."
        + "\n\n'Diga. O. Seu. Nome.'\n\n"+char1.getNome()+" decide dizer que era um fugitivo.\n\n"+ "O velho sorri.\n"
        +"'Finalmente, um pouco de honestidade.'\n\n"+"Ele retira o garfo do braço de "+char1.getNome()+" e o coloca de volta na mesa,\n"
        +" junto com um prato e uma faca também ensaguentada.\n\n"+"'Não tem problema nenhum em ser um fugitivo, todos\n"
        +"nós fizemos algo de errado alguma vez.'\n\n" +"O velho sorri.\n"+"'Me chamo "+char2.getNome()+", espero que se\n"
        +"sinta em casa.\n\n'"+"Ele fala, enquanto desamarra o braço de "+char1.getNome()+".\n\n"
        +"O rapaz, ainda sentindo dor, olha para o lado, e vê uma janela. Escura, mas uma possível saída."
        +"\n\n1. Digite 'janela' se quiser tentar fugir pela janela."+
        "\n2. Digite 'continue sentado' se não quiser tentar nada.");

        /* Asks for user input */
        boolean check1 = false; // Creates a check variable to use as a condition to the while
        boolean proceed1 = false;
        while(check1 == false){ 
            String resposta1 = escaneador.nextLine(); 
            if(resposta1.equalsIgnoreCase("janela")){
                check1 = true;
                /* ENDING 1 - BEAR TRAP */
                System.out.println(char1.getNome() + " rapidamente se levanta da velha cadeira em que está sentado\n"
                    + "e corre para a janela que viu. Era feita de vidro, mas estava tão escuro lá fora que\n"
                    + "não pôde ver nada através dele. No entanto, ele o quebra e pula,\n"
                    + "achando que o velho não seria capaz de persegui-lo. Estava certo.\n "
                    + "\nNo entanto, o alívio durou pouco.\n"
                    + "Assim que ele sai, sente a maciez da neve no pé direito. Uma sensação\n"
                    + "que definitivamente já teve antes, mas algo estava errado.\n"
                    + "Quando o pé esquerdo toca o chão, ele sente uma superfície dura, algo semelhante a metal.\n"
                    + "No entanto, não percebe, pois no mesmo segundo você sente uma dor incrível\n"
                    + "naquele mesmo pé. Uma armadilha para ursos. E "+char1.getNome()+ " foi pego nela.\n"
                    + "E antes mesmo de abri-lo, ele sente um par de mãos envolvendo\n"
                    + "seu pescoço, um deles segurando a mesma faca que viu na mesa, e então,\n"
                    + "em um movimento limpo, sua garganta é cortada.\n");
                char1.perderSaude(25);
                System.out.println("\n\nGAME OVER.\n" + "\nVocê consegui o final 1!");// ends the game     
            }
            else if(resposta1.equalsIgnoreCase("continue sentado")){
                check1 = true;
                proceed1 = true;
                /* Proceeds to next paragraph */
            }
            else {
                /* Informs the user that what was inputted is unrecognized, and restarts the dialog choice */
                System.out.println("Eu não sei como '" + resposta1 + "'");
            }    

        }
        if(proceed1 == true){
            /* Next paragraph, leading to the next choice */
            Boolean check2 = false;
            System.out.println("\n\nApós muitas considerações, "+char1.getNome()+" decide não fazer nada\n"
                + "e espera "+char2.getNome()+" continuar.\n"
                + "\n'Bom' disse "+ char2.getNome() + ". 'Fico feliz em ver que você permaneceu calmo.'\n\n"
                + "'Não recebo muitas visitas, então foi uma surpresa ver você inconsciente em"
                + "a floresta assim.'\n" + "\n'Isso me deixou muito feliz.'\n"
                + "\nEle então se levanta e caminha até o que parecia ser uma geladeira, mas não tinha\n"
                + "potência e não acendeu, então era mais parecido com uma prateleira cara.\n"
                + "Dali ele puxa uma espécie de bolo de aniversário e o traz para a mesa.\n"
                + "Havia 5 velas apagadas no topo e parecia feito em casa. Ele estendeu a mão para\n"
                + "o outro lado da mesa e pega um isqueiro. Quando todas as velas foram acesas, ele\n"
                + "sorriu.\n"+ "\nEle começou a bater palmas e cantar 'Parabéns para mim', pedindo que "+char1.getNome()+ "fizesse o mesmo.\n"
                + "\nAs luzes das velas ajudam o rapaz a ver mais da sala, que revelou uma porta de madeira\n"
                + "à sua esquerda. Não tinha certeza se estava destrancado, mas podia ver a chave na fechadura.\n"
                + "\n\nDigite 'cantar' para cantar e bater palmas junto com o homem, ou"
                + "'porta' para tentar correr para a porta.");
            while(check2 == false){
                String resposta2 = escaneador.nextLine(); 
                if(resposta2.equalsIgnoreCase("cantar")){
                    check2 = true;
                    /* ENDING 2 - AXE */
                    System.out.println("\n\nO homem engole em seco e junta toda a sua coragem para"
                    +"começar a bater palmas em sincronia com o velho. Ele parece mais feliz agora, vendo que\n"
                    + "ambos estão comemorando juntos. Lágrimas escorrem lentamente por seu rosto, mostrando pura alegria.\n"
                    + "Ele começa a rir enquanto bate palmas. 'Isso foi ótimo!'\n"
                    + "'E agora...', ele diz enquanto puxa algo debaixo da mesa.\n"
                    + "\n'Agora vem a piñata!'\n" + "\nEle puxa um machado, e antes que você tivesse qualquer momento\n"
                    + "para reagir, ele o ataca, cortando sua cabeça.\n");
                    char1.perderSaude(25);
                    System.out.println("\n\nGAME OVER.\n" + "\nVocê consegui o final 2!");
                }
                else if(resposta2.equalsIgnoreCase("porta")){
                    check2 = true;
                    /* ENDING 3 - ESCAPE */
                    System.out.println("\n\nO rapaz fecha os olhos e respira lentamente. Enquanto " + char2.getNome()+" está\n"
                    + "distraído, " + char1.getNome() +" decide se levantar de repente e enfiar o bolo nele. Ele\n"
                    + "grita, e "+ char1.getNome() +" rapidamente pega a faca que estava na mesa, e esfaqueia\n"
                    + char2.getNome()+ ".\n" +"Ele cai da cadeira no chão na sua frente.");

                    char2.perderSaude(30); 
                    
                    System.out.println("Ele o encara por alguns segundos\n"
                    + "enquanto tenta recuperar o fôlego e destrancar a porta. Tudo o que o rapaz vê é neve, então ele\n"
                    + "leva uma lâmpada da casa, para ajudar a guiar seu caminho.\n");
                    
                }
                else{
                    /* Informs the user that what was inputted is unrecognized, and restarts the dialog choice */
                System.out.println("Eu não sei como '" + resposta2 + "'.");
                }

            }    

        }
        escaneador.close();
    }
}
