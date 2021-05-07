import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class GradesApplication {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<Integer> > students = new HashMap<>();
        students.put("Darius", new ArrayList<>(Arrays.asList(100, 100, 100, 100, 100, 100)) );
        students.put("Mike", new ArrayList<>(Arrays.asList(70, 50, 100, 70, 90, 70)) );
        students.put("Chris", new ArrayList<>(Arrays.asList(90, 100, 80, 90, 100, 70)) );
        students.put("Jack", new ArrayList<>(Arrays.asList(50, 70, 50, 70, 100, 60)) );

        System.out.println(students.get("Darius"));
        System.out.println(students.get("Mike"));
        System.out.println(students.get("Chris"));
        System.out.println(students.get("Jack"));

        System.out.println("Who's grades do you want to search for?");
        String key = sc.next();
        System.out.println(students.get(key));
        System.out.println("Continue?");
        if (sc.next().equalsIgnoreCase("yes")){
            System.out.println("Who's grades do you want to search for?");
            System.out.println(students.get(sc.next()));
        }
    }
}
