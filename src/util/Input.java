package util;

import java.util.Scanner;

public class Input {

    //    create a class named Input that has a private property named scanner
    private Scanner scanner;

    
    static String getString(String s){
        Scanner sc = new Scanner(System.in);
        Integer integer = Integer.valueOf(s);
        Double aDouble = Double.valueOf(s);
        System.out.println("type input here");
        String input = sc.next();
        try {
            return input;
        } catch (ArithmeticException e) {
            return String.valueOf(integer);
        } catch (Exception e){
            return String.valueOf(aDouble);

    }

    static boolean yesNo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Yes or No");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("yes")|| input.equalsIgnoreCase("y")){
            return true;
        } else return false;
    }

    static int getInt(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 25");
        int input = sc.nextInt();
            if (input >= min && input <= max){
                System.out.println("The entered number is in range");
            } else return getInt(0,25);

        return input;
    }
    static int getInt(){
        System.out.println("Type any int");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    static double getDouble(double min, double max){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number between 0 and 25");
        double input = sc.nextDouble();
        if (input >= min && input <= max){
            System.out.println("The entered number is in range");
        } else return getDouble(0,25);
        return input;
    }
    static double getDouble(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type any decimal number");
        double input = sc.nextDouble();
        return input;
    }

}
//
//
//    Create an input validation class
//
//Create a package inside of src named util. Inside of util, create a class named Input that has a private property named scanner. When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:
//
//        String getString()
//        boolean yesNo()
//        int getInt(int min, int max)
//        int getInt()
//        double getDouble(double min, double max)
//        double getDouble()
//
//        The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//
//        The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
//
//        Create another class named InputTest that has a static main method that uses all the methods from the Input class.