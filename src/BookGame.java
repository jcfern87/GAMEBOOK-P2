import java.util.Scanner;

public class BookGame {
    public static void main(String[] args) {
        /* Defines a Scanner variable to receive data from user */
        Scanner escaneador = new Scanner(System.in);
        /* First line of text  */
        System.out.println("You wake up sitting in a hard wood table, in\n" 
        + "a dimly lit room. As you barely make out the rest of the room,\n" 
        + "you hear a faint voice, coming from across the same table you are sitting in."
        + "\n\n'Grab the knife.'"
        + "\n\nIt was unmistakably a very old man's voice. You could almost see a pair of wrinkled\n"
        + "hands, and a large knife on the center of the table. It looked old, but had traces of blood.\n"
        + "\nYour body trembles in fear, and you desperatly search for a way out.\n"
        + "You're able to make out what seems to be a window in the distance.\n"
        + "It looks closed, but fragile.\n"
        + "\n\nType 'grab the knife' to grab it or 'run for the window' to try and escape.");
        /* Asks for user input */
        boolean check = false;
        while(check == false){
            String resposta = escaneador.nextLine(); 
            if(resposta == "run for the window"){
                check = true;
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
                    + "And before you could even pry it open, you feel a pair of hands enveloping around your neck,\n" 
                    + "one of them holding the same knife you saw at the table, and then, your throat is sliced\n"
                    + "in one clean move.\n"
                    + "\n\nGAME OVER.\n" + "\nYou got ending 1!");     
            }
            else if(resposta == "grab the knife"){
                check = true;
                /* Proceeds to next paragraph */
                System.out.println("\n\nHesitantly, you decide to follow the man's instructions\n"
                + "and grab the knife in front of you. It showed some age, with a bit of rust on the edges,\n"
                + "but it seemed recently used. The sensation that it was used to kill was palpable.\n"
                + "\n'Good' said the stranger. Glad to see you remained calm.");
            }
            else {
                System.out.println("I don't know how to '" + resposta + "'");
            }    

        }
    }
}
