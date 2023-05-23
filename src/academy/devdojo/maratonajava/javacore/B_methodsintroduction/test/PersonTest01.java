package academy.devdojo.maratonajava.javacore.B_methodsintroduction.test;

import academy.devdojo.maratonajava.javacore.B_methodsintroduction.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Bonito");
        person.setAge(32);

        System.out.println(person.getName());
        System.out.println(person.getAge());
//        person.printData();
    }
}
