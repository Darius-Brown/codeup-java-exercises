package oopLecture;

class Student {
    public String name;
    public String cohort;

//    public Student(String studentName){
//        System.out.println("New student joins class..");
//        cohort = "Unassigned";
//    }
//
//    public Student(String studentName, String assignedCohort){
//        name = studentName;
//        cohort = assignedCohort;
//    }
//
//    public String getInfo(){
//        return String.format("name: %s, cohort: %s", name, cohort);
//    }
    public Student(String name){
        this(name, "Unassisgned");
    }

    public Student(String name, String cohort){
        this.name = name;
        this.cohort = cohort;
    }

    public String sayHello(){
        return "Hello from " +this.name + "!";
    }

    public static void main(String[] args) {
        Student s1 = new Student("Student 1");
        Student s2 = new Student("Student 2", "Nibiru");
        System.out.println(s1.sayHello());
        System.out.println(s2.sayHello());
//        System.out.println(s1.getInfo());
//        System.out.println(s2.getInfo());
    }
}
