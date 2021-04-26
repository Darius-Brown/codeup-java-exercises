import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        boolean isAdmin = false;
        boolean isLoggedIn = true;
        boolean isOwner = false;

        System.out.println("(isAdmin && isLoggedIn) = " + (isAdmin && isLoggedIn) + ". Do I reveal the hidden portal? " +(isAdmin && isLoggedIn));



        for(int i = 5; i <= 15; i += 1) {
            System.out.println("i is " + i);
        }

        for(int i = 0; i<= 100; i += 2){
            System.out.println(i);
        }
        for(int i = 100; i>= -10; i -= 5){
            System.out.println(i);
        }
        //due to int the code stops at 65536 and infinite loop outputs 0, changed int to long

        for(long i = 2; i<1000000; i *= i ){
            System.out.println(i);
        }

        //FIZZ BUZZ
        for(int i = 1; i<=100; i++){
                if ((i % 5 == 0) && (i % 3 == 0)){
                    System.out.println("FIZZBUZZ");
                } else if (i % 5 == 0){
                    System.out.println("BUZZ");
                } else if (i % 3 == 0){
                    System.out.println("FIZZ");
                } else {
                    System.out.println(i);
                }
        }

        //TABLE OF POWERS
        Scanner sc = new Scanner(System.in);

        System.out.println("What number would you like to go up to?\n");
        int stopAt = sc.nextInt();

        System.out.println("Here is your table!\n \n number | squared | cubed\n ------ | ------- | ----- ");
        for(int i = 1; i< stopAt; i++) {
            //System.out.println(i);
            float squared = i * i;
            float cubed = i * i * i;
            System.out.println( i + "       |" + squared + "    |" + cubed);
        }







        //LETTER GRADE OUTPUT


        System.out.println("What is your overall grade? 1 - 100");
        int grade = sc.nextInt();

        if (grade >= 88) {
            System.out.println("You got got an A! :)");
        } else if (grade <=87 && grade >= 80) {
            System.out.println("You got a B!");
        } else if (grade <=79 && grade >= 67) {
            System.out.println("You got a C!");
        } else if (grade <=66 && grade >= 60) {
            System.out.println("You got a D!");
        } else if (grade <=59) {
            System.out.println("You got a F! :(");
        }






    }
}
