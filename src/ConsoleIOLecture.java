import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args){
        System.out.println("Console IO lecture");


        //this
        System.out.println("here");
        System.out.println("there");
        //is the same as
        System.out.print("here\n");
        System.out.print("there\n");

        String firstName = "Darius";
        String lastName = "Brown";
        System.out.println(firstName + " " + lastName);

        System.out.printf("Hello, %s!\n", firstName);
        System.out.printf("Hello, %s %s!\n", firstName, lastName);

        //numbers
        int numberOfPets =3;
        String typeOfPets = "cats";
        System.out.printf("I have a %d %s. \n", numberOfPets,typeOfPets);

        //currency

        float currencyPennies = 1000.001F;
        System.out.printf("My iphone cost $%.2f\n", currencyPennies);

        // USER INPUT

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first name?");
        String userFirstName = sc.next();

        System.out.printf("Nice to meet you, %s ", userFirstName);

        System.out.printf("How old are you?");
        int age = sc.nextInt();

        System.out.printf("Good to hear that you are %d years old.\n", age);

        sc.nextLine();
        System.out.println("Favorite Quote:");
        String favoriteQuote = sc.nextLine();

        System.out.printf("%s, is my favorite quote too.", favoriteQuote);




    }
}
