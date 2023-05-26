package academy.devdojo.maratonajava.javacore.H_inheritance.domain;

public class Person {
    public String name;
    protected String cpf;
    protected Address address;

    static {
        System.out.println("Person - Within the STATIC initialization block");
    }

    {
        System.out.println("Person - Within the initialization block - 01");
    }

    {
        System.out.println("Person - Within the initialization block - 02");
    }
    public Person(String name) {
        this.name = name;
        System.out.println("Person - Within the constructor");
    }


    public Person(String name, String cpf) {
        this(name);
        this.cpf = cpf;
        System.out.println("Person - Within the constructor");
    }

    public String getName() {
        return name;
    }

    public void printData() {
        System.out.println("Name: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Address: " + this.address.getStreet() + ", " + this.address.getZipCode());
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
