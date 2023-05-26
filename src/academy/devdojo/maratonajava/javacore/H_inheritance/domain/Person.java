package academy.devdojo.maratonajava.javacore.H_inheritance.domain;

public class Person {
    private String name;
    private String cpf;
    private Address address;

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
