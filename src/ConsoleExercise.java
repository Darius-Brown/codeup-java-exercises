import java.util.Scanner;

public class ConsoleExercise {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %f \n", pi);

        Scanner sc = new Scanner(System.in);

        System.out.println("Pick a number between -2,147,483,648 to 2,147,483,647.");
        int userNumber = sc.nextInt();

        System.out.println("Type 3 words please.");
        String threeWords = sc.nextLine();

        System.out.println("Type a sentence please.");
        String newSentence = sc.nextLine();

        System.out.println("Length of the classroom?");
        double length = sc.nextInt();

        System.out.println("Width of the classroom?");
        double width = sc.nextInt();

        double area = length * width;
        double perimeter = (length + width) * 2;
        System.out.printf("Area is " + "area", area);

    }
}
