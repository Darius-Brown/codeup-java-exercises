import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Hello, Methods");
//        // ------ DEFINING AND CALLING METHODS WITH VARIOUS INPUTS
//        sayGreeting();
//        sayInput("Hello, Class!");
//        System.out.println(getGreetingWithName("Marco"));
//        System.out.println(returnProductOfThreeNumbers(1,2,3));
//        System.out.println(getGreetingWithName("Greetings, ","Douglas"));
//        //countToLoop(100);
//        countTo100(1);
        System.out.println(Add(2,4));
        System.out.println(Subtract(10, 6));
        System.out.println(Multiply(10, 5));
        System.out.println(Divide(100, 10));
        System.out.println(Modulus(100,1));
        //System.out.println(getInteger(1, 10));
        System.out.println("Please enter a number between 1 & 10.");
//        double factorial = sc.nextInt();
//        System.out.println(factorial);
        System.out.println(getFactorial(sc.nextInt()));
    }

//    //no inputs and no outputs
//    public static void sayGreeting(){
//        System.out.println(getDefaultGreeting());
//    }
//
//    // no returned output with input
//    public static void sayInput(String input) {
//        System.out.println(input);
//    }
//
//    // return output without input
//    public static String getDefaultGreeting(){
//        return "Hello, ";
//    }
//
//    // return output with input
//    public static String getGreetingWithName(String name) {
//        return getDefaultGreeting() + " " + name;
//    }
//
//    // return output with input using numbers
//    public static double returnProductOfThreeNumbers(double num1, double num2, double num3) {
//        double result = num1 * num2 * num3;
//        return result;
//    }
//
//    //Method Overloading
//
//    public static String getGreetingWithName(String salutation, String name){
//        return salutation + name;
//    }
//
//    // Recursion
//
//    public static void countToLoop(int num) {
//        for (int i = 0; i <= num; i++){
//            System.out.println(i);
//        }
//    }
//
//    public static int countTo100(int num) {
//        System.out.println(num);
//        if(num == 100) {
//            return num;
//        } else {
//            return countTo100(++num);
//        }
//    }


    public static double Add(double a,double b){
        double result = a + b;
        return result;
    }

    public static double Subtract(double a,double b){
        double result = a - b;
        return result;
    }

    public static double Multiply(double a,double b){
        double result = a * b;
        return result;
    }

    public static double Divide(double a,double b){
        double result = a / b;
        return result;
    }

    public static double Modulus(double a,double b){
        double result = a % b;
        return result;
    }

//    public static void getInteger(int min, int max) {
//        if (min >= 1) {
//            return 1;
//        } else if (max <= 20) {
//            return 20;
//        } return System.out.println("finished");
//    }

    public static float getFactorial(int fac){
        long result = 1;
//        if (fac <= 10 & fac >=1){
            for (int i = 1; i < fac; i++) {
                return i *= result;
            }
//        }
        return result;
    }


}


