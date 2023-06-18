import java.util.Scanner;

public class BookGame {
    public static void main(String[] args) {
        /* Defines a Scanner variable to receive data from user */
        Scanner escaneador = new Scanner(System.in);
        /* First line of text  */
        System.out.println("You wake up sitting in a hard wood table, in\n" 
        + "a dimly lit room. The room was rather warm, conssidering it was\n" 
        + "winter season, the only source of light was a small fireplace by the\n" 
        + "chimney across the room. As you barely make out the rest of the room,\n" 
        + "you hear a faint voice, coming from across the same table you are sitting in."
        + "\n\n'Grab the knife.'"
        + "\n\nIt was unmistakably a very old man's voice. You could almost see a pair of wrinkled\n"
        + "hands, and a large knife on the center of the table. It looked old, but had traces of blood.\n"
        + "\nYour body trembles in fear, and you desperatly search for a way out.\n"
        + "You're able to make out what seems to be a window in the distance.\n"
        + "It looks closed, but fragile.\n"
        + "\n\nType 'grab the knife' to grab it or 'run for the window' to try and escape.");
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
        System.out.println("Try again?");
        escaneador.close();
    }
}
