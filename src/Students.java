import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class Students {

    // returns the student's name
    public String getName(String input) {
        return input;
    }

    // adds the given grade to the grades property
//    public static ArrayList<Integer> addGrade(List<Integer> grades) {
//        return grades.add();
//    }

    // returns the average of the students grades
    public double getGradeAverage() {
        return 0;
    }


    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Mike", "Chris", "Darius", "Jack"));
        System.out.println(students);
        ArrayList<Integer> grades = new ArrayList<>(Arrays.asList(55,100,100,90));
        ArrayList<Integer> newGrades = new ArrayList<>();

        newGrades.add(55);
        newGrades.add(100);
        System.out.println(grades);
        System.out.println(newGrades);


    }
}


