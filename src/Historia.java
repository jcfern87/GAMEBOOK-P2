import java.util.ArrayList;

public class Historia {
    public static void main(String[] args) throws Exception {
        // Define o capítulo 1 e seus atributos
        Capitulo cap1 = new Capitulo("CAPÍTULO 1~~~~~~~~~~~~~~~~~~");
        Personagem char1 = cap1.setPerso("Derek", 50);
        Personagem char2 = cap1.setPerso("Morris", 50);
        ArrayList<String> escolhascap1 = new ArrayList<String>();
        ArrayList<String> recebascap1 = new ArrayList<String>();
        cap1.setEsc(escolhascap1, recebascap1);
        cap1.setTexto("Era uma noite fria e escura. A lua majestosamente reluzia, e as terras embaixo" 
            + "resplandeciam. Um rapaz\n"
            + "de nome " + char1.getNome()
            + " corria o mais rápido que podia enquanto seus pés afundavam na neve espessa.\n"
            + "Ele usava uma roupa alaranjada, e não tinha quaisquer tipo de calçados."
            +" Sua respiração estava ofegante.\n\n"
            + char1.getNome() 
            + ": 'Tenho que fugir, tenho que fugir...'\n\n"
            + "Repetidamente dizia isso para si mesmo. Não muito longe dali ecoavam sirenes,"
            +" e podia se ver luzes.\n"
            + "Vindo de grandes holofotes, as luzes procuravam por algo,"
            +" e inúmeros indivíduos de roupa azul escuro corriam com lanternas.\n"
            + "Era uma prisão, e nosso " + char1.getNome() + " havia fugido.\n\n"
            + "Após certo tempo correndo como se não houvesse amanhã, o rapaz eventualmente chega"
            +" em uma floresta escura, repleta\n"
            + "de árvores que dificultavam o uso de holofotes. Antes de cpnseguir se apoiar em um tronco,"
            +" o homem\n"
            + "desmaia, e cai de cara na neve fofa. Antes de apagar, ele consegue ver as pernas de alguém,"
            +" parecia um lenhador.\n\n"
            + "~ QUEBRA DE TEMPO ~\n\n"
            + "Enquanto lentamente recompõe os sentidos, " + char1.getNome()
            + " sente um pequeno calor na sua frente." + "Um tipo de calor confortante.\n"
            + "Ao abrir os olhos, " + char1.getNome()
            + " percebe que é uma vela. Uma vela que foi recentemente acendida.\n"
            + "Uma voz ressoa a sala escura, pois a vela era a única fonte de luz.\n"
            + "\n???: 'Finalmente acordou.'\n\n"
            + "É uma voz áspera, certamente vinda de um velho.\n\n"
            + "???:'Não tinha certeza de se estava vivo, então te trouxe aqui.'"
            + "\n\nSua aparência era assustadora. Sua boca tinha todos os dentes à mostra, mas"
            +" nenhum parecia real.\n"
            + "Suas pupilas pareciam as de um gato, e sua pele era enrugada, quase esquelética.\n\n"
            + "Velho: 'Eu ouvi barulhos vindo do oeste, não muito longe daqui."
            + "Um prisioneiro deve ter escapado da penitenciária.'"
            + "\n\nA sua dicção era quase perfeita.\n\n"
            + "Velho: 'Quem é você?'\n\n"
            + "O homem pondera por uns momentos sobre se deveria revelar sua identidade para o velho que\n"
            + "'lhe-resgatou' ou se finge ser outro alguém. Eventualmente decide mentir.\n\n"
            + "'Sou um viajante que estava passando,\n" 
            + "acabei me perdendo da trilha e desmaiei por conta da sede.'"
            + "\n\nO idoso não demonstra nenhuma mudança de humor, e apenas continua julgando o rapaz,"
            +" silenciosamente.\n\n"
            + "Subitamente, o velho pega um garfo que estava na mesa em que"
            +" ambos estavam sentados e o usa para perfurar o braço de " 
            + char1.getNome()
            +".\n" + char1.getNome()+" agoniza e grita por alguns segundos, e tenta colocar a mão na\n" 
            + "região perfurada, mas não consegue pois seu outro braço está amarrado no braço da cadeira."
            +" Sentia muita dor.\""
            +"'Dói, não é? Não gosto de mentirosos.\n\n'"
            +"O velho diz. Em seguida, ele coloca a mão no mesmo garfo, e começa a\n"
            + "mexê-lo, provocando ainda mais dor.\n\n" + char1.getNome() 
            + " começa a gemer entre dentes, com o corpo tremendo."
            + "\n\n'Diga. O. Seu. Nome.'\n\n"+char1.getNome()
            +" decide dizer que era um fugitivo.\n\n"+ "O velho sorri.\n"
            +"'Finalmente, um pouco de honestidade.'\n\n"
            +"Ele retira o garfo do braço de "+char1.getNome()
            +" e o coloca de volta na mesa,\n"
            +" junto com um prato e uma faca também ensaguentada.\n\n"
            +"'Não tem problema nenhum em ser um fugitivo, todos\n"
            +"nós fizemos algo de errado alguma vez.'\n\n" +"O velho sorri.\n"
            +"'Me chamo "+char2.getNome()+", espero que se\n"
            +"sinta em casa.\n\n'"+"Ele fala, enquanto desamarra o braço de "+char1.getNome()+".\n\n"
            +"O rapaz, ainda sentindo dor, olha para o lado, e vê uma janela."
            +" Escura, mas uma possível saída.\n\n");
        cap1.setAltEn(2, 25);    
        cap1.addEsc("\n\n1. Digite 'janela' se quiser tentar fugir pela janela.\n\n",
        "janela");
        cap1.addEsc("2. Digite 'continue sentado' se não quiser tentar nada.\n\n",
         "continue sentado");
        //Define o primeiro final
        Capitulo end1 = new Capitulo("\n\nENDING 1 - ARMADILHA DE URSO~~~~~~~~~~~~~~~~\n\n");
        end1.setAltEn(2, 25);
        end1.setTexto(char1.getNome() + " rapidamente se levanta da velha cadeira em que está sentado\n"
                + "e corre para a janela que viu. Era feita de vidro, mas estava tão escuro lá fora que\n"
                + "não pôde ver nada através dele. No entanto, ele o quebra e pula,\n"
                + "achando que o velho não seria capaz de persegui-lo. Estava certo.\n "
                + "\nNo entanto, o alívio durou pouco.\n"
                + "Assim que ele sai, sente a maciez da neve no pé direito. Uma sensação\n"
                + "que definitivamente já teve antes, mas algo estava errado.\n"
                + "Quando o pé esquerdo toca o chão, ele sente uma superfície dura,"
                +" algo semelhante a metal.\n"
                + "No entanto, não percebe, pois no mesmo segundo você sente uma dor incrível\n"
                + "naquele mesmo pé. Uma armadilha para ursos. E "+char1.getNome()+ " foi pego nela.\n"
                + "E antes mesmo de abri-lo, ele sente um par de mãos envolvendo\n"
                + "seu pescoço, um deles segurando a mesma faca que viu na mesa, e então,\n"
                + "em um movimento limpo, sua garganta é cortada.\n\n\n");
        end1.setEdMessage("FIM DE JOGO.\n\n" + "Você conseguiu o final 1!");
        //Define o cap2 e seus atributos        
        Capitulo cap2 = new Capitulo("CAPÍTULO 2~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        ArrayList<String> escolhascap2 = new ArrayList<String>();
        ArrayList<String> recebascap2 = new ArrayList<String>();
        cap2.setEsc(escolhascap2, recebascap2);
        cap2.setTexto("\n\nApós muitas considerações, "+char1.getNome()+" decide não fazer nada\n"
                + "e espera "+char2.getNome()+" continuar.\n"
                + "\n'Bom' disse "+ char2.getNome() + ". 'Fico feliz em ver que você permaneceu calmo.'\n\n"
                + "'Não recebo muitas visitas, então foi uma surpresa ver você inconsciente em"
                + "a floresta assim.'\n" + "\n'Isso me deixou muito feliz.'\n"
                + "\nEle então se levanta e caminha até o que parecia ser uma geladeira, mas não tinha\n"
                + "potência e não acendeu, então era mais parecido com uma prateleira cara.\n"
                + "Dali ele puxa uma espécie de bolo de aniversário e o traz para a mesa.\n"
                + "Havia 5 velas apagadas no topo e parecia feito em casa. Ele estendeu a mão para\n"
                + "o outro lado da mesa e pega um isqueiro. Quando todas as velas foram acesas, ele\n"
                + "sorriu.\n"+ "\nEle começou a bater palmas e cantar 'Parabéns para mim', pedindo que "
                + char1.getNome()+ "fizesse o mesmo.\n"
                + "\nAs luzes das velas ajudam o rapaz a ver mais da sala,"
                +" que revelou uma porta de madeira\n"
                + "à sua esquerda. Não tinha certeza se estava destrancado,"
                +" mas podia ver a chave na fechadura.\n\n\n");
        cap2.setAltEn(0, 0);
        cap2.addEsc("1. Digite 'cantar' para cantar e bater palmas junto com o homem.\n\n",
         "cantar");
        cap2.addEsc("2. Digite 'porta' para tentar correr para a porta.",
         "porta");
        //Define o final 2
        Capitulo end2 = new Capitulo("ENDING 2 - MACHADO~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        end2.setAltEn(2, 25);
        end2.setTexto("\n\nO homem engole em seco e junta toda a sua coragem para"
                +"começar a bater palmas em sincronia com o velho. Ele parece mais"
                +" feliz agora, vendo que\n"
                + "ambos estão comemorando juntos. Lágrimas escorrem lentamente por seu rosto,"
                +" mostrando pura alegria.\n"
                + "Ele começa a rir enquanto bate palmas. 'Isso foi ótimo!'\n"
                + "'E agora...', ele diz enquanto puxa algo debaixo da mesa.\n"
                + "\n'Agora vem a piñata!'\n" + "\nEle puxa um machado, e antes que"
                +" você tivesse qualquer momento\n"
                + "para reagir, ele o ataca, cortando sua cabeça.\n\n\n");
        end2.setEdMessage("FIM DE JOGO.\n\n" + "Você conseguiu o final 2!");
        Capitulo end3 = new Capitulo("ENDING 3 - VITÓRIA~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        end3.setAltEn(2, 40);
        end3.setTexto("\n\nO rapaz fecha os olhos e respira lentamente. Enquanto " + char2.getNome()
                +" está\n"
                + "distraído, " + char1.getNome() +" decide se levantar de repente"
                +" e enfiar o bolo nele. Ele\n"
                + "grita, e "+ char1.getNome() +" rapidamente pega a faca"
                +" que estava na mesa, e esfaqueia\n"
                + char2.getNome()+ ".\n" 
                +"Ele cai da cadeira no chão na sua frente."
                + "Ele o encara por alguns segundos\n"
                + "enquanto tenta recuperar o fôlego e destrancar a porta."
                +" Tudo o que o rapaz vê é neve, então ele\n"
                + "leva uma lâmpada da casa, para ajudar a guiar seu caminho.\n\n\n");
        end3.setEdMessage("FIM DE JOGO.\n\n" + "Você conseguiu o final 3(verdadeiro)!");
        //Inicia a história e organiza os capítulos
        cap1.mostrar(char1);
        int proceed1 = cap1.escolher();
        int proceed2 = - 1;
        if(proceed1 == 1){
                cap2.mostrar(char1);
                proceed2 = cap2.escolher();
        }                                  
        else if(proceed1 == 0){
                end1.mostrar(char1);
        }
                
        if(proceed2 == 0){
                end2.mostrar(char1);
        }
        else if(proceed2 == 1){
                end3.mostrar(char2);
        }
    }
}
