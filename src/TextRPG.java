import java.util.Scanner;

public class TextRPG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HERO! What is YOUR NAME!?\n (enter name)");
        String myName = sc.next();

        System.out.printf("Ah, %s ..tis a fine name indeed... \n Well then, Are you ready to enter the arena? \n (yes or no)\n",myName);
        startGame(sc.next());
    }


    public static void startGame(String yes){
        if (yes == yes){
            System.out.println("Then LET US BEGIN!");
        }
    }



}
