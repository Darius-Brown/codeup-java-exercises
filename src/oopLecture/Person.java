package oopLecture;

public class Person {
    public String firstName;
    public String lastName;
    public String middleName;

    public Person() {
        System.out.println("A Person is being created!");
    }

    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    public String joinsChat(){
        return lastName + ", " + middleName + " " + firstName + " has joined the chat!";
    }

    public static long worldPopulation = 7_500_000_000L;
    public String name;
    public String starter;

    public static void main(String[] args){
        Person dano = new Person();
        dano.firstName = "Daniel";
        dano.lastName = "Dano";
        dano.middleName = "D";
        System.out.println(dano.sayHello());
        System.out.println(dano.joinsChat());


        Person pokemonLeagueChampion = new Person();
        pokemonLeagueChampion.name = "Lance";
        pokemonLeagueChampion.starter = "Drantini";

        Person.worldPopulation += 1;

        System.out.println(Person.worldPopulation);

        System.out.println(pokemonLeagueChampion.name);
        System.out.println("The Champion " + pokemonLeagueChampion.name + " started out with only one companion, " + pokemonLeagueChampion.starter);

        Person Mike = new Person();
        Person Tom = new Person();

 }


}