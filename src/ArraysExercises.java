import java.util.Arrays;

public class ArraysExercises {


    public static void Person (){
        String[] Person = new String[3];
        Person[0] = "Me";
        Person[1] = "You";
        Person[2] = "Y'all";

        for(String names : Person){
            System.out.println("The looped people are " + names);
        }
    }

    //public static void addPerson(String name){
    //    return (name + Person[0]);
    //}

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));








    }
}
