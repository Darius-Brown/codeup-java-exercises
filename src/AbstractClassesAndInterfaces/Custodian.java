package AbstractClassesAndInterfaces;

public class Custodian extends Employee{


    public Custodian(String name, String department, int id){
        super(name, department, id);
    }

    public String work(){
        return "Sweeping the office floor...";
    }
}
