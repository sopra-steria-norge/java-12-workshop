package person;

public class Person {

    private final String name;
    private final int age;

    public Person (final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age;
    }
}