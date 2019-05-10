package api;

import person.Person;

public class PersonApi {

    public Person createPerson() {
        return new Person("Hans", 22);
    }
}