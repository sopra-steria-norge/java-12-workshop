package client;

import api.PersonApi;
import person.Person;

public class Client {
    public static void main(String... args) {
        PersonApi api = new PersonApi();
        Person person = api.createPerson();
        System.out.println(person);
    }
}