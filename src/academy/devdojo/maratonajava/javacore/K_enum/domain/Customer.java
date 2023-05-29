package academy.devdojo.maratonajava.javacore.K_enum.domain;

public class Customer {
    private String name;
    private CustomerType customerType;

    public Customer(String name, CustomerType customerType) {
        this.name = name;
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerType=" + customerType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
