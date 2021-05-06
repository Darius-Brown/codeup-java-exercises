package AbstractClassesAndInterfaces;

public class Custodian extends Employee{


    public Custodian(String name, String department, int id){
        super(name, department, id);
    }

    public String work(){
        return "Sweeping the office floor...";
    }

    public String morningMeeting(){
        return "there is no meeting";
    }

    public String lunchTime() {
        return "noon";
    }

    public int dailyPay() {
        return 200;
    }
}
