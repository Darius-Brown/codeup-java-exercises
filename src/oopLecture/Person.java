package oopLecture;

//public class Person {
//    public String firstName;
//    public String lastName;
//    public String joinsChat(){
//        return lastName + ", " + firstName + " has joined the chat!";
//
//    }
//
//public static class Arithmetic {
//        // static property
//        public static double pi = 3.14159;
//
//        // static methods
//        public static int add(int x, int y) {
//            return x + y;
//        }
//
//        public static int multiply(int x, int y) {
//            return x * y;
//        }
//    }
//
//public static class MathTest {
//        public static void main(String[] args) {
//            //Arithmetic.pi; // 3.14159
//
//            System.out.println(Arithmetic.add(5, 5));      // 10
//            System.out.println(Arithmetic.multiply(5, 5)); // 25
//        }
//    }

public class Person{
    public String firstName;
    public String lastName;

    public String getName(){
    //TODO: return the person's name
        return lastName + ", " + firstName + " has joined the chat!";
    }

        public void setName(String name){
    //TODO: change the name property to the passed value
            new Person();
        }
        public void sayHello(){
    //TODO: print a message to the console using the person's name
            System.out.println();
        }


    public static void main(String[] args){
//        Person db = new Person();
//        System.out.println(db);
//
//        String myName = "Darius";
//
//        db.firstName = myName;
//        db.lastName = "Brown";
//
//        System.out.println("db.firstName = " + db.firstName);
//        System.out.println("db.lastName = " + db.lastName);
//
//        Person vanessa = new Person();
//        vanessa.firstName = "Vanessa";
//        vanessa.lastName = "Noriega";
//
//        Person zoro = new Person();
//        zoro.firstName = "Roronoa";
//        zoro.lastName = "Zoro";
//
//        System.out.println("db.firstName = " + db.firstName);
//        System.out.println("db.joinsChat() = " + db.joinsChat());
//
//        System.out.println("Zoro's name = " + zoro.firstName);
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);



    }


}
