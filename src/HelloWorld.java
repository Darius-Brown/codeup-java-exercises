public class HelloWorld {
    public static void main(String[] var0) {

        System.out.println("Hello, World!");

//
//* Exercises
//
//You should complete all of the following inside of your main method from the previous exercise. After each step, compile and run your code.
//
//    Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 97;
        System.out.println(myFavoriteNumber);
//    Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString;
//        System.out.println(myString);
//    Change your code to assign a character value to myString. What do you notice?
         myString = "Hello Codeup!";
         System.out.println(myString);
//    Change your code to assign the value 3.14159 to myString. What happens?
//        myString = 3.14156;
//    Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        long myNumber;
//        System.out.println(myNumber);
//    Change your code to assign the value 3.14 to myNumber. What do you notice?
//        myNumber = 3.14;
//    Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        myNumber = 123L;
//        System.out.println(myNumber);
//    Change your code to assign the value 123 to myNumber.
//        myNumber = 123;
//    Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//        casting
//    Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        float myNumber = 3.14F;  //add the F for float at the end of number
//    Copy and paste the following code blocks one at a time and execute them

//int x = 5;
//System.out.println(x++);
//System.out.println(x);
//
//int x = 5;
//System.out.println(++x);
//System.out.println(x);
//
//What is the difference between the above code blocks? Explain why the code outputs what it does.
// the declaration of ++ before x results in printing the result of the operator
//Try to create a variable named class. What happens?
//final class;
//Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
// cannot cast a string to and integer
//String theNumberThree = "three";
//Object o = theNumberThree;
//int three = (int) o;

//Copy and paste the code above and then run it. Does the result match with your expectation?
//
//How is the above example different from the code block below?
// the above code stores a string in an object
//int three = (int) "three";
//this code declares an integer with a value of a string
//What are the two different types of errors we are observing?
// incompatible types, string cannot be converted
//Rewrite the following expressions using the relevant shorthand assignment operators:
//
//int x = 4;
//x += 5;
//
//int x = 3;
//int y = 4;
//y *= x;
//
//int x = 10;
//int y = 2;
//x /= y;
//y -= x;

//What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//
//Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
    }
};