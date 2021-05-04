import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person[] persons = new Person[3];
        persons[0] = new Person("Me");
        persons[1] = new Person("You");
        persons[2] = new Person("Y'all");

        for(int i = 0; i < persons.length; i++){
            System.out.println("My friends name's are, " + persons[i]);
        }

    }

    public static Person[] addPerson(Person[] people, Person person){
        Person[] newPersons = Arrays.copyOf(people, people.length);
        newPersons[newPersons.length -1] = person;
        return newPersons;
    }



}
