import java.util.Scanner;

public class História {
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
            "Era uma noite fira e escura. A lua majestosamente reluzia, e as terras embaixo resplandeciam. Um rapaz\n"
            + "de nome " + char1.getNome()
            + "corria o mais rápido que podia enquanto seus pés afundavam na neve espessa.\n"
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
            + "\n\nSua aparência era assustadora. Sua boca tinha apenas 6 dentes à mostra, suas pupilas pareciam as de um gato,"
            + "e sua pele era enrugada, quase esquelética.\n\n"
            + "Velho: 'Eu ouvi barulhos vindo do oeste, não muito lomge daqui. Um prisioneiro deve ter escapado da penitenciária.'"
            + "\n\nA sua dicção quase perfeita era surpreendente, visto o estado dos dentes dele.\n\n"
            + "Velho: 'Quem é você?'\n\n"+ "O homem pondera por uns momentos sobre se deveria revelar sua identidade para o velho que\n"
            + "'lhe-resgatou' ou se finge ser outro alguém. Eventualmente decide mentir.\n\n"
            + "'Sou um viajante que estava passando, acabei me perdendo da trilha e desmaiei por conta da sede.'"
            + "\n\nO idoso não demonstra nenhuma mudança de humor, e apenas continua julgando o rapaz, silenciosamente.\n\n"
            + "Subitamente, o velho pega um garfo que estava na mesa em que ambos estavam sentados e o usa para perfurar o braço de " 
            + char1.getNome()+".\n"+char1.perderSaude(20));
        /* Asks for user input */
        boolean check1 = false; // Creates a check variable to use as a condition to the while
        boolean proceed1 = false;
        while(check1 == false){ 
            String resposta1 = escaneador.nextLine(); 
            if(resposta1.equalsIgnoreCase("run for the window")){
                check1 = true;
                /* ENDING 1 - BEAR TRAP */
                System.out.println("\n\nYou quickly get up from the old chair you we're sitting in\n"
                    + "and rush to the window you saw. It was made of glass, but it was so dark outside\n" 
                    + "you couldn't see a thing through it. Nonetherless, you break it and jump out,\n"
                    + "judging the old man wouldn't be able to chase you. You were right.\n " 
                    + "\nHowever, the relief was short-lived.\n"
                    + "As soon as you step out, you feel the softness of snow on your right foot. A sensation\n"
                    + "you've definetly had before, but something was off.\n"
                    + "When your left foot reaches the ground, you feel a hard surface, something akin to metal.\n"
                    + "However, you don't notice it, since in the exact same second you feel incredible pain on\n"
                    + "that same foot. A bear trap. And you got caught in it.\n"
                    + "And before you could even pry it open, you feel a pair of hands enveloping around\n" 
                    + "your neck, one of them holding the same knife you saw at the table, and then,\n"
                    + "in one clean move, your throat is sliced.\n"
                    + "\n\nGAME OVER.\n" + "\nYou got ending 1!");// ends the game     
            }
            else if(resposta1.equalsIgnoreCase("grab the knife")){
                check1 = true;
                proceed1 = true;
                /* Proceeds to next paragraph */
            }
            else {
                /* Informs the user that what was inputted is unrecognized, and restarts the dialog choice */
                System.out.println("I don't know how to '" + resposta1 + "'");
            }    

        }
        if(proceed1 == true){
            /* Next paragraph, leading to the next choice */
            Boolean check2 = false;
            System.out.println("\n\nHesitantly, you decide to follow the man's instructions\n"
                + "and grab the knife in front of you. It showed some age, with a bit of rust on the edges,\n"
                + "but it seemed recently used. The sensation that it was used to kill was palpable.\n"
                + "\n'Good' said the stranger. 'Glad to see you remained calm.'\n" 
                + "\nHe uses his left hand to grab another knife that was in his pocket."
                + "'I don't get many visitors, so it was a surprise seeing you unconscious on"
                + "the forest like that.'\n" + "\n'It made me very happy.'\n"
                + "\nHe then gets up and walks to what looked like a fridge, but it had no\n"
                + "power and didn't light up, so it was more akin to an expensive shelf.\n"
                + "From there he pulls some sort of birthday cake, and brings it to the table.\n"
                + "There were 5 unlit candles on the top, and it looked homemade. He reaches for\n"
                + "the other side of the table and grabs a lighter. When all candles were lit, he\n"
                + "smiled eerily, showing he only had 5 front teeth. He was also very ugly.\n"
                + "\nHe began clapping and singing 'Happy birthday to me', urging you to do the same.\n"
                + "\nThe candle lights helped you see more of the room, which revealed a wooden door\n"
                + "by your left. You weren't sure if it was unlocked, but you could see the key in the lock.\n"
                + "\n\nType in 'sing' to sing and clap along with the man, or"
                + "'door' to try and rush for the door.");
            while(check2 == false){
                String resposta2 = escaneador.nextLine(); 
                if(resposta2.equalsIgnoreCase("sing")){
                    check2 = true;
                    /* ENDING 2 - AXE */
                    System.out.println("\n\nYou swallow hard, and muster up all your courage to\n"
                    +"start clapping in sync with the old man. He looks happier now, seeing you're\n"
                    + "both celebrating together. Tears slowly run down his face, showing pure joy.\n"
                    + "He starts to laugh while clapping his hands. 'That was great!'\n"
                    + "'And now...', he says while pulling something from under the table.\n"
                    + "\n'Now comes the piñata!'\n" + "\nHe pulls out an axe, and before you had any moment\n"
                    + "to react, he swings it at you, slicing your head off.\n"
                    + "\n\nGAME OVER.\n" + "You got ending 2!");
                }
                else if(resposta2.equalsIgnoreCase("door")){
                    check2 = true;
                    /* ENDING 3 - ESCAPE */
                    System.out.println("\n\nYou close your eyes, and breathe in slowly. While the old man's\n"
                    + "distracted, you decide to suddendly get up, and push the cake into him. He\n"
                    + "screams, and you punch him, trying to knock him unconscious. You somehow succeed, and\n"
                    + "he falls off the chair to the ground in front of you. You stare at him for a few seconds\n"
                    + "while trying to catch your breath, and unlock the door. All you see is snow, so you\n"
                    + "take a lamp from this house, to help guide your way.\n"
                    + "\n\n THE END.\n\n You got ending 3!(True Ending)");
                }
                else{
                    /* Informs the user that what was inputted is unrecognized, and restarts the dialog choice */
                System.out.println("I don't know how to '" + resposta2 + "'");
                }

            }    

        }
        escaneador.close();
    }
}
