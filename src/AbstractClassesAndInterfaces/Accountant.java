package AbstractClassesAndInterfaces;

public class Accountant extends Employee{

    public Accountant(String name, String department, int id){
        super(name, department, id);
    }
    public String work(){
        return "TPS reports drafted, whatever that means";
    }//now we fill in details
}
