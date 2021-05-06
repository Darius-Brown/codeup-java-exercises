package util;

import java.util.Scanner;

public class Input {
//    create a class named Input that has a private property named scanner
    private Scanner scanner;

    
     String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("type input here");
        String input = sc.next();
        if(input.equals("")){
            return input;
        }else {
            return "Not a string";
        }
    }

    public boolean yesNo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Yes or No");
        String input = sc.next();
        if(input.equalsIgnoreCase("yes")|| input.equalsIgnoreCase("y")){
            return true;
        } else return false;
    }

//    public int getInt(int min, int max){
//
//    }
//    public int getInt(){
//
//    }
//    public double getDouble(double min, double max){
//
//    }
//    public double getDouble(){
//
//    }

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