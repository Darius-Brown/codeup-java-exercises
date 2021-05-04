public class Person {
    private String name;

    public String getName(){
        return name;
    }

    public void setName (String name){
        this.name = name;
        System.out.println("last name is " + name);
    }

    public Person(String args) {
        Person name = new Person("Darius");
        System.out.println(name.getName());
        name.setName("Brown");
    }
}
