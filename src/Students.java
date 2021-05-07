import java.util.ArrayList;
import java.util.Arrays;

public class Students {

    // returns the student's name
    public String getName(String input) {
        return input;
    }

    // adds the given grade to the grades property
    public static ArrayList<Integer> addGrade(int grade) {
        ArrayList<Integer> grades = new ArrayList<>(Arrays.asList());
        grades.add(grade);
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        return 0;
    }


    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Mike", "Chris", "Darius", "Jack"));
        System.out.println(students);
        System.out.println(addGrade(50));
        System.out.println(addGrade(60));
    }
}
