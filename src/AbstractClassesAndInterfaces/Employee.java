package AbstractClassesAndInterfaces;

abstract class Employee {
    protected String name;
    protected String department;
    protected int id;

    public abstract String work(); // Blank method - our classes that inherit will fill in details


   public Employee(String name, String department, int id){
       this.name = name;
       this.department = department;
       this.id = id;
   }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDepartment(){
        return department;
    }




}
