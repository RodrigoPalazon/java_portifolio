package academy.devdojo.maratonajava.javacore.K_enum.domain;

public class Customer {
    private String name;
    private CustomerType customerType;
    private PaymentType paymentType;

    public Customer(String name, CustomerType customerType, PaymentType paymentType) {
        this.name = name;
        this.customerType = customerType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerType=" + customerType.getReportName() +
                ", customerTypeInt=" + customerType.getValue() +
                ", paymentType=" + paymentType +
                '}';
    }

}
