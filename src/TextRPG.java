import java.util.Scanner;

public class TextRPG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HERO! What is YOUR NAME!?\n(enter name)");
        String myName = sc.next();

        System.out.printf("Ah, %s ..tis a fine name indeed... \n Well then, Are you ready to enter the arena?\n(yes or no)\n",myName);
        startGame(sc.next());

        //Battle transition
        System.out.println("An ogre steps into the arena \n Health: 1000 - - - - - - - - - -");
        System.out.println("Attack or Defend?");
        String battleInput = sc.next();

    }


    public static void startGame(String input){
        if (input.equals("yes")){
            System.out.println("Then LET US BEGIN!");
        } else if (input.equals("no")){
            System.out.println("TOO BAD ..in you go");
        }

    }

    public static void hero(double health, double attack){

    }

    public static void ogre(double health, double attack){

    }




}
