package AbstractClassesAndInterfaces;

public class Accountant extends Employee{

    public Accountant(String name, String department, int id){
        super(name, department, id);
    }
    public String work(){
        return "TPS reports drafted, whatever that means";
    }//now we fill in details

    public String morningMeeting(){
        return "Accountants meeting run from 6:00 am to 6:45am.";
    }

    public String lunchTime(){
        return "Accountants take lunch anytime at their desk";
    }

    public int dailyPay(){
        return 500;
    }
}
