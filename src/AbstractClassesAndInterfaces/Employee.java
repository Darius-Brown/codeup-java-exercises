package AbstractClassesAndInterfaces;

abstract class Employee implements DailyWork{
    protected String name;
    protected String department;
    protected int id;

   public Employee(String name, String department, int id){
       this.name = name;
       this.department = department;
       this.id = id;
   }

//    public abstract String work(); // Blank method - our classes that inherit will fill in details


}
