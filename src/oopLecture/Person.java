package oopLecture;

public class Person {
    public String firstName;
    public String lastName;
    public String joinsChat(){
        return lastName + ", " + firstName + " has joined the chat!";
    }



    public static void main(String[] args){
        Person db = new Person();
        System.out.println(db);

        String myName = "Darius";

        db.firstName = myName;
        db.lastName = "Brown";

        System.out.println("db.firstName = " + db.firstName);
        System.out.println("db.lastName = " + db.lastName);

        Person vanessa = new Person();
        vanessa.firstName = "Vanessa";
        vanessa.lastName = "Noriega";

        Person zoro = new Person();
        zoro.firstName = "Roronoa";
        zoro.lastName = "Zoro";

        System.out.println("db.firstName = " + db.firstName);
        System.out.println("db.joinsChat() = " + db.joinsChat());

        System.out.println("zoro = " + zoro.firstName);

        class Arithmetic {
            // static property
            public static double pi = 3.14159;

            // static methods
            public static int add(int x, int y) {
                return x + y;
            }

            public static int multiply(int x, int y) {
                return x * y;
            }
        }

        class MathTest {
            public static void main(String[] args) {
                Arithmetic.pi; // 3.14159

                Arithmetic.add(5, 5);      // 10
                Arithmetic.multiply(5, 5); // 25
            }
        }


    }


}
