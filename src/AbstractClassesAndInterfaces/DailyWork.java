package AbstractClassesAndInterfaces;

public interface DailyWork {
    String businessHours = "9:00 - 5:00, Monday to Friday";

    String work();
    String morningMeeting();
    String lunchTime();

    int dailyPay();
}
