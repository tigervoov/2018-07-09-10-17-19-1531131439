package practice09;

public class Person {
    private int id;
    private String name;
    private int age;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            return id == person.id;
        }
        return false;
    }


    public Person(){

    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public String introduce(){
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }
}
