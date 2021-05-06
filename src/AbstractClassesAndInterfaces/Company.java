package AbstractClassesAndInterfaces;

public class Company {

    public static void main(String[] args) {
        Employee numberBot = new Accountant("numberBot", "Accounting", 001);
        Employee realHuman = new Accountant("John", "Accounting", 002);
        Employee cleaner = new Custodian("Juan", "Maintenence", 003);

        System.out.println(numberBot.name);
        System.out.println(numberBot.id);
        System.out.println(numberBot.department);
        System.out.println(numberBot.work());

        System.out.println(realHuman.name);
        System.out.println(realHuman.id);

        System.out.println(cleaner.work());
    }
}
